package it.sogei.svildep.dto.common;

import it.sogei.svildep.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends SvildepDto {

    private String descrizioneIndirizzo;
    private String numCivico;
    private String tipoIndirizzo;

}
