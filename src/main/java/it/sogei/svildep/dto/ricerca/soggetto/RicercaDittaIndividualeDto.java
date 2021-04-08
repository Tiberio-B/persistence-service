package it.sogei.svildep.dto.ricerca.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaDittaIndividualeDto extends RicercaSoggettoDto {

    private String cognome;
    private String nome;
    private String denominazioneDitta;
    private String partitaIva;

}
