package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagCategoriaDeposito;
import it.sogei.svildep.validation.annotation.ParsableFlagCategoriaDeposito;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagCategoriaDepositoValidator implements
        ConstraintValidator<ParsableFlagCategoriaDeposito, String> {

    @Override
    public void initialize(ParsableFlagCategoriaDeposito field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagCategoriaDeposito.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
