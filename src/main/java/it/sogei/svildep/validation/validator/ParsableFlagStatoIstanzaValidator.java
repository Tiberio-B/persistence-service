package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.validation.annotation.ParsableFlagStatoIstanza;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagStatoIstanzaValidator implements
        ConstraintValidator<ParsableFlagStatoIstanza, String> {

    @Override
    public void initialize(ParsableFlagStatoIstanza field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagStatoIstanza.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
