package org.j8unit.showcase.jm;

import org.j8unit.J8UnitTest;
import org.junit.Assert;
import org.junit.Test;

public interface ITest2
extends J8UnitTest<Foobar> {

    @Test
    public default void testFoobar1() {
        final Foobar sut = this.createNewSUT();
        // ...
        Assert.assertTrue(true);
    }

    @Test
    public default void testFoobar2() {
        final Foobar sut = this.createNewSUT();
        // ...
        Assert.assertTrue(true);
    }

}
