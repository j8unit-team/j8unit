package org.j8unit;

import java.util.function.Supplier;
import org.junit.internal.ArrayComparisonFailure;

/**
 * In addition to the JUnit's {@link org.junit.Assert} this Assert extension provides {@link Supplier}-based assertion
 * methods.
 */
public class Assert
extends org.junit.Assert {

    protected Assert() {
    }

    public static void assertTrue(final Supplier<String> message, final boolean condition) {
        if (!condition) {
            fail(message);
        }
    }

    public static void assertFalse(final Supplier<String> message, final boolean condition) {
        assertTrue(message, !condition);
    }

    public static void fail(final Supplier<String> message) {
        fail(message == null ? null : message.get());
    }

    public static void assertEquals(final Supplier<String> message, final Object expected, final Object actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    public static void assertNotEquals(final Supplier<String> message, final Object unexpected, final Object actual) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<String> message, final long unexpected, final long actual) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<String> message, final double unexpected, final double actual, final double delta) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual, delta);
    }

    public static void assertArrayEquals(final Supplier<String> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final Supplier<String> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals, delta);
    }

    public static void assertEquals(final Supplier<String> message, final double expected, final double actual, final double delta) {
        assertEquals(message == null ? null : message.get(), expected, actual, delta);
    }

    public static void assertEquals(final Supplier<String> message, final float expected, final float actual, final float delta) {
        assertEquals(message == null ? null : message.get(), expected, actual, delta);
    }

    public static void assertNotEquals(final Supplier<String> message, final float unexpected, final float actual, final float delta) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual, delta);
    }

    public static void assertEquals(final Supplier<String> message, final long expected, final long actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<String> message, final double expected, final double actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    public static void assertNotNull(final Supplier<String> message, final Object object) {
        assertNotNull(message == null ? null : message.get(), object);
    }

    public static void assertNull(final Supplier<String> message, final Object object) {
        assertNull(message == null ? null : message.get(), object);
    }

    public static void assertSame(final Supplier<String> message, final Object expected, final Object actual) {
        assertSame(message == null ? null : message.get(), expected, actual);
    }

    public static void assertNotSame(final Supplier<String> message, final Object unexpected, final Object actual) {
        assertNotSame(message == null ? null : message.get(), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<String> message, final Object[] expecteds, final Object[] actuals) {
        assertEquals(message == null ? null : message.get(), expecteds, actuals);
    }

}
