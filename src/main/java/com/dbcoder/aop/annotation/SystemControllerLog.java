package com.dbcoder.aop.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
    String operateTypeDesc() default "";

    long operateType() default -1;

    String moudleCode() default "M30";

    String moudleName() default "XX模块";

    String bussType() default "";

    String bussTypeDesc() default "";
}
