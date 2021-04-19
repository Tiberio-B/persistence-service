package it.sogei.svildep.dto.dettaglio;

import it.sogei.svildep.dto.common.RecapitoDto;
import it.sogei.svildep.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class IstanzaDettaglioSoggettoDto extends SvildepDto {

    private String tipo;
    private String tipoCoinvolgimento;
    private String codiceFiscale;
    private RecapitoDto recapito;

}
