package com.extraordinaria.pideya.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DeliveryDateValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDeliveryDate {
    String message() default "Invalid delivery date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}