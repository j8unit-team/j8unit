package org.j8unit.repository.java.lang.annotation;

import java.util.concurrent.Callable;

public @interface AnnotationWithCallableField {

    public static final Callable<String> FOOBAR = () -> "foobar";

    public String value() default "";

}
