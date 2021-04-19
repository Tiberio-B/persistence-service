package it.sogei.svildep.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class MessageDto {

    private String content;

    private HttpStatus status;

    public boolean isError() { return this.getStatus().isError(); }

    public static MessageDto inserimento() { return new MessageDto("ok", HttpStatus.CREATED); }
}
