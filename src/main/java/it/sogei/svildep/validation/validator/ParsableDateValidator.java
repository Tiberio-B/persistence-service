package it.sogei.svildep.validation.validator;

import it.sogei.svildep.validation.annotation.ParsableDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ParsableDateValidator implements
        ConstraintValidator<ParsableDate, String> {

    @Override
    public void initialize(ParsableDate field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            LocalDate.parse(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
