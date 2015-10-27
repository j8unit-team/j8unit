package org.j8unit.showcase.jm;

import org.junit.Test;

public class OldStyleTest1 {

    @Test
    public void testFoobar1() {
        final Foobar sut = new Foobar();
        ReusableTests.testFoobar1(sut);
    }

    @Test
    public void testFoobar2() {
        final Foobar sut = new Foobar();
        ReusableTests.testFoobar2(sut);
    }

}
