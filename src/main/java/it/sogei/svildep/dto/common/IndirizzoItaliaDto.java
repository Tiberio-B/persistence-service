package it.sogei.svildep.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoItaliaDto extends IndirizzoDto {

    private String comune;
    private String provincia;
    private String cap;
}
