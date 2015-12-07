package org.j8unit.showcase3c;

import org.j8unit.runners.J8BlockJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(J8BlockJUnit4ClassRunner.class)
public class FooTest {

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
