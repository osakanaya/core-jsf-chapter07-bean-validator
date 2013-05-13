package com.corejsf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=LuhnCheckValidator.class)
public @interface LuhnCheck {
	String message() default "{com.corejsf.LuhnCheck.message}";
	@SuppressWarnings("rawtypes")
	Class[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
