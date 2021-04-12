package it.sogei.svildep.controller;

import it.sogei.svildep.dto.IstanzaDettaglioDto;
import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.service.impl.IstanzaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("getIstanze")
@RequiredArgsConstructor
public class IstanzaController {

    private final IstanzaServiceImpl service;

    @GetMapping
    public ResponseEntity<List<IstanzaDto>> lista(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDettaglioDto> dettaglio(@PathVariable Long id) throws SvildepException {
        return ResponseEntity.ok().body(service.get(id));
    }


}
