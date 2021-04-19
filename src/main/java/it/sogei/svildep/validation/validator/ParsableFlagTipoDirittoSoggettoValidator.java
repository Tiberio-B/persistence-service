package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoDirittoSoggetto;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoDirittoSoggetto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoDirittoSoggettoValidator implements
        ConstraintValidator<ParsableFlagTipoDirittoSoggetto, String> {

    @Override
    public void initialize(ParsableFlagTipoDirittoSoggetto field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoDirittoSoggetto.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
