package it.sogei.svildep.service;

import it.sogei.svildep.dto.dettaglio.*;
import it.sogei.svildep.dto.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.dto.ricerca.RicercaIstanzaPerSoggettoDto;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.mapper.common.IndirizzoMapper;
import it.sogei.svildep.mapper.dettaglio.DittaIndividualeMapper;
import it.sogei.svildep.mapper.dettaglio.IstanzaDettaglioMapper;
import it.sogei.svildep.mapper.dettaglio.SoggettoFisicoMapper;
import it.sogei.svildep.mapper.dettaglio.SoggettoGiuridicoMapper;
import it.sogei.svildep.mapper.ricerca.IstanzaTrovataMapper;
import it.sogei.svildep.mapper.ricerca.RicercaIstanzaMapper;
import it.sogei.svildep.repository.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Getter
@RequiredArgsConstructor
public class IstanzaService implements IIstanzaService {

    private final IstanzaRepository istanzaRepository;

    private final CoinvolgimentoSoggettoRepository coinvolgimentoSoggettoRepository;
    private final SoggettoFisicoRepository soggettoFisicoRepository;
    private final SoggettoGiuridicoRepository soggettoGiuridicoRepository;
    private final TipoSoggettoRepository tipoSoggettoRepository;

    private final IndirizzoRepository indirizzoRepository;
    private final SedeRepository sedeRepository;

    private final SoggettoFisicoMapper soggettoFisicoMapper;
    private final SoggettoGiuridicoMapper soggettoGiuridicoMapper;
    private final DittaIndividualeMapper dittaIndividualeMapper;

    private final IndirizzoMapper indirizzoMapper;

    private final IstanzaDettaglioMapper istanzaDettaglioMapper;
    private final RicercaIstanzaMapper ricercaIstanzaMapper;
    private final IstanzaTrovataMapper istanzaTrovataMapper;

    private List<IstanzaDettaglioSoggettoDto> getCoinvolgimenti(Istanza istanza) throws SvildepException {
        List<IstanzaDettaglioSoggettoDto> soggetti = new ArrayList<>();
        coinvolgimentoSoggettoRepository.findByIstanza(istanza).forEach(coinvolgimentoSoggetto -> {
            soggetti.add(findSoggetto(coinvolgimentoSoggetto));
        });
        return soggetti;
    }

    private IstanzaDettaglioSoggettoDto findSoggetto(CoinvolgimentoSoggetto coinvolgimentoSoggetto) throws SvildepException {
        IstanzaDettaglioSoggettoDto soggettoDto = null;
        Soggetto soggetto = coinvolgimentoSoggetto.getSoggetto();
        if (soggetto == null) { throw new SvildepException(Messages.soggettoNonPresente); }
        switch (soggetto.getTipoSoggetto().getCodiceTipo()) {
            case TSF: {
                soggettoDto = findSoggettoFisico(soggetto);
                break;
            }
            case TSG: {
                soggettoDto = findSoggettoGiuridico(soggetto);
                break;
            }
            case TSD: {
                soggettoDto = findDittaIndividuale(soggetto);
                break;
            }
        }
        soggettoDto.setTipo(soggetto.getTipoSoggetto().getDescrizioneTipoSoggetto());
        soggettoDto.setCodiceFiscale(soggetto.getCodiceFiscale());
        soggettoDto.setTipoCoinvolgimento(coinvolgimentoSoggetto.getTipoCoinvolgimentoSoggetto().getDescrizioneTipo());
        return soggettoDto;
    }

