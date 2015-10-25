package org.j8unit.showcase.jm;

import org.junit.Test;

public interface OldStyleTest1 {

    @Test
    public default void testFoobar1() {
        final Foobar sut = new Foobar();
        ReusableTests.testFoobar1(sut);
    }

    @Test
    public default void testFoobar2() {
        final Foobar sut = new Foobar();
        ReusableTests.testFoobar2(sut);
    }

}
