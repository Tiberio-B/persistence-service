package it.sogei.svildep.dto.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DittaIndividualeDto extends SoggettoDto {

    private String partitaIva;
    private String denominazione;
    private String provinciaSede;
    private String comuneSede;

}
