package it.sogei.svildep.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "NUME_ID_UTENTE_INSERIMENTO")
    private Long numeIdUtenteInserimento;

    @Column(name = "DTTM_TIMESTAMP_INSERIMENTO")
    private LocalDateTime dttmTimestampInserimento;

    @Column(name = "NUME_ID_UTENTE_AGGIORNAMENTO")
    private Long numeIdUtenteAggiornamento;

    @Column(name = "DTTM_TIMESTAMP_AGGIORNAMENTO")
    private LocalDateTime dttmTimestampAggiornamento;

}
