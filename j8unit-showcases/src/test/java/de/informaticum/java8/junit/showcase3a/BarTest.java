package de.informaticum.java8.junit.showcase3a;

import org.junit.Assert;
import org.junit.Test;

public interface BarTest {

    @Test
    public default void barTest() {
        System.out.println("Executing test barTest() of interface BarTest.");
        Assert.assertTrue(true);
    }

}
