package it.sogei.svildep.dto.ricerca;

import it.sogei.svildep.dto.SvildepDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public abstract class RicercaIstanzaDto extends SvildepDto {

    private String dataDa;
    private String dataA;

    private String tipoId;
    private String statoId;

    private String numeroDepositoNazionaleDa;
    private String numeroDepositoNazionaleA;

    private String categoriaDepositoId;

    private String inserimentoManuale;

    private String numeroRichiestaPadre;

    private String conMandatoRestituzione;

    private RicercaIstanzaPerSoggettoDto ricercaIstanzaPerSoggettoDto;

}
