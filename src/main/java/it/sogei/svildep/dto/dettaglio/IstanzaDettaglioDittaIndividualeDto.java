package it.sogei.svildep.dto.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDettaglioDittaIndividualeDto extends IstanzaDettaglioSoggettoDto {

    private String partitaIva;
    private String denominazione;
    private String provinciaSedeId;
    private String comuneSedeId;

}
