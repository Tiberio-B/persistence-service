package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagTipoSoggettoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoSoggettoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoSoggetto {
    String message() default Messages.erroreTipoSoggetto;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
