package org.j8unit;

import java.util.Objects;
import java.util.function.Supplier;
import org.junit.internal.ArrayComparisonFailure;

/**
 * <p>
 * In addition to the JUnit's {@link org.junit.Assert} this extension provides {@link Supplier}-based assertion methods.
 * In result, it is possible to defer the message creation until required (or even skip creation unless necessary).
 *
 * Further, the message may be provided as a more general {@link CharSequence}. Similar to the aforementioned methods
 * the {@link CharSequence}-based assertion methods give you more flexibility and allow deferred message creation.
 * </p>
 *
 * <p>
 * To be honest, all the methods currently just delegate to the origin {@link String}-based methods of
 * {@linkplain org.junit.Assert the JUnit Assert class}. Nevertheless, you can use them by now; The next version will
 * contain smart implementations too. Promised.
 * </p>
 *
 * @since 4.12
 */
public class Assert
extends org.junit.Assert {

    protected Assert() {
    }

    /*
     * CharSequence-based assert-methods:
     */

    private static final Supplier<? extends CharSequence> supply(final CharSequence cs) {
        return () -> cs;
    }

    public static void assertTrue(final CharSequence message, final boolean condition) {
        assertTrue(supply(message), condition);
    }

    public static void assertFalse(final CharSequence message, final boolean condition) {
        assertFalse(supply(message), condition);
    }

    public static void fail(final CharSequence message) {
        fail(supply(message));
    }

    public static void assertEquals(final CharSequence message, final Object expected, final Object actual) {
        assertEquals(supply(message), expected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final Object unexpected, final Object actual) {
        assertNotEquals(supply(message), unexpected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final long unexpected, final long actual) {
        assertNotEquals(supply(message), unexpected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final double unexpected, final double actual, final double delta) {
        assertNotEquals(supply(message), unexpected, actual, delta);
    }

    public static void assertArrayEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    public static void assertEquals(final CharSequence message, final double expected, final double actual, final double delta) {
        assertEquals(supply(message), expected, actual, delta);
    }

    public static void assertEquals(final CharSequence message, final float expected, final float actual, final float delta) {
        assertEquals(supply(message), expected, actual, delta);
    }

    public static void assertNotEquals(final CharSequence message, final float unexpected, final float actual, final float delta) {
        assertNotEquals(supply(message), unexpected, actual, delta);
    }

    public static void assertEquals(final CharSequence message, final long expected, final long actual) {
        assertEquals(supply(message), expected, actual);
    }

    @Deprecated
    public static void assertEquals(final CharSequence message, final double expected, final double actual) {
        assertEquals(supply(message), expected, actual);
    }

    public static void assertNotNull(final CharSequence message, final Object object) {
        assertNotNull(supply(message), object);
    }

    public static void assertNull(final CharSequence message, final Object object) {
        assertNull(supply(message), object);
    }

    public static void assertSame(final CharSequence message, final Object expected, final Object actual) {
        assertSame(supply(message), expected, actual);
    }

    public static void assertNotSame(final CharSequence message, final Object unexpected, final Object actual) {
        assertNotSame(supply(message), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals) {
        assertEquals(supply(message), expecteds, actuals);
    }

    /*
     * Supplier-based assert-methods:
     */

    private static final String resolve(final Supplier<? extends CharSequence> supplier) {
        return (supplier == null) ? null : Objects.toString(supplier.get(), null);
    }

    public static void assertTrue(final Supplier<? extends CharSequence> message, final boolean condition) {
        assertTrue(resolve(message), condition);
    }

    public static void assertFalse(final Supplier<? extends CharSequence> message, final boolean condition) {
        assertFalse(resolve(message), condition);
    }

    public static void fail(final Supplier<? extends CharSequence> message) {
        fail(resolve(message));
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        assertNotEquals(resolve(message), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final long unexpected, final long actual) {
        assertNotEquals(resolve(message), unexpected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final double unexpected, final double actual, final double delta) {
        assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual, final double delta) {
        assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final float expected, final float actual, final float delta) {
        assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final float unexpected, final float actual, final float delta) {
        assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final long expected, final long actual) {
        assertEquals(resolve(message), expected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual) {
        assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotNull(final Supplier<? extends CharSequence> message, final Object object) {
        assertNotNull(resolve(message), object);
    }

    public static void assertNull(final Supplier<? extends CharSequence> message, final Object object) {
        assertNull(resolve(message), object);
    }

    public static void assertSame(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        assertSame(resolve(message), expected, actual);
    }

    public static void assertNotSame(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        assertNotSame(resolve(message), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals) {
        assertEquals(resolve(message), expecteds, actuals);
    }

}
