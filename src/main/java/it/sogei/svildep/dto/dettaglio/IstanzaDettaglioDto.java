package it.sogei.svildep.dto.dettaglio;

import it.sogei.svildep.dto.IstanzaDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IstanzaDettaglioDto extends IstanzaDto {

    private List<IstanzaDettaglioSoggettoDto> dettaglioSoggettoDtos;


}
