package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoSede;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoSede;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoSedeValidator implements
        ConstraintValidator<ParsableFlagTipoSede, String> {

    @Override
    public void initialize(ParsableFlagTipoSede field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoSede.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
