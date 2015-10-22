package org.j8unit.showcase.jm;

import org.junit.Assert;
import org.junit.Test;

public interface ITest1 {

    @Test
    public default void testFoo() {
        // ...
        Assert.assertTrue(true);
    }

    @Test
    public default void testBar() {
        // ...
        Assert.assertTrue(true);
    }
}
