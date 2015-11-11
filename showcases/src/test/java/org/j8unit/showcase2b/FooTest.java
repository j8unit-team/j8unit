package org.j8unit.showcase2b;

import org.junit.Assert;
import org.junit.Test;

public abstract class FooTest {

    @Test
    public void fooTest() {
        System.out.println("Executing test fooTest() of class FooTest.");
        Assert.assertTrue(true);
    }

}
