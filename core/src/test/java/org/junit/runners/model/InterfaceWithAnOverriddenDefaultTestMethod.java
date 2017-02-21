package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assert.fail;
import org.junit.Test;

public abstract interface InterfaceWithAnOverriddenDefaultTestMethod
extends InterfaceWithADefaultTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", InterfaceWithAnOverriddenDefaultTestMethod.class.getSimpleName());

    @Override
    @Test
    public default void someTest() {
        fail(FAILURE_TOKEN);
    }

}
