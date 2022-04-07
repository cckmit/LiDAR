package com.lq.lidar.common.annotation;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

/**
 * @author LQ
 */
//@Pattern(regexp = "^1[3|4|5|7|8][0-9]\\d{8}$")
@ConstraintComposition(CompositionType.OR)
@Pattern(regexp = "^1[3-9]\\d{9}$")
@Length(min = 0, max = 0)
@Null
@Documented
@Constraint(
        validatedBy = {}
)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface Mobile {
    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};
}
