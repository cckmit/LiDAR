package com.lq.lidar.common.annotation;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

/**
 * @author LQ
 */
//@Pattern(regexp = "^1[3|4|5|7|8][0-9]\\d{8}$")
@Pattern(regexp = "^1[3-9]\\d{9}$")
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
