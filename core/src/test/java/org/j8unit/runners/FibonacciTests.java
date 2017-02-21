package org.j8unit.runners;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public abstract interface FibonacciTests {

    public default int fib(final int c) {
        return (c < 2) ? c : fib(c - 1) + fib(c - 2);
    }

    @Test
    public default void someStupidTest() {
        assertTrue(true);
    }

}
