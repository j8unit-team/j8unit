package org.j8unit.spring.showcase.di;

import org.j8unit.SupplierBasedJ8UnitTest;
import org.j8unit.spring.showcase.di.Foo;
import org.junit.Assert;
import org.junit.Test;

public interface FooTest
extends SupplierBasedJ8UnitTest<Foo> {

    @Test
    public default void testAsString() {
        final Foo subjectUnderTest = createNewSUT();
        Assert.assertEquals("foo", subjectUnderTest.asString());
    }
}
