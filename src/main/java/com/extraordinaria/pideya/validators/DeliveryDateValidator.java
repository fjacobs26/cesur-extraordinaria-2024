package com.extraordinaria.pideya.validators;

import com.extraordinaria.pideya.dto.DeliveryRouteDTO;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DeliveryDateValidator implements ConstraintValidator<ValidDeliveryDate, DeliveryRouteDTO>{
    @Override
    public void initialize(ValidDeliveryDate constraintAnnotation) {
    }

    @Override
    public boolean isValid(DeliveryRouteDTO deliveryRouteDTO, ConstraintValidatorContext context) {
        if (deliveryRouteDTO.getDeliveryDate() == null) {
            return false;
        }
        // Custom validation logic (e.g., delivery date cannot be in the past)
        return !deliveryRouteDTO.getDeliveryDate().before(new Date());
    }
}
