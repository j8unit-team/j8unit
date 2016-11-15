package org.junit;

import java.util.Objects;
import java.util.function.Supplier;
import org.j8unit.Assert;
import org.junit.internal.ArrayComparisonFailure;

public class AssertProxy
extends org.junit.Assert {

    private static final String resolve(final Supplier<? extends String> supplier) {
        return (supplier == null) ? null : supplier.get();
    }

    public static void assertTrue(final Supplier<? extends String> message, final boolean condition) {
        if (!condition) {
            fail(message);
        }
    }

    public static void assertFalse(final Supplier<? extends String> message, final boolean condition) {
        assertTrue(message, !condition);
    }

    public static void fail(final Supplier<? extends String> message) {
        Assert.fail(resolve(message));
    }

    public static void assertEquals(final Supplier<? extends String> message, final Object expected, final Object actual) {
        if (Objects.equals(expected, actual)) {
            return;
        } else if ((expected instanceof String) && (actual instanceof String)) {
            throw new ComparisonFailure(Objects.toString(resolve(message), ""), (String) expected, (String) actual);
        } else {
            failNotEquals(message, expected, actual);
        }
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final Object unexpected, final Object actual) {
        if (Objects.equals(unexpected, actual)) {
            failEquals(message, actual);
        }
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final long unexpected, final long actual) {
        if (unexpected == actual) {
            failEquals(message, Long.valueOf(actual));
        }
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final double unexpected, final double actual, final double delta) {
        if (!doubleIsDifferent(unexpected, actual, delta)) {
            failEquals(message, Double.valueOf(actual));
        }
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final Supplier<? extends String> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static void assertEquals(final Supplier<? extends String> message, final double expected, final double actual, final double delta) {
        if (doubleIsDifferent(expected, actual, delta)) {
            failNotEquals(message, Double.valueOf(expected), Double.valueOf(actual));
        }
    }

    public static void assertEquals(final Supplier<? extends String> message, final float expected, final float actual, final float delta) {
        if (floatIsDifferent(expected, actual, delta)) {
            failNotEquals(message, Float.valueOf(expected), Float.valueOf(actual));
        }
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final float unexpected, final float actual, final float delta) {
        if (!floatIsDifferent(unexpected, actual, delta)) {
            failEquals(message, Float.valueOf(actual));
        }
    }

    public static void assertEquals(final Supplier<? extends String> message, final long expected, final long actual) {
        if (expected != actual) {
            failNotEquals(message, Long.valueOf(expected), Long.valueOf(actual));
        }
    }

    /**
     * @deprecated Use {@link #assertEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static void assertEquals(final Supplier<? extends String> message, final double expected, final double actual) {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    public static void assertNotNull(final Supplier<? extends String> message, final Object object) {
        assertTrue(message, object != null);
    }

    public static void assertNull(final Supplier<? extends String> message, final Object object) {
        // TODO
        Assert.assertNull(resolve(message), object);
    }

    public static void assertSame(final Supplier<? extends String> message, final Object expected, final Object actual) {
        // TODO
        Assert.assertSame(resolve(message), expected, actual);
    }

    public static void assertNotSame(final Supplier<? extends String> message, final Object unexpected, final Object actual) {
        // TODO
        Assert.assertNotSame(resolve(message), unexpected, actual);
    }

    /**
     * @deprecated Use {@link #assertArrayEquals(Supplier, Object[], Object[])} instead!
     */
    @Deprecated
    public static void assertEquals(final Supplier<? extends String> message, final Object[] expecteds, final Object[] actuals) {
        assertArrayEquals(message, expecteds, actuals);
    }

    // TODO: Inline this method
    static private boolean doubleIsDifferent(final double d1, final double d2, final double delta) {
        if (Double.compare(d1, d2) == 0) {
            return false;
        }
        if ((Math.abs(d1 - d2) <= delta)) {
            return false;
        }

        return true;
    }

    // TODO: Inline this method
    static private boolean floatIsDifferent(final float f1, final float f2, final float delta) {
        if (Float.compare(f1, f2) == 0) {
            return false;
        }
        if ((Math.abs(f1 - f2) <= delta)) {
            return false;
        }

        return true;
    }

    // TODO: Inline this method
    private static void failEquals(final Supplier<? extends String> message, final Object actual) {
        Assert.fail(Objects.toString(resolve(message), "Values should be different") + ". Actual: " + actual);
    }

    // TODO: Inline this method
    static private void failNotEquals(final Supplier<? extends String> message, final Object expected, final Object actual) {
        Assert.fail(format(resolve(message), expected, actual));
    }

}
