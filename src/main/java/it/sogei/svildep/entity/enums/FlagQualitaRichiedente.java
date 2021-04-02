package it.sogei.svildep.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagQualitaRichiedente {

    QMM("Me medesimo"),
    QTR("Titolare rappresentate legale"),
    QRU("Responsabile ufficio pubblico");

    public String descrizione;
}
