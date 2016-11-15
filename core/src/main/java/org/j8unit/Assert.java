package org.j8unit;

import java.util.Objects;
import java.util.function.Supplier;
import org.junit.SupplierBasedAssert;
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

    private static final Supplier<String> supply(final CharSequence cs) {
        return () -> Objects.toString(cs, null);
    }

    public static void fail(final CharSequence message) {
        fail(supply(message));
    }

    public static void assertTrue(final CharSequence message, final boolean condition) {
        SupplierBasedAssert.assertTrue(supply(message), condition);
    }

    public static void assertFalse(final CharSequence message, final boolean condition) {
        SupplierBasedAssert.assertFalse(supply(message), condition);
    }

    public static void assertNull(final CharSequence message, final Object object) {
        SupplierBasedAssert.assertNull(supply(message), object);
    }

    public static void assertNotNull(final CharSequence message, final Object object) {
        SupplierBasedAssert.assertNotNull(supply(message), object);
    }

    public static void assertSame(final CharSequence message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertSame(supply(message), expected, actual);
    }

    public static void assertNotSame(final CharSequence message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotSame(supply(message), unexpected, actual);
    }

    /**
     * @deprecated Use {@link #assertEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertEquals(final CharSequence message, final double expected, final double actual) {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * @deprecated Use {@link #assertNotEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final CharSequence message, final double unexpected, final double actual) {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    public static void assertEquals(final CharSequence message, final double expected, final double actual, final double delta) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual, delta);
    }

    public static void assertNotEquals(final CharSequence message, final double unexpected, final double actual, final double delta) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual, delta);
    }

    /**
     * @deprecated Use {@link #assertEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertEquals(final CharSequence message, final float expected, final float actual) {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * @deprecated Use {@link #assertNotEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final CharSequence message, final float unexpected, final float actual) {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    public static void assertEquals(final CharSequence message, final float expected, final float actual, final float delta) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual, delta);
    }

    public static void assertNotEquals(final CharSequence message, final float unexpected, final float actual, final float delta) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual, delta);
    }

    public static void assertEquals(final CharSequence message, final long expected, final long actual) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final long unexpected, final long actual) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual);
    }

    public static void assertEquals(final CharSequence message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual);
    }

    public static void assertNotEquals(final CharSequence message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals) {
        SupplierBasedAssert.assertEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * @deprecated Use {@link #assertArrayEquals(Supplier, double[], double[], double)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, double[], double[], double)] to compare doubleing-point numbers!");
    }

    public static void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    /**
     * @deprecated Use {@link #assertArrayEquals(Supplier, float[], float[], float)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, float[], float[], float)] to compare floating-point numbers!");
    }

    public static void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final CharSequence message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final CharSequence message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /*
     * Supplier-based assert-methods:
     */

    private static final Supplier<String> resolve(final Supplier<? extends CharSequence> supplier) {
        return (supplier == null) ? null : supply(supplier.get());
    }

    public static void fail(final Supplier<? extends CharSequence> message) {
        fail(resolve(message));
    }

    public static void assertTrue(final Supplier<? extends CharSequence> message, final boolean condition) {
        SupplierBasedAssert.assertTrue(resolve(message), condition);
    }

    public static void assertFalse(final Supplier<? extends CharSequence> message, final boolean condition) {
        SupplierBasedAssert.assertFalse(resolve(message), condition);
    }

    public static void assertNull(final Supplier<? extends CharSequence> message, final Object object) {
        SupplierBasedAssert.assertNull(resolve(message), object);
    }

    public static void assertNotNull(final Supplier<? extends CharSequence> message, final Object object) {
        SupplierBasedAssert.assertNotNull(resolve(message), object);
    }

    public static void assertSame(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertSame(resolve(message), expected, actual);
    }

    public static void assertNotSame(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotSame(resolve(message), unexpected, actual);
    }

    /**
     * @deprecated Use {@link #assertEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual) {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * @deprecated Use {@link #assertNotEquals(Supplier, double, double, double)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final double unexpected, final double actual) {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual, final double delta) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final double unexpected, final double actual, final double delta) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    /**
     * @deprecated Use {@link #assertEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final float expected, final float actual) {
        Assert.fail("Abandoned method! Instead, use [assertEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * @deprecated Use {@link #assertNotEquals(Supplier, float, float, float)} instead!
     */
    @Deprecated
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final float unexpected, final float actual) {
        Assert.fail("Abandoned method! Instead, use [assertNotEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final float expected, final float actual, final float delta) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual, delta);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final float unexpected, final float actual, final float delta) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final long expected, final long actual) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final long unexpected, final long actual) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual);
    }

    public static void assertEquals(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual);
    }

    public static void assertNotEquals(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals) {
        SupplierBasedAssert.assertEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * @deprecated Use {@link #assertArrayEquals(Supplier, double[], double[], double)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final double[] expecteds, final double[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, double[], double[], double)] to compare doubleing-point numbers!");
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    /**
     * @deprecated Use {@link #assertArrayEquals(Supplier, float[], float[], float)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final float[] expecteds, final float[] actuals)
    throws ArrayComparisonFailure {
        Assert.fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, float[], float[], float)] to compare floating-point numbers!");
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<? extends CharSequence> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

}
