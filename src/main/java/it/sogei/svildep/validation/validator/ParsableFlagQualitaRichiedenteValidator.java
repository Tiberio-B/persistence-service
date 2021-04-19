package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagQualitaRichiedente;
import it.sogei.svildep.validation.annotation.ParsableFlagQualitaRichiedente;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableFlagQualitaRichiedenteValidator implements
        ConstraintValidator<ParsableFlagQualitaRichiedente, String> {

    @Override
    public void initialize(ParsableFlagQualitaRichiedente field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagQualitaRichiedente.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
