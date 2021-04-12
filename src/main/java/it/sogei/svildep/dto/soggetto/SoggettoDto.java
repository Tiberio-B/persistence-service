package it.sogei.svildep.dto.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SoggettoDto {

    private String tipo;
    private String tipoCoinvolgimento;
    private String codiceFiscale;

}
