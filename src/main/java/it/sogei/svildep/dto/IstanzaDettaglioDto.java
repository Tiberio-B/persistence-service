package it.sogei.svildep.dto;

import it.sogei.svildep.dto.soggetto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IstanzaDettaglioDto {

    private String numeroRichiesta;
    private String dataRichiesta;

    private String modalitaTrasmissione;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String stato;

    private String rtsInoltro;
    private String rtsCompetente;

    private String causaleDeposito;
    private String importoDeposito;

    private String categoriaDeposito;

    private List<SoggettoDto> soggetti;


}
