package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagCA {

    C("Chiuso"),
    A("Aperto");

    public String descrizione;
}
