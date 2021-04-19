package it.sogei.svildep.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class IstanzaDto extends SvildepDto {

    private String inserimentoManuale;

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;

    private String categoriaDeposito;

    private String stato;

    private String rtsRicevente;
    private String rtsCompetente;

}
