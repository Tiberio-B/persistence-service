package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagSessoMF;
import it.sogei.svildep.validation.annotation.ParsableFlagSessoMF;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagSessoMFValidator implements
        ConstraintValidator<ParsableFlagSessoMF, String> {

    @Override
    public void initialize(ParsableFlagSessoMF field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagSessoMF.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
