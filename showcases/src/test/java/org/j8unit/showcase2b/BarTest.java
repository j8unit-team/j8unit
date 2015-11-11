package org.j8unit.showcase2b;

import org.junit.Assert;
import org.junit.Test;

public interface BarTest {

    @Test
    public default void barTest() {
        System.out.println("Executing test barTest() of interface BarTest.");
        Assert.assertTrue(true);
    }

}
