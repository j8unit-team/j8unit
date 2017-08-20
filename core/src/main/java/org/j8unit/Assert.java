package org.j8unit;

import java.util.Objects;
import java.util.function.Supplier;
import org.hamcrest.Matcher;
import org.junit.SupplierBasedAssert;

/**
 * <p>
 * In addition to the assertion methods of {@link Assert}, this extensions allows the use of supplied fail
 * messages&nbsp;&ndash; either via {@link CharSequence} {@code interface} or via {@link Supplier} API. In both cases it
 * is possible to defer the message creation until required (or even skip creation unless necessary).
 * </p>
 *
 * <p>
 * This more general approach of providing fail messages allows convenient solutions such as:
 * </p>
 *
 * <dl>
 * <dt>Skip creation unless necessary</dt>
 * <dd>
 *
 * <pre class="brush:java">
 * import static org.j8unit.Assert.*;
 * import org.junit.Test;
 *
 * public class MyTest {
 *
 *     private static String someExpensiveMessageCreation() {
 *         // do some very expensive message creation; for example:
 *         //   (1) calculate string representation of long array,
 *         //   (2) calculate string representation of deeply nested object,
 *         //   (3) query message from remote database,
 *         //   (4) ...
 *     }
 *
 *     &#64;Test
 *     public void someTest_1()
 *     throws Exception {
 *         // ...
 *         assertNotNull(() -> someExpensiveMessageCreation(), actual);
 *     }
 *
 *     &#64;Test
 *     public void someTest_2()
 *     throws Exception {
 *         // ...
 *         assertNotNull(MyTest::someExpensiveMessageCreation(), actual);
 *     }
 *
 * }
 * </pre>
 *
 * </dd>
 * <dt>Enumerating the fail messages</dt>
 * <dd>
 *
 * <pre class="brush:java">
 * import static mypackage.FailMessages.*;
 * import static org.j8unit.Assert.*;
 * import org.junit.Test;
 *
 * public class MyTest {
 *
 *     static enum FailMessages
 *     implements StringBasedCharSequence {
 *         NULL("illegal null string"),
 *         LENGTH("string has illegal length"),
 *         INVALID("malformed java identifier string"),
 *         // ... FURTHER FAIL MESSAGES HERE ...;
 *
 *         private final String msg;
 *         private FailMessages(final String msg) { this.msg = msg; }
 *         public String toString() { return this.msg; }
 *     }
 *
 *     &#64;Test
 *     public void testNotNullString()
 *     throws Exception {
 *         final String s = "...";
 *         assertNotNull(NULL, s);
 *     }
 *
 *     // ... FURTHER TESTS HERE ...
 *
 * }
 * </pre>
 *
 * </dd>
 * </dl>
 *
 * @since 4.12
 */
