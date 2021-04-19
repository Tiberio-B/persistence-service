package it.sogei.svildep.validation.validator;

import it.sogei.svildep.validation.annotation.ParsableLong;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableLongValidator implements
        ConstraintValidator<ParsableLong, String> {

    @Override
    public void initialize(ParsableLong field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            Long.parseLong(field);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
