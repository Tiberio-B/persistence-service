package it.sogei.svildep.service.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.mapper.istanza.ricerca.istanza.RicercaIstanzaMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public abstract class RicercaIstanzaService<D extends RicercaIstanzaDto>{

    public List<IstanzaTrovataDto> cerca(D istanzaRicercaDto) throws SvildepException {
        List<Object> entities = getMapper().mapDtoToEntities(istanzaRicercaDto);
        return getMapper().mapEntitiesToDtos(((List<Istanza>) new ArrayList<Istanza>()));
    }

    public abstract RicercaIstanzaMapper<D> getMapper();

}
