package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagStatoIstanzaValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagStatoIstanzaValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagStatoIstanzaSoggetto {
    String message() default Messages.erroreStatoIstanza;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
