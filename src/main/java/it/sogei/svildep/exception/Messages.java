package it.sogei.svildep.exception;

public interface Messages {

    String erroreSoggettoUlteriore = "Il soggetto ulteriore specificato non presenta alcuni campi obbligatori.";

    String soggettoNonPresente = "Uno o più dei soggetti specificati non e' censito.";

    String erroreData = "La data acquisita non e' valida.";
    String erroreTimestamp = "Il timestamp acquisito non e' valido.";
    String erroreImporto = "L'importo acquisito non e' valido.";
    String erroreCategoriaDeposito = "La categoria deposito acquisita non e' valida.";
    String erroreQualitaRichiedente = "La qualita' richiedente acquisita non e' valida.";
    String erroreSesso = "Il sesso  acquisito non e' valido.";
    String erroreSiNo = "Il flag Si/No acquisito non e' valido.";
    String erroreStatoIstanza = "Lo stato istanza acquisito non e' valido.";
    String erroreTipoCatasto = "Il tipo catasto acquisito non e' valido.";
    String erroreTipoCoinvolgimento = "Uno o più dei tipi coinvolgimento acquisiti non e' valido.";
    String erroreTipoDirittoSoggetto = "Il tipo diritto acquisito non e' valido.";
    String erroreTipoIstanza = "Il tipo istanza acquisito non e' valido.";
    String erroreTipoSede = "Il tipo sede acquisito non e' valido.";
    String erroreTipoSoggetto = "Il tipo soggetto acquisito non e' valido.";
    String erroreIdentificativoNumerico = "L'identificativo numerico acquisito non e' valido.";
    String erroreDescrizioneOpera = "La descrizione opera acquisita non è valida.";
    String erroreBeneEspropriato = "Il bene espropriato acquisito non è valido.";
    String erroreCfPiva = "Il codice fiscale o la partita IVA acquisito/a non e' valido/a.";

    String erroreNome = "Il nome acquisito non e' valido.";
    String erroreCognome = "Il cognome acquisito non e' valido.";

    String tipoIstanza = "E' necessario specificare il tipo di istanza.";

    String idRTSInoltro = "La RTS per l'inoltro acquisita non è valida.";
    String soggettoRtsCompetenteId = "La RTS di competenza acquisita non è valida.";

    String inserimento = "Inserimento effettuato con successo.";

    String numeroRichiesta = "E' necessario specificare il numero della richiesta.";

    String qualitaRichiedente = "E' necessario specificare la qualita' del richiedente.";

    String datiCatastali = "E' necessario specificare i dati catastali.";
    String proprietariCatastali = "E' necessario specificare almeno un proprietario catastale";
    String tipoCatasto = "E' necessario specificare il tipo del catasto.";
    String sezioneUrbana = "E' necessario specificare la sezione urbana.";
    String foglioCatasto = "E' necessario specificare il foglio del catasto.";
    String subalternoCatasto = "E' necessario specificare il subalterno del catasto.";
    String particellaCatasto = "E' necessario specificare la particella del catasto.";

    String comune = "E' necessario specificare il comune.";

    String causaleDeposito = "E' necessario specificare la causale del deposito.";

    String numeroProtocollo = "E' necessario specificare il numero del protocollo.";
    String dataProtocollo = "E' necessario specificare la data del protocollo";

    String dataRichiesta = "E' necessario specificare la data della richiesta.";

    String descrizioneOpera = "E' necessario specificare la descrizione dell'opera.";

    String invalidDtoCode = "invalidDto";
    String invalidDtoMessage = "Il corpo della richiesta non è un DTO valido.";

    String invalidIdCode = "invalidId";
    String invalidIdMessage = "L'id acquisito non è un numero valido.";

    String invalidDateMessage = "La data specificata non è una data valida.";

    String invalidQualitaRichiedenteCode = "invalidQualitaRichiedente";
    String invalidQualitaRichiedenteMessage = "La qualita' richiedente specificata non è valida.";

}
