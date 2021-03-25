package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.gestioneutenti.Ruolo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_ISTANZA")
public class StatoIstanza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_ISTANZA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_ISTANZA")
    private String descrizioneStatoIstanza;
    @ManyToOne
    @JoinColumn(name = "FK1_RUOLI_STATI_ISTANZA")
    private Ruolo ruolo;
}
