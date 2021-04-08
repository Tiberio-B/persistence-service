package it.sogei.svildep.dto.ricerca.istanza;

import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.dto.ricerca.soggetto.RicercaSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RicercaIstanzaDto<S extends RicercaSoggettoDto> extends IstanzaDto {

    private String modalitaTrasmissione;

    private String dataDa;
    private String dataA;

    private String idStato;
    private String numeroRichiestaPadre;

    private String numeroDepositoNazionaleDa;
    private String numeroDepositoNazionaleA;

    private String esproprio;
    private String conMandatoRestituzione;

    private S soggettoDto;

}
