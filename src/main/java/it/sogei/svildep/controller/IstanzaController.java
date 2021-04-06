package it.sogei.svildep.controller;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.service.impl.IstanzaServiceImpl;
import it.sogei.svildep.util.JsonOperation;
import javafx.util.Pair;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("istanze")
@RequiredArgsConstructor
public class IstanzaController {

    private final IstanzaServiceImpl service;

    @PostMapping
    public ResponseEntity<MessageDto> post(@RequestBody String[] entities, BindingResult bindingResult)
            throws SvildepException {
        // getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        Istanza istanza = JsonOperation.jsonToObject(entities[0], Istanza.class);
        ArrayList<CoinvolgimentoSoggetto> coinvolgimenti = JsonOperation.jsonToObject(entities[1], ArrayList.class);
        service.insert(istanza, coinvolgimenti);
        MessageDto messageDto = MessageDto.inserimento();
        return ResponseEntity.status(messageDto.getStatus()).body(messageDto);
    }

    public ResponseEntity<MessageDto> post1(@RequestBody String json, BindingResult bindingResult)
            throws SvildepException {
        // getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        Pair<Object, Object> map = JsonOperation.jsonToObject(json, Pair.class);
        service.insert((Istanza) map.getKey(), (ArrayList<CoinvolgimentoSoggetto>) map.getValue());
        MessageDto messageDto = MessageDto.inserimento();
        return ResponseEntity.status(messageDto.getStatus()).body(messageDto);
    }


    public ResponseEntity<MessageDto> post(@RequestBody Map<Long, List<CoinvolgimentoSoggetto>> map, BindingResult bindingResult)
            throws SvildepException {
        // getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        service.insert((Istanza) map.get(1), (List<CoinvolgimentoSoggetto>) map.get(2));
        MessageDto messageDto = MessageDto.inserimento();
        return ResponseEntity.status(messageDto.getStatus()).body(messageDto);
    }


}
