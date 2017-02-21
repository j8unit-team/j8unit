package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assert.fail;

public abstract interface InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation
extends InterfaceWithADefaultTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!",
                                                      InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation.class.getSimpleName());

    @Override
    public default void someTest() {
        fail(FAILURE_TOKEN);
    }

}
