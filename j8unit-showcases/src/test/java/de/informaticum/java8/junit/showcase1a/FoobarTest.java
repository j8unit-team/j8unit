package de.informaticum.java8.junit.showcase1a;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import de.informaticum.j8junit.runners.J8BlockJUnit4ClassRunner;

@RunWith(J8BlockJUnit4ClassRunner.class)
public class FoobarTest
extends FooTest
implements BarTest {

    @Test
    public void foobarTest() {
        System.out.println("Executing test foobarTest() of class FoobarTest.");
        Assert.assertTrue(true);
    }

}
