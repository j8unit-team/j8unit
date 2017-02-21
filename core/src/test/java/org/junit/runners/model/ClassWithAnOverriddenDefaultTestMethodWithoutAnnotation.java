package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;

public class ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation
implements InterfaceWithADefaultTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class.getSimpleName());

    @Override
    public void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

}
