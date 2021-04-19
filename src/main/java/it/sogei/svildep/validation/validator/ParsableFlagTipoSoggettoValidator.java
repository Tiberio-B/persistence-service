package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoSoggetto;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoSoggetto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoSoggettoValidator implements
        ConstraintValidator<ParsableFlagTipoSoggetto, String> {

    @Override
    public void initialize(ParsableFlagTipoSoggetto field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoSoggetto.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