public class Assert
extends org.junit.Assert {

    protected Assert() {
    }

    private static final Supplier<String> supply(final CharSequence cs) {
        return () -> Objects.toString(cs, null);
    }

    /**
     * Similar to {@link Assert#fail(String)}, but uses a {@link CharSequence}-based fail message.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @throws AssertionError
     *             always
     */
    public static final void fail(final CharSequence message) {
        SupplierBasedAssert.fail(supply(message));
    }

    /**
     * Similar to {@link Assert#assertTrue(String, boolean)}, but uses a {@link CharSequence}-based fail message which
     * is {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertTrue(final CharSequence message, final boolean condition) {
        SupplierBasedAssert.assertTrue(supply(message), condition);
    }

    /**
     * Similar to {@link Assert#assertFalse(String, boolean)}, but uses a {@link CharSequence}-based fail message which
     * is {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertFalse(final CharSequence message, final boolean condition) {
        SupplierBasedAssert.assertFalse(supply(message), condition);
    }

    /**
     * Similar to {@link Assert#assertNull(String, Object)}, but uses a {@link CharSequence}-based fail message which is
     * {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for {@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNull(final CharSequence message, final Object object) {
        SupplierBasedAssert.assertNull(supply(message), object);
    }

    /**
     * Similar to {@link Assert#assertNotNull(String, Object)}, but uses a {@link CharSequence}-based fail message which
     * is {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for non-{@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotNull(final CharSequence message, final Object object) {
        SupplierBasedAssert.assertNotNull(supply(message), object);
    }

    /**
     * Similar to {@link Assert#assertSame(String, Object, Object)}, but uses a {@link CharSequence}-based fail message
     * which is {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertSame(final CharSequence message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertSame(supply(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotSame(String, Object, Object)}, but uses a {@link CharSequence}-based fail
     * message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotSame(final CharSequence message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotSame(supply(message), unexpected, actual);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertEquals(Supplier, double, double, double)} instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertEquals(final CharSequence message, final double expected, final double actual) {
        fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertNotEquals(Supplier, double, double, double)}
     * instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertNotEquals(final CharSequence message, final double unexpected, final double actual) {
        fail("Abandoned method! Instead, use [assertNotEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertEquals(String, double, double, double)}, but uses a {@link CharSequence}-based
     * fail message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertEquals(final CharSequence message, final double expected, final double actual, final double delta) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, double, double, double)}, but uses a {@link CharSequence}-based
     * fail message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertNotEquals(final CharSequence message, final double unexpected, final double actual, final double delta) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual, delta);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertEquals(Supplier, float, float, float)} instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertEquals(final CharSequence message, final float expected, final float actual) {
        fail("Abandoned method! Instead, use [assertEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertNotEquals(Supplier, float, float, float)} instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertNotEquals(final CharSequence message, final float unexpected, final float actual) {
        fail("Abandoned method! Instead, use [assertNotEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertEquals(String, float, float, float)}, but uses a {@link CharSequence}-based fail
     * message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertEquals(final CharSequence message, final float expected, final float actual, final float delta) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, float, float, float)}, but uses a {@link CharSequence}-based
     * fail message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
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
    public static final void assertNotEquals(final CharSequence message, final float unexpected, final float actual, final float delta) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, long, long)}, but uses a {@link CharSequence}-based fail message
     * which is {@linkplain Object#toString() resolved} if and only if the assertion fails. (In other words: If the
     * {@code CharSequence} instance is initiated lazily, the message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code long} value
     * @param actual
     *            the actual {@code long} value to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final CharSequence message, final long expected, final long actual) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, long, long)}, but uses a {@link CharSequence}-based fail message
     * which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence} instance is
     * initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing the message
     * parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code long} value
     * @param actual
     *            the actual {@code long} value to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final CharSequence message, final long unexpected, final long actual) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, Object, Object)}, but uses a {@link CharSequence}-based fail
     * message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expected
     *            the expected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertEquals(final CharSequence message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertEquals(supply(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, Object, Object)}, but uses a {@link CharSequence}-based fail
     * message which is requested if and only if the assertion fails. (In other words: If the {@code CharSequence}
     * instance is initiated lazily, the message creation is deferred until needed and, thus, the costs of constructing
     * the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param unexpected
     *            the unexpected {@code Object}
     * @param actual
     *            the actual {@code Object} to compare against {@code unexpected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotEquals(final CharSequence message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotEquals(supply(message), unexpected, actual);
    }

    /**
     * Immediately refers to {@link #assertArrayEquals(Supplier, Object[], Object[])}.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code Object} array
     * @param actuals
     *            the actual {@code Object} array to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, Object[], Object[])} instead!
     */
    @Deprecated
    public static final void assertEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals) {
        SupplierBasedAssert.assertEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, boolean[], boolean[])}, but uses a {@link CharSequence}-based
     * fail message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code boolean} array with expected values
     * @param actuals
     *            the {@code boolean} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final boolean[] expecteds, final boolean[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, byte[], byte[])}, but uses a {@link CharSequence}-based fail
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code byte} array with expected values
     * @param actuals
     *            the {@code byte} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final byte[] expecteds, final byte[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, char[], char[])}, but uses a {@link CharSequence}-based fail
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code char} array with expected values
     * @param actuals
     *            the {@code char} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final char[] expecteds, final char[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, double[], double[], double)}
     * instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code double} array
     * @param actuals
     *            the actual {@code double} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, double[], double[], double)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals)
    throws AssertionError {
        fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, double[], double[], double)] to compare doubleing-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, double[], double[], double)}, but uses a
     * {@link CharSequence}-based fail message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next
     * implementation will defer message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code double} array with expected values
     * @param actuals
     *            the {@code double} array with actual values to compare against {@code expected}
     * @param delta
     *            the maximum delta between two floating-point numbers for which they are still considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final double[] expecteds, final double[] actuals, final double delta)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, float[], float[], float)}
     * instead!
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code float} array
     * @param actuals
     *            the actual {@code float} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, float[], float[], float)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals)
    throws AssertionError {
        fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, float[], float[], float)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, float[], float[], float)}, but uses a
     * {@link CharSequence}-based fail message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next
     * implementation will defer message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code float} array with expected values
     * @param actuals
     *            the {@code float} array with actual values to compare against {@code expected}
     * @param delta
     *            the maximum delta between two floating-point numbers for which they are still considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final float[] expecteds, final float[] actuals, final float delta)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals, delta);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, int[], int[])}, but uses a {@link CharSequence}-based fail
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code int} array with expected values
     * @param actuals
     *            the {@code int} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final int[] expecteds, final int[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, long[], long[])}, but uses a {@link CharSequence}-based fail
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code long} array with expected values
     * @param actuals
     *            the {@code long} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final long[] expecteds, final long[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, Object[], Object[])}, but uses a {@link CharSequence}-based
     * fail message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code Object} array with expected values
     * @param actuals
     *            the {@code Object} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final Object[] expecteds, final Object[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, short[], short[])}, but uses a {@link CharSequence}-based fail
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @param message
     *            the (possibly lazy initiated) fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code short} array with expected values
     * @param actuals
     *            the {@code short} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final CharSequence message, final short[] expecteds, final short[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(supply(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertThat(String, Object, Matcher)}, but uses a {@link CharSequence}-based reason
     * message which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer
     * message creation until really needed.
     *
     * @see org.hamcrest.CoreMatchers
     * @see org.hamcrest.MatcherAssert
     *
     * @param reason
     *            the (possibly lazy initiated) additional information about the error ({@code null} will be ignored
     *            without any further notice)
     * @param <T>
     *            the static type accepted by the matcher (this can flag obvious compile-time problems such as
     *            {@code assertThat(1, is("a"))}
     * @param actual
     *            the computed value being compared
     * @param matcher
     *            an expression, built of {@link Matcher}s, specifying allowed values
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final <T> void assertThat(final CharSequence reason, final T actual, final Matcher<? super T> matcher)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertThat(supply(reason), actual, matcher);
    }

    private static final Supplier<String> resolve(final Supplier<? extends CharSequence> supplier) {
        return (supplier == null) ? null : () -> supplier.get().toString();
    }

    /**
     * Similar to {@link Assert#fail(String)}, but uses a supplied fail message.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @throws AssertionError
     *             always
     */
    public static final void fail(final Supplier<? extends CharSequence> message) {
        SupplierBasedAssert.fail(resolve(message));
    }

    /**
     * Similar to {@link Assert#assertTrue(String, boolean)}, but uses a supplied fail message which is requested if and
     * only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the costs
     * of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertTrue(final Supplier<? extends CharSequence> message, final boolean condition) {
        SupplierBasedAssert.assertTrue(resolve(message), condition);
    }

    /**
     * Similar to {@link Assert#assertFalse(String, boolean)}, but uses a supplied fail message which is requested if
     * and only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param condition
     *            condition to be checked
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertFalse(final Supplier<? extends CharSequence> message, final boolean condition) {
        SupplierBasedAssert.assertFalse(resolve(message), condition);
    }

    /**
     * Similar to {@link Assert#assertNull(String, Object)}, but uses a supplied fail message which is requested if and
     * only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the costs
     * of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for {@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNull(final Supplier<? extends CharSequence> message, final Object object) {
        SupplierBasedAssert.assertNull(resolve(message), object);
    }

    /**
     * Similar to {@link Assert#assertNotNull(String, Object)}, but uses a supplied fail message which is requested if
     * and only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the
     * costs of constructing the message parameter do not incur unless really necessary.)
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param object
     *            the {@code Object} to check for non-{@code null}-ness
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertNotNull(final Supplier<? extends CharSequence> message, final Object object) {
        SupplierBasedAssert.assertNotNull(resolve(message), object);
    }

    /**
     * Similar to {@link Assert#assertSame(String, Object, Object)}, but uses a supplied fail message which is requested
     * if and only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the
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
    public static final void assertSame(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertSame(resolve(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotSame(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertNotSame(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotSame(resolve(message), unexpected, actual);
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual) {
        fail("Abandoned method! Instead, use [assertEquals(Supplier, double, double, double)] to compare floating-point numbers!");
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final double unexpected, final double actual) {
        fail("Abandoned method! Instead, use [assertNotEquals(Supplier, double, double, double)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertEquals(String, double, double, double)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final double expected, final double actual, final double delta) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, double, double, double)}, but uses a supplied fail message which
     * is requested if and only if the assertion fails. (In other words: The message creation is deferred until needed
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final double unexpected, final double actual, final double delta) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual, delta);
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final float expected, final float actual) {
        fail("Abandoned method! Instead, use [assertEquals(Supplier, float, float, float)] to compare floating-point numbers!");
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final float unexpected, final float actual) {
        fail("Abandoned method! Instead, use [assertNotEquals(Supplier, float, float, float)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertEquals(String, float, float, float)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final float expected, final float actual, final float delta) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, float, float, float)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final float unexpected, final float actual, final float delta) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual, delta);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, long, long)}, but uses a supplied fail message which is requested
     * if and only if the assertion fails. (In other words: The message creation is deferred until needed and, thus, the
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final long expected, final long actual) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, long, long)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final long unexpected, final long actual) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual);
    }

    /**
     * Similar to {@link Assert#assertEquals(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final Object expected, final Object actual) {
        SupplierBasedAssert.assertEquals(resolve(message), expected, actual);
    }

    /**
     * Similar to {@link Assert#assertNotEquals(String, Object, Object)}, but uses a supplied fail message which is
     * requested if and only if the assertion fails. (In other words: The message creation is deferred until needed and,
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
    public static final void assertNotEquals(final Supplier<? extends CharSequence> message, final Object unexpected, final Object actual) {
        SupplierBasedAssert.assertNotEquals(resolve(message), unexpected, actual);
    }

    /**
     * Immediately refers to {@link #assertArrayEquals(Supplier, Object[], Object[])}.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code Object} array
     * @param actuals
     *            the actual {@code Object} array to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, Object[], Object[])} instead!
     */
    @Deprecated
    public static final void assertEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals) {
        SupplierBasedAssert.assertEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, boolean[], boolean[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code boolean} array with expected values
     * @param actuals
     *            the {@code boolean} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final boolean[] expecteds, final boolean[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, byte[], byte[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code byte} array with expected values
     * @param actuals
     *            the {@code byte} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final byte[] expecteds, final byte[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, char[], char[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code char} array with expected values
     * @param actuals
     *            the {@code char} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final char[] expecteds, final char[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, double[], double[], double)}
     * instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code double} array
     * @param actuals
     *            the actual {@code double} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, double[], double[], double)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final double[] expecteds, final double[] actuals)
    throws AssertionError {
        fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, double[], double[], double)] to compare doubleing-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, double[], double[], double)}, but uses a supplied fail message
     * which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message
     * creation until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code double} array with expected values
     * @param actuals
     *            the {@code double} array with actual values to compare against {@code expected}
     * @param delta
     *            the maximum delta between two floating-point numbers for which they are still considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final double[] expecteds, final double[] actuals,
                                               final double delta)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    /**
     * Throws an {@link AssertionError}; You better use {@link #assertArrayEquals(Supplier, float[], float[], float)}
     * instead!
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the expected {@code float} array
     * @param actuals
     *            the actual {@code float} array to compare against {@code expected}
     * @throws AssertionError
     *             always
     *
     * @deprecated Use {@link #assertArrayEquals(Supplier, float[], float[], float)} instead!
     */
    @Deprecated
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final float[] expecteds, final float[] actuals)
    throws AssertionError {
        fail("Abandoned method! Instead, use [assertArrayEquals(Supplier, float[], float[], float)] to compare floating-point numbers!");
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, float[], float[], float)}, but uses a supplied fail message
     * which &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message
     * creation until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code float} array with expected values
     * @param actuals
     *            the {@code float} array with actual values to compare against {@code expected}
     * @param delta
     *            the maximum delta between two floating-point numbers for which they are still considered equal
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final float[] expecteds, final float[] actuals,
                                               final float delta)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals, delta);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, int[], int[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code int} array with expected values
     * @param actuals
     *            the {@code int} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final int[] expecteds, final int[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, long[], long[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code long} array with expected values
     * @param actuals
     *            the {@code long} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final long[] expecteds, final long[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, Object[], Object[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code Object} array with expected values
     * @param actuals
     *            the {@code Object} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final Object[] expecteds, final Object[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertArrayEquals(String, short[], short[])}, but uses a supplied fail message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @param message
     *            the supplied fail message ({@code null} will be ignored without any further notice)
     * @param expecteds
     *            the {@code short} array with expected values
     * @param actuals
     *            the {@code short} array with actual values to compare against {@code expected}
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final void assertArrayEquals(final Supplier<? extends CharSequence> message, final short[] expecteds, final short[] actuals)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertArrayEquals(resolve(message), expecteds, actuals);
    }

    /**
     * Similar to {@link Assert#assertThat(String, Object, Matcher)}, but uses a supplied reason message which
     * &ndash;&nbsp;currently&nbsp;&ndash; is requested immediately. Next implementation will defer message creation
     * until really needed.
     *
     * @see org.hamcrest.CoreMatchers
     * @see org.hamcrest.MatcherAssert
     *
     * @param reason
     *            the supplied additional information about the error ({@code null} will be ignored without any further
     *            notice)
     * @param <T>
     *            the static type accepted by the matcher (this can flag obvious compile-time problems such as
     *            {@code assertThat(1, is("a"))}
     * @param actual
     *            the computed value being compared
     * @param matcher
     *            an expression, built of {@link Matcher}s, specifying allowed values
     * @throws AssertionError
     *             iff the assertion fails
     */
    public static final <T> void assertThat(final Supplier<? extends CharSequence> reason, final T actual, final Matcher<? super T> matcher)
    throws AssertionError {
        // TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails
        SupplierBasedAssert.assertThat(resolve(reason), actual, matcher);
    }

}
