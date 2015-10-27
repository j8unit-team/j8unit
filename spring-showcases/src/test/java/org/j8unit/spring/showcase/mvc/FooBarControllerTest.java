package org.j8unit.spring.showcase.mvc;

import org.j8unit.J8UnitTest;
import org.junit.Assert;
import org.junit.Test;

public interface FooBarControllerTest
extends J8UnitTest<FooBarController> {

    @Test
    public default void testFoo() {
        final FooBarController subjectUnderTest = createNewSUT();
        Assert.assertEquals("bar", subjectUnderTest.foo());
    }
}
