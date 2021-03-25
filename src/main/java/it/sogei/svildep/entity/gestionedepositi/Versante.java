package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_VERSANTI")
public class Versante extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_VERSANTE")
    private Long id;
    @Column(name = "DESC_NOME")
    private String nome;
    @Column(name = "DESC_COGNOME")
    private String cognome;
    @Column(name = "CODI_CODICE_FISCALE")
    private String codiceFiscale;
}
