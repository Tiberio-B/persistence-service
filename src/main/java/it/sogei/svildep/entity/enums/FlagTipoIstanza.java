package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoIstanza {

    TIC("Istanza costituzione deposito"),
    TIR("Istanza restituzione deposito"),
    TID("Istanza decreto svincolo/reintroito");

    public String descrizione;
}
