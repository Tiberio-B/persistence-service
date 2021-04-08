package it.sogei.svildep.dto.ricerca.istanza;

import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.dto.RtsDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaTrovataDto extends IstanzaDto {

    private String modalitaTrasmissione;

    private RtsDto rtsRicevente;
    private RtsDto rtsCompetente;

    private String numeroRichiestPadre;
    private String numeroNazionaleDeposito;
    private String numeroMandatoRestituzione;

}
