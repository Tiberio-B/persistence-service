package it.sogei.svildep.dto.ricerca;

import it.sogei.svildep.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RicercaIstanzaPerSoggettoDto extends SvildepDto {

    private String tipoSoggettoId;

    private String codiceFiscale;

}
