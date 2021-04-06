package it.sogei.svildep.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import it.sogei.svildep.exception.SvildepException;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class JsonOperation {

    private JsonOperation() {
        throw new IllegalStateException("Questa è una classe di utilità non va istanziata!!!");
    }

    public static <T> String objectToJson(T obj) throws SvildepException {
        String jsonString = "";

        try {
            jsonString = getMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Errore durante la conversione da oggetto {} a string json: {}",e);
            throw new SvildepException(e);
        }

        return jsonString;
    }

    public static <T> T jsonToObject(String jsonString, Class<T> clazz) throws SvildepException {
        T obj = null;
        try {
            obj = getMapper().readValue(jsonString, clazz);
        } catch (JsonProcessingException e) {
            log.error("Errore durante la conversione da stringa json a oggetto {}: {}",e);
            throw new SvildepException(e);
        }

        return obj;
    }

    private static ObjectMapper getMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

}
