package org.j8unit.showcase2c;

import org.junit.Assert;
import org.junit.Test;

public abstract class FooTest {

    @Test
    public void fooTest() {
        System.out.println("Executing test fooTest() of class FooTest.");
        Assert.assertTrue(true);
    }

    @Test
    public void barTest() {
        System.out.println("Executing test barTest() of class FooTest.");
        Assert.assertTrue(true);
    }

}
