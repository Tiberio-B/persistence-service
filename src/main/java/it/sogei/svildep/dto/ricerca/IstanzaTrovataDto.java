package it.sogei.svildep.dto.ricerca;

import it.sogei.svildep.dto.IstanzaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaTrovataDto extends IstanzaDto {

    private String tipoIstanza;

    private String numeroRichiestPadre;

    private String numeroNazionaleDeposito;

    private String qualitaRichiedente;
    private String nomeRichiedente;
    private String cfRichiedente;

    private String numeroMandatoRestituzione;

}
