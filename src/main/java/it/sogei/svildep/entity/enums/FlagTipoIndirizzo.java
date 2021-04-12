package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoIndirizzo {

    TIR("Residenza"),
    TID("Domicilio");

    public String descrizione;
}
