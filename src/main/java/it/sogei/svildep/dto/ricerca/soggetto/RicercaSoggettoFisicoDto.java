package it.sogei.svildep.dto.ricerca.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaSoggettoFisicoDto extends RicercaSoggettoDto {

    private String cognome;
    private String nome;
    private String dataNascita;

}
