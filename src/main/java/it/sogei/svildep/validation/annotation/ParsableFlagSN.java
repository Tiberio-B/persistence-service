package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagSNValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagSNValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagSN {
    String message() default Messages.erroreSiNo;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
