package it.sogei.svildep.controller;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioDto;
import it.sogei.svildep.dto.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.service.IstanzaService;
import it.sogei.svildep.validation.annotation.ParsableLong;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("istanze")
@RequiredArgsConstructor
public class IstanzaController {

    private final IstanzaService service;

    @GetMapping
    public ResponseEntity<List<IstanzaTrovataDto>> lista(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDettaglioDto> dettaglio(@PathVariable @ParsableLong String id, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(service.get(Long.parseLong(id)));
    }

    @PostMapping("/ricerca")
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody RicercaIstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(service.find(requestDto));
    }

}
