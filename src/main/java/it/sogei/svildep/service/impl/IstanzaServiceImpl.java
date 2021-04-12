package it.sogei.svildep.service.impl;

import it.sogei.svildep.dto.IstanzaDettaglioDto;
import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.dto.soggetto.DittaIndividualeDto;
import it.sogei.svildep.dto.soggetto.SoggettoDto;
import it.sogei.svildep.dto.soggetto.SoggettoFisicoDto;
import it.sogei.svildep.dto.soggetto.SoggettoGiuridicoDto;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.mapper.geo.IndirizzoMapper;
import it.sogei.svildep.mapper.istanza.IstanzaDettaglioMapper;
import it.sogei.svildep.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.mapper.soggetto.DittaIndividualeMapper;
import it.sogei.svildep.mapper.soggetto.SoggettoFisicoMapper;
import it.sogei.svildep.mapper.soggetto.SoggettoGiuridicoMapper;
import it.sogei.svildep.repository.*;
import it.sogei.svildep.service.IstanzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
public class IstanzaServiceImpl implements IstanzaService {


    private final IstanzaRepository istanzaRepository;

    private final CoinvolgimentoSoggettoRepository coinvolgimentoSoggettoRepository;
    private final SoggettoFisicoRepository soggettoFisicoRepository;
    private final SoggettoGiuridicoRepository soggettoGiuridicoRepository;

    private final IndirizzoRepository indirizzoRepository;
    private final SedeRepository sedeRepository;

    private final SoggettoFisicoMapper soggettoFisicoMapper;
    private final SoggettoGiuridicoMapper soggettoGiuridicoMapper;
    private final DittaIndividualeMapper dittaIndividualeMapper;

    private final IndirizzoMapper indirizzoMapper;

    private final IstanzaMapper istanzaMapper;

    private final IstanzaDettaglioMapper istanzaDettaglioMapper;

//    TODO: Dto diverso da quello di dettaglio, DA FARE
    public List<IstanzaDto> getAll() {
        return istanzaMapper.mapEntityToDto(istanzaRepository.findAll());
    }

    public IstanzaDettaglioDto get(Long id) {
        Istanza istanza = istanzaRepository.findById(id).orElse(null);
        IstanzaDettaglioDto dto = istanzaDettaglioMapper.mapEntityToDto(istanza);
        dto.setSoggetti(getCoinvolgimenti(istanza));
        return dto;

    }

    private List<SoggettoDto> getCoinvolgimenti(Istanza istanza) {
        List<SoggettoDto> soggetti = new ArrayList<>();
        coinvolgimentoSoggettoRepository.findByIstanza(istanza).forEach(coinvolgimentoSoggetto -> {
            soggetti.add(findSoggetto(coinvolgimentoSoggetto));
        });
        return soggetti;
    }

    private SoggettoDto findSoggetto(CoinvolgimentoSoggetto coinvolgimentoSoggetto) {
        SoggettoDto soggettoDto = null;
        Soggetto soggetto = coinvolgimentoSoggetto.getSoggetto();
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

    private SoggettoGiuridicoDto findSoggettoGiuridico(Soggetto soggetto) {
        AtomicReference<SoggettoGiuridicoDto> reference = new AtomicReference<>();
        soggettoGiuridicoRepository.findBySoggetto(soggetto).ifPresent(soggettoGiuridico -> {
            SoggettoGiuridicoDto soggettoGiuridicoDto = soggettoGiuridicoMapper.mapEntityToDto(soggettoGiuridico);
            indirizzoRepository.findBySoggetto(soggetto).ifPresent(indirizzo -> {
                soggettoGiuridicoDto.setIndirizzo(indirizzoMapper.mapEntityToDto(indirizzo));
            });
            sedeRepository.findBySoggettoGiuridico(soggettoGiuridico).ifPresent(sede -> {
                soggettoGiuridicoDto.setProgressivoSede(sede.getProgressivoSede().toString());
                soggettoGiuridicoDto.setTipoSede(sede.getTipoSede().getDescrizioneTipoSede());
            });
            reference.set(soggettoGiuridicoDto);
        });
        return reference.get();
    }

    private SoggettoFisicoDto findSoggettoFisico(Soggetto soggetto) {
        AtomicReference<SoggettoFisicoDto> reference = new AtomicReference<>();
        soggettoFisicoRepository.findBySoggetto(soggetto).ifPresent(soggettoFisico -> {
            SoggettoFisicoDto soggettoFisicoDto = soggettoFisicoMapper.mapEntityToDto(soggettoFisico);
            indirizzoRepository.findBySoggetto(soggetto).ifPresent(value -> soggettoFisicoDto.setIndirizzo(indirizzoMapper.mapEntityToDto(value)));
            reference.set(soggettoFisicoDto);
        });
        return reference.get();
    }

    private DittaIndividualeDto findDittaIndividuale(Soggetto soggetto) {
        AtomicReference<DittaIndividualeDto> reference = new AtomicReference<>();
        DittaIndividualeDto dittaIndividualeDto = new DittaIndividualeDto();
        soggettoGiuridicoRepository.findBySoggetto(soggetto).ifPresent(soggettoGiuridico -> {
            dittaIndividualeDto.setPartitaIva(soggettoGiuridico.getPartitaIVA());
            dittaIndividualeDto.setDenominazione(soggettoGiuridico.getDenominazioneDitta());
            sedeRepository.findBySoggettoGiuridico(soggettoGiuridico).ifPresent(sede -> {
                Comune comune = sede.getComune();
                dittaIndividualeDto.setComuneSede(comune.getDenominazioneComune());
                dittaIndividualeDto.setProvinciaSede(comune.getProvincia().getDenominazioneProvincia());
            });
            reference.set(dittaIndividualeDto);
        });
        return reference.get();
    }


}
