package org.j8unit;

import static org.hamcrest.Matchers.is;
import java.util.function.Supplier;
import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class DeferredMessageComputation2Test {

    public static final Supplier<? extends CharSequence> SUP = () -> {
        throw new AssertionError("This method represents some expensive computation of a failure message -- and should have not been called when succeeding a test!");
    };

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_boolean_without_message_computation()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_byte_without_message_computation()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_char_without_message_computation()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_double_without_message_computation()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array, 0.0d);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_float_without_message_computation()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array, 0.0f);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_int_without_message_computation()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_long_without_message_computation()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_Object_without_message_computation()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertArrayEquals_short_without_message_computation()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test
    public void test_assertEquals_double_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 0.0d, 0.0d);
    }

    @Test
    public void test_assertEquals_float_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.0f, 0.0f);
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.1f, 0.2f);
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 1.0f, 2.0f);
    }

    @Test
    public void test_assertEquals_long_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0l, 0l);
    }

    @Test
    public void test_assertEquals_Object_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, "hello", "hello");
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertEquals_ObjectArray_without_message_computation()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertEquals(SUP, array, array);
    }

    @Test
    public void test_assertFalse_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertFalse(SUP, false);
    }

    @Test
    public void test_assertNotEquals_double_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0d, 1.0d, 0.0d);
    }

    @Test
    public void test_assertNotEquals_float_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0f, 1.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_long_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0l, 1l);
    }

    @Test
    public void test_assertNotEquals_Object_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, "hello", "world");
    }

    @Test
    public void test_assertNotNull_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotNull(SUP, "hello");
    }

    @Test
    public void test_assertNotSame_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNotSame(SUP, "hello", "world");
    }

    @Test
    public void test_assertNull_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertNull(SUP, null);
    }

    @Test
    public void test_assertSame_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertSame(SUP, "hello", "hello");
    }

    @Test
    public void test_assertTrue_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertTrue(SUP, true);
    }

    @Ignore("TODO (Issue #4): Provide implementation which requests the supplied fail message only if the assertion fails")
    @Test
    public void test_assertThat_without_message_computation()
    throws Exception {
        SupplierBasedAssert.assertThat(SUP, 42, is(42));
    }

}
