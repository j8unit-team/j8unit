package org.j8unit.spring.showcase.mvc;

import org.j8unit.FactoryBasedJ8UnitTest;
import org.junit.Assert;
import org.junit.Test;

public interface FooBarControllerTest
extends FactoryBasedJ8UnitTest<FooBarController> {

    @Test
    public default void testFoo() {
        final FooBarController subjectUnderTest = createNewSUT();
        Assert.assertEquals("bar", subjectUnderTest.foo());
    }
}
