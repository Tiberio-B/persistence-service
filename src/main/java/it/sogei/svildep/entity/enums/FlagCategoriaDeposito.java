package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagCategoriaDeposito {

    CDC("Deposito cauzionale"),
    CDG("Deposito giudiziario"),
    CDV("Deposito volontario"),
    CDE("Deposito amministrativo per esproprio"),
    CDN("Deposito amministrativo non esproprio"),
    CDD("Deposito demaniale");

    public String descrizione;
}
