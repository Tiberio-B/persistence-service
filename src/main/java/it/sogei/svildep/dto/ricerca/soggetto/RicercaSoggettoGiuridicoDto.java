package it.sogei.svildep.dto.ricerca.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaSoggettoGiuridicoDto extends RicercaSoggettoDto {

    private String ragioneSociale;
    private String partitaIva;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSede;

}

