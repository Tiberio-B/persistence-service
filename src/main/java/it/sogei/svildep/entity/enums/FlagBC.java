package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagBC {

    B("BPF"),
    C("Contanti");

    public String descrizione;
}
