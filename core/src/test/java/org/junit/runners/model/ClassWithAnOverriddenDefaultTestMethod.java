package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

public class ClassWithAnOverriddenDefaultTestMethod
implements InterfaceWithADefaultTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", ClassWithAnOverriddenDefaultTestMethod.class.getSimpleName());

    @Override
    @Test
    public void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

}
