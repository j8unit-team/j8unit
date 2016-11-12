package org.j8unit.repository.java.lang.annotation;

import java.util.function.UnaryOperator;

public @interface AnnotationWithUnaryOperatorField {

    public static final UnaryOperator<String> BAR = s -> "bar";

    public String value() default "";

}
