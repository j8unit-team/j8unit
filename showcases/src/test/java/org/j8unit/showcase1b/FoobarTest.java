package org.j8unit.showcase1b;

import org.j8unit.runners.J8BlockJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(J8BlockJUnit4ClassRunner.class)
public class FoobarTest
extends FooTest
implements BarTest {

    @Test
    public void foobarTest() {
        System.out.println("Executing test foobarTest() of class FoobarTest.");
        Assert.assertTrue(true);
    }

    @Override
    @Test
    public void barTest() {
        System.out.println("Executing test barTest() of class FoobarTest.");
        Assert.assertTrue(true);
    }

}
