package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagQualitaRichiedente;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_QUALITA_RICHIEDENTI")
public class QualitaRichiedente extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_QUALITA_RICHIEDENTE")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_QUALITA_RICHIEDENTE")
    private String descrizioneQualita;
    @Column(name = "CODI_CODICE_QUALITA_RICHIEDENTE")
    @Enumerated(EnumType.STRING)
    private FlagQualitaRichiedente codiceQualita;
}
