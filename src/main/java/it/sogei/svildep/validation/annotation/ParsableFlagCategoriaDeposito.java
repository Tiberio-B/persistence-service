package it.sogei.svildep.validation.annotation;


import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.ParsableFlagCategoriaDepositoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagCategoriaDepositoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagCategoriaDeposito {
    String message() default Messages.erroreCategoriaDeposito;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
