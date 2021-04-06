package it.sogei.svildep.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.sogei.svildep.exception.SvildepException;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class JsonOperation {

    private JsonOperation() {
        throw new IllegalStateException("Questa è una classe di utilità non va istanziata!!!");
    }

    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> String objectToJson(T obj) throws SvildepException {
        String jsonString = "";

        try {
            jsonString = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Errore durante la conversione da oggetto {} a string json: {}",e);
            throw new SvildepException(e);
        }

        return jsonString;
    }

    public static <T> T jsonToObject(String jsonString, Class<T> clazz) throws SvildepException {
        T obj = null;
        try {
            obj = mapper.readValue(jsonString, clazz);
        } catch (JsonProcessingException e) {
            log.error("Errore durante la conversione da stringa json a oggetto {}: {}",e);
            throw new SvildepException(e);
        }

        return obj;
    }

}
