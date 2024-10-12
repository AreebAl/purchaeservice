package com.botswana.purchaseservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatValidator implements ConstraintValidator<DateFormat, Date> {
    private String dateFormat;

    @Override
    public void initialize(DateFormat constraintAnnotation) {
        this.dateFormat = constraintAnnotation.format();
    }

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext context) {
        if (date == null) {
            return true; // Null values are considered valid
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            // Try to parse the date to check if it follows the expected format
            sdf.parse(sdf.format(date));
        } catch (ParseException e) {
            return false; // Invalid date format
        }

        return true; // Valid date format
    }
}
