package it.sogei.svildep.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto{

    private Boolean inserimentoManuale;

    private String qualitaRichiedenteId;
    private String tipoId;
    private String statoId;

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;

    private String categoriaDepositoId;

}
