package it.sogei.svildep.dto.dettaglio;

import it.sogei.svildep.dto.common.IndirizzoDto;
import it.sogei.svildep.dto.common.NascitaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDettaglioSoggettoFisicoDto extends IstanzaDettaglioSoggettoDto {

    private String cognome;
    private String nome;
    private String sesso;
    private String dataDiNascita;
    private NascitaDto nascita;
    private IndirizzoDto indirizzo;
}
