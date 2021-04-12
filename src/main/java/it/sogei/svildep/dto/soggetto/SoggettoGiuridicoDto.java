package it.sogei.svildep.dto.soggetto;

import it.sogei.svildep.dto.RecapitoDto;
import it.sogei.svildep.dto.geo.IndirizzoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoGiuridicoDto extends SoggettoDto {

    private String ragioneSociale;
    private String naturaGiuridica;
    private String partitaIva;
    private String cciaa;
    private String progressivoSede;
    private String tipoSede;
    private String denominazione;
    private IndirizzoDto indirizzo;
    private RecapitoDto recapito;

}
