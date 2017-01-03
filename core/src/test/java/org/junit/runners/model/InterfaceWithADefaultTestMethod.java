package org.junit.runners.model;

import static java.lang.String.format;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

public abstract interface InterfaceWithADefaultTestMethod {

    public static final String FAILURE_TOKEN = format("Method of %s failed!", InterfaceWithADefaultTestMethod.class.getSimpleName());

    @Test
    public default void someTest() {
        assumeTrue(FAILURE_TOKEN, false);
    }

}
