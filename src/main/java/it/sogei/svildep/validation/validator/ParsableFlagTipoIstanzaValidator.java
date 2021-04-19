package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoIstanza;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoIstanza;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoIstanzaValidator implements
        ConstraintValidator<ParsableFlagTipoIstanza, String> {

    @Override
    public void initialize(ParsableFlagTipoIstanza field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoIstanza.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
