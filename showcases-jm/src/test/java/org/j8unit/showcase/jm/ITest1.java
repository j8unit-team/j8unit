package org.j8unit.showcase.jm;

import org.junit.Assert;
import org.junit.Test;

public interface ITest1 {

    @Test
    public default void testFoobar1() {
        final Foobar sut = new Foobar();
        // ...
        Assert.assertTrue(true);
    }

    @Test
    public default void testFoobar2() {
        final Foobar sut = new Foobar();
        // ...
        Assert.assertTrue(true);
    }

}
