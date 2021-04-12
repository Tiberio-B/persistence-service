package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoCoinvolgimento {

    CSR("Richiedente"),
    CSP("Proprietario"),
    CSC("Ente cauzionato"),
    CSE("Autorità espropriante"),
    CSO("Autorità ordinante"),
    CSB("Presunto beneficiario"),
    CSU("Soggetto ulteriore"),
    CSD("Depositante legale"),
    CSG("General contractor");


    public String descrizione;
}
