package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagTipoCoinvolgimentoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoCoinvolgimentoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoCoinvolgimento {
    String message() default Messages.erroreTipoCoinvolgimento;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
