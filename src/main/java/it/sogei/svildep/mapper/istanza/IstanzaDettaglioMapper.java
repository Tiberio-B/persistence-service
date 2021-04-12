package it.sogei.svildep.mapper.istanza;

import it.sogei.svildep.dto.IstanzaDettaglioDto;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@RequiredArgsConstructor
public class IstanzaDettaglioMapper {

    public IstanzaDettaglioDto mapEntityToDto(Istanza istanza) {
        IstanzaDettaglioDto dto = new IstanzaDettaglioDto();
        dto.setNumeroRichiesta(String.valueOf(istanza.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(istanza.getDataRichiesta()));
        dto.setModalitaTrasmissione(istanza.getInserimentoManuale().equals(FlagSN.S)? "Manuale" : "Portale Servizi DAG");
        dto.setNumeroProtocollo(String.valueOf(istanza.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(istanza.getDataProtocollo()));
        dto.setStato(istanza.getStato().getDescrizione());
        dto.setImportoDeposito(String.valueOf(istanza.getImportoDeposito()));
        dto.setCausaleDeposito(istanza.getCausaleDeposito());
        dto.setCategoriaDeposito(istanza.getCategoriaDeposito().getDescrizioneCategoriaDeposito());
        dto.setRtsInoltro(istanza.getRtsInoltro().getDenominazioneRTS());
        dto.setRtsCompetente(istanza.getRtsCompetente().getDenominazioneRTS());
        return dto;
    }

}

