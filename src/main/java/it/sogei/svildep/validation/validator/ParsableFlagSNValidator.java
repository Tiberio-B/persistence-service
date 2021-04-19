package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.validation.annotation.ParsableFlagSN;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagSNValidator implements
        ConstraintValidator<ParsableFlagSN, String> {

    @Override
    public void initialize(ParsableFlagSN field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagSN.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
