package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagQualitaRichiedenteValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagQualitaRichiedenteValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagQualitaRichiedente {
    String message() default Messages.erroreQualitaRichiedente;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
