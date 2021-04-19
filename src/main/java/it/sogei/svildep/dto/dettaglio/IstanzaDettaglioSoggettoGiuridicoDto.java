package it.sogei.svildep.dto.dettaglio;

import it.sogei.svildep.dto.common.IndirizzoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDettaglioSoggettoGiuridicoDto extends IstanzaDettaglioSoggettoDto {

    private String ragioneSociale;
    private String naturaGiuridica;
    private String partitaIva;
    private String cciaa;
    private String progressivoSede;
    private String tipoSede;
    private String denominazione;
    private IndirizzoDto indirizzo;

}
