package it.sogei.svildep.controller.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.service.ricerca.RicercaIstanzaService;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Component
@NoArgsConstructor
public abstract class RicercaIstanzaController<D extends RicercaIstanzaDto> {

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> search(@Valid @RequestBody D requestDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(getService().cerca(requestDto));
    }

    public abstract RicercaIstanzaService<D> getService();

}
