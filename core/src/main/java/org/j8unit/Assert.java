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

    public static void assertTrue(final CharSequence message, final boolean condition) {
        assertTrue(Objects.toString(message, null), condition);
    }

    public static void assertFalse(final CharSequence message, final boolean condition) {
        assertFalse(Objects.toString(message, null), condition);
    }

    public static void fail(final CharSequence message) {
        fail(Objects.toString(message, null));
    }

    public static void assertEquals(final CharSequence message, final Object expected, final Object actual) {
        assertEquals(Objects.toString(message, null), expected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final Object unexpected, final Object actual) {
        assertNotEquals(Objects.toString(message, null), unexpected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final long unexpected, final long actual) {
        assertNotEquals(Objects.toString(message, null), unexpected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final double unexpected, final double actual, final double delta) {
        assertNotEquals(Objects.toString(message, null), unexpected, actual, delta);
    }

    public static void assertArrayEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(Objects.toString(message, null), expecteds, actuals, delta);
    }

    public static void assertEquals(final CharSequence message, final double expected, final double actual, final double delta) {
        assertEquals(Objects.toString(message, null), expected, actual, delta);
    }

    public static void assertEquals(final CharSequence message, final float expected, final float actual, final float delta) {
        assertEquals(Objects.toString(message, null), expected, actual, delta);
    }

    public static void assertNotEquals(final CharSequence message, final float unexpected, final float actual, final float delta) {
        assertNotEquals(Objects.toString(message, null), unexpected, actual, delta);
    }

    public static void assertEquals(final CharSequence message, final long expected, final long actual) {
        assertEquals(Objects.toString(message, null), expected, actual);
    }

    @Deprecated
    public static void assertEquals(final CharSequence message, final double expected, final double actual) {
        assertEquals(Objects.toString(message, null), expected, actual);
    }

    public static void assertNotNull(final CharSequence message, final Object object) {
        assertNotNull(Objects.toString(message, null), object);
    }

    public static void assertNull(final CharSequence message, final Object object) {
        assertNull(Objects.toString(message, null), object);
    }

    public static void assertSame(final CharSequence message, final Object expected, final Object actual) {
        assertSame(Objects.toString(message, null), expected, actual);
    }

    public static void assertNotSame(final CharSequence message, final Object unexpected, final Object actual) {
        assertNotSame(Objects.toString(message, null), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals) {
        assertEquals(Objects.toString(message, null), expecteds, actuals);
    }

    public static void assertTrue(final Supplier<String> message, final boolean condition) {
        assertTrue(message == null ? null : message.get(), condition);
    }

    public static void assertFalse(final Supplier<String> message, final boolean condition) {
        assertFalse(message == null ? null : message.get(), condition);
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
