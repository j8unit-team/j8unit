package org.junit;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class SupplierBasedAssertTest {

    @Test
    public void testInstanciability()
    throws Exception {
        final SupplierBasedAssert instance = new SupplierBasedAssert();
        assertNotNull(instance);
    }

    private static final Supplier<String> SUP = "FAILED"::toString;

    @Test
    public void test_assertArrayEquals_boolean_success()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_boolean_failure()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new boolean[] {});
    }

    @Test
    public void test_assertArrayEquals_byte_success()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_byte_failure()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new byte[] {});
    }

    @Test
    public void test_assertArrayEquals_char_success()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_char_failure()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new char[] {});
    }

    @Test
    public void test_assertArrayEquals_double_success()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_double_failure()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new double[] {}, 0.0d);
    }

    @Test
    public void test_assertArrayEquals_float_success()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_float_failure()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new float[] {}, 0.0f);
    }

    @Test
    public void test_assertArrayEquals_int_success()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_int_failure()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new int[] {});
    }

    @Test
    public void test_assertArrayEquals_long_success()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_long_failure()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new long[] {});
    }

    @Test
    public void test_assertArrayEquals_Object_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_Object_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new Object[] {});
    }

    @Test
    public void test_assertArrayEquals_short_success()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_short_failure()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        SupplierBasedAssert.assertArrayEquals(SUP, array, new short[] {});
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_deprecated()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 0.0d);
    }

    @Test
    public void test_assertEquals_double_success()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_1()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_2()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 0.1d, 0.05d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_3()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0d, 1.0d, 0.9d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_deprecated()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.0f);
    }

    @Test
    public void test_assertEquals_float_success()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.0f, 0.0f);
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.1f, 0.2f);
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 1.0f, 2.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_1()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 1.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_2()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 0.1f, 0.05f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_3()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0.0f, 1.0f, 0.9f);
    }

    @Test
    public void test_assertEquals_long_success()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0l, 0l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_long_failure()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, 0l, 1l);
    }

    @Test
    public void test_assertEquals_Object_success()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_Object_failure()
    throws Exception {
        SupplierBasedAssert.assertEquals(SUP, "hello", "world");
    }

    @Test
    public void test_assertEquals_ObjectArray_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertEquals(SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_ObjectArray_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        SupplierBasedAssert.assertEquals(SUP, array, new Object[] {});
    }

    @Test
    public void test_assertFalse_success()
    throws Exception {
        SupplierBasedAssert.assertFalse(SUP, false);
    }

    @Test(expected = AssertionError.class)
    public void test_assertFalse_failure()
    throws Exception {
        SupplierBasedAssert.assertFalse(SUP, true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double_deprecated()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0d, 0.0d);
    }

    @Test
    public void test_assertNotEquals_double_success()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double_failure()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float_deprecated()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_float_success()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0f, 1.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float_failure()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0.0f, 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_long_success()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0l, 1l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_long_failure()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, 0l, 0l);
    }

    @Test
    public void test_assertNotEquals_Object_success()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_Object_failure()
    throws Exception {
        SupplierBasedAssert.assertNotEquals(SUP, "hello", "hello");
    }

    @Test
    public void test_assertNotNull_success()
    throws Exception {
        SupplierBasedAssert.assertNotNull(SUP, "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotNull_failure()
    throws Exception {
        SupplierBasedAssert.assertNotNull(SUP, null);
    }

    @Test
    public void test_assertNotSame_success()
    throws Exception {
        SupplierBasedAssert.assertNotSame(SUP, "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotSame_failure()
    throws Exception {
        SupplierBasedAssert.assertNotSame(SUP, "hello", "hello");
    }

    @Test
    public void test_assertNull_success()
    throws Exception {
        SupplierBasedAssert.assertNull(SUP, null);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNull_failure()
    throws Exception {
        SupplierBasedAssert.assertNull(SUP, "hello");
    }

    @Test
    public void test_assertSame_success()
    throws Exception {
        SupplierBasedAssert.assertSame(SUP, "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertSame_failure()
    throws Exception {
        SupplierBasedAssert.assertSame(SUP, "hello", "world");
    }

    @Test
    public void test_assertTrue_success()
    throws Exception {
        SupplierBasedAssert.assertTrue(SUP, true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertTrue_failure()
    throws Exception {
        SupplierBasedAssert.assertTrue(SUP, false);
    }

    @Test
    public void test_assertThat_success()
    throws Exception {
        SupplierBasedAssert.assertThat(SUP, 42, is(42));
    }

    @Test(expected = AssertionError.class)
    public void test_assertThat_failure()
    throws Exception {
        SupplierBasedAssert.assertThat(SUP, 42, is(23));
    }

}
