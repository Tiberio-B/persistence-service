package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagSessoMFValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagSessoMFValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagSessoMF {
    String message() default Messages.erroreSesso;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
