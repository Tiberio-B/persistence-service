package it.sogei.svildep.dto.ricerca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaIstanzaPerDittaIndividualeDto extends RicercaIstanzaPerSoggettoDto {

    private String cognome;
    private String nome;
    private String denominazioneDitta;
    private String partitaIva;

}
