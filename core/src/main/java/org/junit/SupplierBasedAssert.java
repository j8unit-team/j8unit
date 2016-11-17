package org.junit;

import static java.lang.Math.abs;
import java.util.Objects;
import java.util.function.Supplier;
import org.junit.internal.ArrayComparisonFailure;

/**
 * <p>
 * In addition to the assertion methods of {@link Assert}, this extensions allows the provision of supplied fail
 * messages which are requested if and only if an assertion fails. (In other words, the message creation is deferred
 * until needed and, thus, the costs of constructing a message parameter do not incur unless really necessary.)
 * </p>
 *
 * <p>
 * Similar to {@link Assert}, these methods can be used directly or can be referenced through static import. But in
 * order to increase flexibility even further, the usage of {@link org.j8unit.Assert} is preferred.
 * </p>
 *
 * @see org.j8unit.Assert
 */
public class SupplierBasedAssert
extends Assert {

    protected SupplierBasedAssert() {
    }

    private static final String resolve(final Supplier<? extends String> supplier) {
        return (supplier == null) ? null : supplier.get();
    }

    /**
     * Similar to {@link Assert#fail(String)}, but uses a supplied fail message.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @throws AssertionError
     *             always
     */
    public static final void fail(final Supplier<? extends String> message)
    throws AssertionError {
        Assert.fail(resolve(message));
    }

    protected static final void failNotNull(final Supplier<? extends String> message, final Object actual) {
        Assert.fail((Objects.toString(resolve(message), "") + " expected null, but was:<" + actual + ">").trim());
    }

    protected static final void failNotSame(final Supplier<? extends String> message, final Object expected, final Object actual) {
        Assert.fail((Objects.toString(resolve(message), "") + " expected same:<" + expected + "> was not:<" + actual + ">").trim());
    }

    protected static final void failSame(final Supplier<? extends String> message) {
        Assert.fail((Objects.toString(resolve(message), "") + " expected not same").trim());
    }

    protected static final void failNotEquals(final Supplier<? extends String> message, final Object expected, final Object actual) {
        Assert.fail(Assert.format(resolve(message), expected, actual));
    }

    protected static final void failEquals(final Supplier<? extends String> message, final Object actual) {
        Assert.fail(Objects.toString(resolve(message), "Values should be different") + ". Actual: " + actual);
    }

    /**
     * Similar to {@link Assert#assertTrue(String, boolean)}, but uses a supplied fail message which is requested if and
     * only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the costs
     * of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertTrue(final Supplier<? extends String> message, final boolean condition)
    throws AssertionError {
        if (!condition) {
            fail(message);
        }
    }

    /**
     * Similar to {@link Assert#assertFalse(String, boolean)}, but uses a supplied fail message which is requested if
     * and only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertFalse(final Supplier<? extends String> message, final boolean condition)
    throws AssertionError {
        assertTrue(message, !condition);
    }

    /**
     * Similar to {@link Assert#assertNull(String, Object)}, but uses a supplied fail message which is requested if and
     * only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the costs
     * of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for {@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNull(final Supplier<? extends String> message, final Object object)
    throws AssertionError {
        if (object != null) {
            failNotNull(message, object);
        }
    }

    /**
     * Similar to {@link Assert#assertNotNull(String, Object)}, but uses a supplied fail message which is requested if
     * and only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for non-{@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotNull(final Supplier<? extends String> message, final Object object)
    throws AssertionError {
        assertTrue(message, object != null);
    }

    /**
     * Similar to {@link Assert#assertSame(String, Object, Object)}, but uses a supplied fail message which is requested
     * if and only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertSame(final Supplier<? extends String> message, final Object expected, final Object actual)
    throws AssertionError {
        if (expected != actual) {
            failNotSame(message, expected, actual);
        }
    }

    /**
     * Similar to {@link Assert#assertNotSame(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotSame(final Supplier<? extends String> message, final Object unexpected, final Object actual)
    throws AssertionError {
        if (unexpected == actual) {
            failSame(message);
        }
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertEquals(Supplier, double, double, double)} instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code double} value
     * @param actual
     *            the actual {@code double} value to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends String> message, final double expected, final double actual)
    throws AssertionError {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertNotEquals(Supplier, double, double, double)}
     * instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code double} value
     * @param actual
     *            the actual {@code double} value to compare against {@code unexpected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertNotEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final Supplier<? extends String> message, final double unexpected, final double actual)
    throws AssertionError {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    protected static final boolean doubleIsDifferent(final double d1, final double d2, final double delta)
    throws AssertionError {
        return (Double.compare(d1, d2) != 0) && (abs(d1 - d2) > delta);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, double, double, double)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code double} value
     * @param actual
     *            the actual {@code double} value to compare against {@code expected}
     * @param delta
     *            the maximum delta between {@code expected} and {@code actual} for which both numbers are still
     *            considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final Supplier<? extends String> message, final double expected, final double actual, final double delta)
    throws AssertionError {
        if (doubleIsDifferent(expected, actual, delta)) {
            failNotEquals(message, Double.valueOf(expected), Double.valueOf(actual));
        }
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, double, double, double)}, but uses a supplied fail message which
     * is requested if and only if the assertion fails. (In other words, the message creation is deferred until needed
     * and, thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code double} value
     * @param actual
     *            the actual {@code double} value to compare against {@code unexpected}
     * @param delta
     *            the maximum delta between {@code expected} and {@code actual} for which both numbers are still
     *            considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final Supplier<? extends String> message, final double unexpected, final double actual, final double delta)
    throws AssertionError {
        if (!doubleIsDifferent(unexpected, actual, delta)) {
            failEquals(message, Double.valueOf(actual));
        }
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertEquals(Supplier, float, float, float)} instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code float} value
     * @param actual
     *            the actual {@code float} value to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends String> message, final float expected, final float actual)
    throws AssertionError {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertNotEquals(Supplier, float, float, float)} instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code float} value
     * @param actual
     *            the actual {@code float} value to compare against {@code unexpected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertNotEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final Supplier<? extends String> message, final float unexpected, final float actual)
    throws AssertionError {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    protected static final boolean floatIsDifferent(final float f1, final float f2, final float delta)
    throws AssertionError {
        return (Float.compare(f1, f2) != 0) && (abs(f1 - f2) > delta);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, float, float, float)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code float} value
     * @param actual
     *            the actual {@code float} value to compare against {@code expected}
     * @param delta
     *            the maximum delta between {@code expected} and {@code actual} for which both numbers are still
     *            considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final Supplier<? extends String> message, final float expected, final float actual, final float delta)
    throws AssertionError {
        if (floatIsDifferent(expected, actual, delta)) {
            failNotEquals(message, Float.valueOf(expected), Float.valueOf(actual));
        }
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, float, float, float)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code float} value
     * @param actual
     *            the actual {@code float} value to compare against {@code unexpected}
     * @param delta
     *            the maximum delta between {@code expected} and {@code actual} for which both numbers are still
     *            considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final Supplier<? extends String> message, final float unexpected, final float actual, final float delta)
    throws AssertionError {
        if (!floatIsDifferent(unexpected, actual, delta)) {
            failEquals(message, Float.valueOf(actual));
        }
    }

    /**
     * Similar to {@link Assert#assertEquals(String, long, long)}, but uses a supplied fail message which is requested
     * if and only if the assertion fails. (In other words, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code long} value
     * @param actual
     *            the actual {@code long} value to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final Supplier<? extends String> message, final long expected, final long actual)
    throws AssertionError {
        if (expected != actual) {
            failNotEquals(message, Long.valueOf(expected), Long.valueOf(actual));
        }
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, long, long)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code long} value
     * @param actual
     *            the actual {@code long} value to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final Supplier<? extends String> message, final long unexpected, final long actual)
    throws AssertionError {
        if (unexpected == actual) {
            failEquals(message, Long.valueOf(actual));
        }
    }

    /**
     * Similar to {@link Assert#assertEquals(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final Supplier<? extends String> message, final Object expected, final Object actual)
    throws AssertionError {
        if (!Objects.equals(expected, actual)) {
            if ((expected instanceof String) && (actual instanceof String)) {
                throw new ComparisonFailure(Objects.toString(resolve(message), ""), (String) expected, (String) actual);
            } else {
                failNotEquals(message, expected, actual);
            }
        }
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words, the message creation is deferred until needed and,
     * thus, the costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final Supplier<? extends String> message, final Object unexpected, final Object actual)
    throws AssertionError {
        if (Objects.equals(unexpected, actual)) {
            failEquals(message, actual);
        }
    }

    /**
     * Immediately refers to {@link #assertArrayEquals(Supplier, Object[], Object[])}.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code Object} array
     * @param actual
     *            the actual {@code Object} array to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, Object[], Object[])} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends String> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message, expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, double[], double[], double)}
     * instead! instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code double} array
     * @param actual
     *            the actual {@code double} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, double[], double[], double)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends String> message, final double[] expecteds, final double[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, double[], double[], double)] to compare floating-point numbers!");
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, float[], float[], float)}
     * instead! instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code float} array
     * @param actual
     *            the actual {@code float} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, float[], float[], float)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends String> message, final float[] expecteds, final float[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, float[], float[], float)] to compare floating-point numbers!");
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static final void assertArrayEquals(final Supplier<? extends String> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        // TODO
        Assert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

}
