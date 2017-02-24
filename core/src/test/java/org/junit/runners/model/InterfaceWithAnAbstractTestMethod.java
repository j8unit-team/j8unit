package org.junit.runners.model;

import org.junit.Test;

public abstract interface InterfaceWithAnAbstractTestMethod {

    @Test
    public abstract void someAbstractTest();

}
