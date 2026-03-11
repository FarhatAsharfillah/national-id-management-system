package com.example.demo.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ValidationUtil {

    @Autowired
    private Validator validator;

    public void validate(Object any) {
        Set<ConstraintViolation<Object>> result = validator.validate(any);
        if (!result.isEmpty()) {
            throw new ConstraintViolationException(result);
        }
    }
}
