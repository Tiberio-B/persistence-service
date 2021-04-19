package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagTipoSedeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoSedeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoSede {
    String message() default Messages.erroreTipoSede;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
