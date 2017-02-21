package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;

public class ClassWithAnOverriddenTestMethodWithoutAnnotation
extends ClassWithATestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", ClassWithAnOverriddenTestMethodWithoutAnnotation.class.getSimpleName());

    @Override
    public void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

}
