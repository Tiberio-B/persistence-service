package it.sogei.svildep.mapper;

import it.sogei.svildep.dto.RecapitoDto;
import it.sogei.svildep.entity.gestionesoggetti.Recapito;
import org.springframework.stereotype.Component;

@Component
public class RecapitoMapper {

    public RecapitoDto mapEntityToDto(Recapito entity) {
        RecapitoDto dto = new RecapitoDto();
        dto.setTelefono(entity.getTelefono());
        dto.setEmail(entity.getEmail());
        dto.setPec(entity.getPec());
        return dto;
    }
}
