package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoCatasto;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoSede;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoCatastoValidator implements
        ConstraintValidator<ParsableFlagTipoSede, String> {

    @Override
    public void initialize(ParsableFlagTipoSede field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoCatasto.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