    private IstanzaDettaglioSoggettoGiuridicoDto findSoggettoGiuridico(Soggetto soggetto) throws SvildepException {
        AtomicReference<IstanzaDettaglioSoggettoGiuridicoDto> reference = new AtomicReference<>();
        soggettoGiuridicoRepository.findBySoggetto(soggetto).ifPresentOrElse(soggettoGiuridico -> {
            IstanzaDettaglioSoggettoGiuridicoDto soggettoGiuridicoDto = soggettoGiuridicoMapper.mapEntityToDto(soggettoGiuridico);
            indirizzoRepository.findBySoggetto(soggetto).ifPresentOrElse(indirizzo -> {
                soggettoGiuridicoDto.setIndirizzo(indirizzoMapper.mapEntityToDto(indirizzo));
            }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
            sedeRepository.findBySoggettoGiuridico(soggettoGiuridico).ifPresentOrElse(sede -> {
                soggettoGiuridicoDto.setProgressivoSede(sede.getProgressivoSede().toString());
                soggettoGiuridicoDto.setTipoSede(sede.getTipoSede().getDescrizioneTipoSede());
            }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
            reference.set(soggettoGiuridicoDto);
        }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
        return reference.get();
    }

    private IstanzaDettaglioSoggettoFisicoDto findSoggettoFisico(Soggetto soggetto) throws SvildepException {
        AtomicReference<IstanzaDettaglioSoggettoFisicoDto> reference = new AtomicReference<>();
        soggettoFisicoRepository.findBySoggetto(soggetto).ifPresentOrElse(soggettoFisico -> {
            IstanzaDettaglioSoggettoFisicoDto soggettoFisicoDto = soggettoFisicoMapper.mapEntityToDto(soggettoFisico);
            indirizzoRepository.findBySoggetto(soggetto).ifPresent(value -> soggettoFisicoDto.setIndirizzo(indirizzoMapper.mapEntityToDto(value)));
            reference.set(soggettoFisicoDto);
        }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
        return reference.get();
    }

    private IstanzaDettaglioDittaIndividualeDto findDittaIndividuale(Soggetto soggetto) throws SvildepException {
        AtomicReference<IstanzaDettaglioDittaIndividualeDto> reference = new AtomicReference<>();
        soggettoGiuridicoRepository.findBySoggetto(soggetto).ifPresentOrElse(soggettoGiuridico -> {
            IstanzaDettaglioDittaIndividualeDto dittaIndividualeDto = dittaIndividualeMapper.mapEntityToDto(soggettoGiuridico);
            sedeRepository.findBySoggettoGiuridico(soggettoGiuridico).ifPresentOrElse(sede -> {
                Comune comune = sede.getIndirizzo().getComune();
                dittaIndividualeDto.setComuneSedeId(comune.getDenominazioneComune());
                dittaIndividualeDto.setProvinciaSedeId(comune.getProvincia().getDenominazioneProvincia());
            }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
            reference.set(dittaIndividualeDto);
        }, () -> { throw new SvildepException(Messages.soggettoNonPresente); });
        return reference.get();
    }

    public List<IstanzaTrovataDto> getAll() { return istanzaTrovataMapper.mapEntityToDto(istanzaRepository.findAll()); }

    public IstanzaDettaglioDto get(Long id) throws SvildepException {
        Istanza istanza = istanzaRepository.findById(id).orElse(null);
        IstanzaDettaglioDto dto = istanzaDettaglioMapper.mapEntityToDto(istanza);
        dto.setDettaglioSoggettoDtos(getCoinvolgimenti(istanza));
        return dto;
    }

    public List<IstanzaTrovataDto> find(RicercaIstanzaDto ricercaIstanzaDto) throws SvildepException {
        Istanza istanzaExample = ricercaIstanzaMapper.mapDtoToEntity(ricercaIstanzaDto);
        LocalDate dataDa = LocalDate.parse(ricercaIstanzaDto.getDataDa());
        LocalDate dataA = LocalDate.parse(ricercaIstanzaDto.getDataA());
        long numeroDepositoNazionaleDa = Long.parseLong(ricercaIstanzaDto.getNumeroDepositoNazionaleDa());
        long numeroDepositoNazionaleA = Long.parseLong(ricercaIstanzaDto.getNumeroDepositoNazionaleA());
        List<Istanza> istanzeTrovate = istanzaRepository.findByQuery(
                dataDa, dataA,
                numeroDepositoNazionaleDa, numeroDepositoNazionaleA
        );
//        List<Istanza> istanzeTrovate = istanzaRepository.findByQuery(
//                dataDa, dataA,
//                numeroDepositoNazionaleDa, numeroDepositoNazionaleA,
//                istanzaExample.getTipo().getId(), istanzaExample.getStato().getId(), istanzaExample.getCategoriaDeposito().getId(),
//                istanzaExample.getInserimentoManuale()
//        );
        // TODO(ricercaIstanzaDto.getRicercaIstanzaPerSoggettoDto());
        return istanzaTrovataMapper.mapEntityToDto(istanzeTrovate);
    }

    private List<Istanza> TODO(RicercaIstanzaPerSoggettoDto ricercaIstanzaPerSoggettoDto, List<Istanza> istanzeTrovate) {
        long tipoSoggettoId = Long.parseLong(ricercaIstanzaPerSoggettoDto.getTipoSoggettoId());
        switch (tipoSoggettoRepository.findById(tipoSoggettoId).orElseThrow(() -> {
            throw new SvildepException(Messages.erroreIdentificativoNumerico);
        }).getCodiceTipo()) {
            case TSF: {
                // filtra per Cognome, Nome, DDN
            }
            case TSG: {
                // filtra per String pIva, String ragioneSociale,
                // long progressivoSedeDa, long progressivoSedeA, long tipoSedeId
            }
            case TSD: {
                // filtra per String cognome, String nome, String pIva, String denominazione
            }
        }
        return istanzeTrovate;
    }

}
