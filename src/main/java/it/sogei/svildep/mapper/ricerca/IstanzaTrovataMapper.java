package it.sogei.svildep.mapper.ricerca;

import it.sogei.svildep.dto.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.mapper.IstanzaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaTrovataMapper extends IstanzaMapper<IstanzaTrovataDto> {

    @Override
    public IstanzaTrovataDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaTrovataDto dto = mapIstanzaToDto(entity, new IstanzaTrovataDto());
        dto.setTipoIstanza(entity.getTipo().getDescrizioneTipoIstanza());
        dto.setNumeroNazionaleDeposito(String.valueOf(entity.getDeposito().getNumeroNazionale()));
        dto.setQualitaRichiedente(entity.getQualitaRichiedente().getDescrizioneQualita());
        entity.getCoinvolgimenti().forEach(coinvolgimento -> {
            if (coinvolgimento.getTipoCoinvolgimentoSoggetto().getFlagTipoCoinvolgimento().equals(FlagTipoCoinvolgimento.CSR)) {
                Soggetto soggetto = coinvolgimento.getSoggetto();
                dto.setCfRichiedente(soggetto.getCodiceFiscale());
                dto.setNomeRichiedente(soggetto.getSoggettoFisico().getNome());
            }
        });
        //TO-DO Mandato Restituzione
        return dto;
    }
}
