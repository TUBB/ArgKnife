package com.tubb.argknife.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by tubingbing on 16/5/4.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface FrgmtArg {
    boolean required() default true;
    String key() default "";
}
