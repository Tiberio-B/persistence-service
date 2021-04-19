package it.sogei.svildep.dto.common;

import it.sogei.svildep.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NascitaDto extends SvildepDto {

    private String provincia;
    private String comune;
    private String statoEstero;
}
