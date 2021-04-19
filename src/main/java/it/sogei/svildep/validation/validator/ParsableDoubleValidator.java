package it.sogei.svildep.validation.validator;

import it.sogei.svildep.validation.annotation.ParsableDouble;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableDoubleValidator implements
        ConstraintValidator<ParsableDouble, String> {

    @Override
    public void initialize(ParsableDouble field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            Double.parseDouble(field);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
