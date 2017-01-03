package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

public class ClassWithAnOverriddenTestMethod
extends ClassWithATestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", ClassWithAnOverriddenTestMethod.class.getSimpleName());

    @Override
    @Test
    public void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

}
