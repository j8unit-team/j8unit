package org.j8unit.showcase.jm;

import org.junit.Assert;
import org.junit.Test;

public interface ITest1 {

    @Test
    public default void testFoo() {
        final Foo sut = new Foo();
        // ...
        Assert.assertTrue(true);
    }

    @Test
    public default void testBar() {
        final Bar sut = new Bar();
        // ...
        Assert.assertTrue(true);
    }

}
