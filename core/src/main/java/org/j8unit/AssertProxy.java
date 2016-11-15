package org.j8unit;

import java.util.function.Supplier;
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
        // TODO
        Assert.fail(resolve(message));
    }

    public static void assertEquals(final Supplier<? extends String> message, final Object expected, final Object actual) {
        // TODO
        Assert.assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final Object unexpected, final Object actual) {
        // TODO
        Assert.assertNotEquals(resolve(message), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final long unexpected, final long actual) {
        // TODO
        Assert.assertNotEquals(resolve(message), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final double unexpected, final double actual, final double delta) {
        // TODO
        Assert.assertNotEquals(resolve(message), unexpected, actual, delta);
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
        // TODO
        Assert.assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertEquals(final Supplier<? extends String> message, final float expected, final float actual, final float delta) {
        // TODO
        Assert.assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertNotEquals(final Supplier<? extends String> message, final float unexpected, final float actual, final float delta) {
        // TODO
        Assert.assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    public static void assertEquals(final Supplier<? extends String> message, final long expected, final long actual) {
        // TODO
        Assert.assertEquals(resolve(message), expected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<? extends String> message, final double expected, final double actual) {
        // TODO
        Assert.assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotNull(final Supplier<? extends String> message, final Object object) {
        // TODO
        Assert.assertNotNull(resolve(message), object);
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

    @Deprecated
    public static void assertEquals(final Supplier<? extends String> message, final Object[] expecteds, final Object[] actuals) {
        // TODO
        Assert.assertEquals(resolve(message), expecteds, actuals);
    }

}
