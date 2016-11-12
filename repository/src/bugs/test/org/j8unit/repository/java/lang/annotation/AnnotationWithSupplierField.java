package org.j8unit.repository.java.lang.annotation;

import java.util.function.Supplier;

public @interface AnnotationWithSupplierField {

    public static final Supplier<String> FOO = () -> "foo";

    public String value() default "";

}
