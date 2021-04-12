package it.sogei.svildep.dto.soggetto;

import it.sogei.svildep.dto.RecapitoDto;
import it.sogei.svildep.dto.geo.IndirizzoDto;
import it.sogei.svildep.dto.geo.NascitaDto;
import it.sogei.svildep.entity.gestionesoggetti.Recapito;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoFisicoDto extends SoggettoDto {


    private String cognome;
    private String nome;
    private String sesso;
    private String dataDiNascita;
    private NascitaDto nascita;
    private IndirizzoDto indirizzo;
    private RecapitoDto recapito;
}
