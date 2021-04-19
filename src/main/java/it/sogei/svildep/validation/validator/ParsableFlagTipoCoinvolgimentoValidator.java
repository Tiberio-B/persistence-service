package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.validation.annotation.ParsableFlagTipoCoinvolgimento;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagTipoCoinvolgimentoValidator implements
        ConstraintValidator<ParsableFlagTipoCoinvolgimento, String> {

    @Override
    public void initialize(ParsableFlagTipoCoinvolgimento field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoCoinvolgimento.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
