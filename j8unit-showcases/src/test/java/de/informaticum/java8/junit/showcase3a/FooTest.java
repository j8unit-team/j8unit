package de.informaticum.java8.junit.showcase3a;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import de.informaticum.j8junit.runners.J8BlockJUnit4ClassRunner;

@RunWith(J8BlockJUnit4ClassRunner.class)
public class FooTest {

    @Test
    public void fooTest() {
        System.out.println("Executing test fooTest() of class FooTest.");
        Assert.assertTrue(true);
    }

}
