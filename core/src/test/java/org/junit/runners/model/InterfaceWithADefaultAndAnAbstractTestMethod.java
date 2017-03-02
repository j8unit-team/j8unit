package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

public abstract interface InterfaceWithADefaultAndAnAbstractTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", InterfaceWithADefaultAndAnAbstractTestMethod.class.getSimpleName());

    @Test
    public default void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

    @Test
    public abstract void someAbstractTest();

}
