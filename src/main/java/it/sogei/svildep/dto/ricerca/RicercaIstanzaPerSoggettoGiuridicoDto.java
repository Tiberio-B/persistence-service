package it.sogei.svildep.dto.ricerca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaIstanzaPerSoggettoGiuridicoDto extends RicercaIstanzaPerSoggettoDto {

    private String ragioneSociale;
    private String partitaIva;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSedeId;

}

