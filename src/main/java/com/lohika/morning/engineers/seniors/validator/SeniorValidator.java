package com.lohika.morning.engineers.seniors.validator;

import com.lohika.morning.engineers.seniors.SeniorEngineer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SeniorValidator implements Validator {

    @Override
    public boolean supports(final Class<?> clazz) {
        return SeniorEngineer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(final Object target, final Errors errors) {
        final SeniorEngineer seniorEngineer = (SeniorEngineer) target;
        final Integer yearsOfExperience = seniorEngineer.getYearsOfExperience();
        if (yearsOfExperience < 3) {
            errors.rejectValue("yearsOfExperience", "400", seniorEngineer.getFirstName() + " isn't Senior. Not " +
                    "enough yearsOfExperience.");
        }
    }
}
