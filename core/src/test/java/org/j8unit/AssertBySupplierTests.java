package org.j8unit;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import java.nio.CharBuffer;
import java.util.function.Supplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class AssertBySupplierTests {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return asList(new Object[][] { //
                                       { null }, //
                                       { (Supplier<String>) "FAILED"::toString }, //
                                       { (Supplier<StringBuilder>) () -> new StringBuilder("FAILED") }, //
                                       { (Supplier<StringBuffer>) () -> new StringBuffer("FAILED") }, //
                                       { (Supplier<CharBuffer>) () -> CharBuffer.wrap("FAILED") }, //
                                       { (Supplier<String>) () -> someExpensiveMessageCreation() } //
        });
    }

    @Parameter(0)
    public Supplier<? extends CharSequence> SUP;

    private static String someExpensiveMessageCreation() {
        // do some very expensive message creation ...
        final String msg = "Damn, test failed!";
        // ... and return the result
        return msg;
    }

    @Test(expected = AssertionError.class)
    public void test_fail_failure()
    throws Exception {
        Assert.fail(this.SUP);
    }

    @Test
    public void test_assertArrayEquals_boolean_success()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_boolean_failure()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        Assert.assertArrayEquals(this.SUP, array, new boolean[] {});
    }

    @Test
    public void test_assertArrayEquals_byte_success()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_byte_failure()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, new byte[] {});
    }

    @Test
    public void test_assertArrayEquals_char_success()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_char_failure()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, new char[] {});
    }

    @Test
    public void test_assertArrayEquals_double_success()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        Assert.assertArrayEquals(this.SUP, array, array, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_double_failure()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        Assert.assertArrayEquals(this.SUP, array, new double[] {}, 0.0d);
    }

    @Test
    public void test_assertArrayEquals_float_success()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        Assert.assertArrayEquals(this.SUP, array, array, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_float_failure()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        Assert.assertArrayEquals(this.SUP, array, new float[] {}, 0.0f);
    }

    @Test
    public void test_assertArrayEquals_int_success()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_int_failure()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, new int[] {});
    }

    @Test
    public void test_assertArrayEquals_long_success()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_long_failure()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        Assert.assertArrayEquals(this.SUP, array, new long[] {});
    }

    @Test
    public void test_assertArrayEquals_Object_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_Object_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertArrayEquals(this.SUP, array, new Object[] {});
    }

    @Test
    public void test_assertArrayEquals_short_success()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_short_failure()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        Assert.assertArrayEquals(this.SUP, array, new short[] {});
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_deprecated()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0d, 0.0d);
    }

    @Test
    public void test_assertEquals_double_success()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_1()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_2()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0d, 0.1d, 0.05d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure_3()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0d, 1.0d, 0.9d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_deprecated()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0f, 0.0f);
    }

    @Test
    public void test_assertEquals_float_success()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0f, 0.0f, 0.0f);
        Assert.assertEquals(this.SUP, 0.0f, 0.1f, 0.2f);
        Assert.assertEquals(this.SUP, 0.0f, 1.0f, 2.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_1()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0f, 1.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_2()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0f, 0.1f, 0.05f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure_3()
    throws Exception {
        Assert.assertEquals(this.SUP, 0.0f, 1.0f, 0.9f);
    }

    @Test
    public void test_assertEquals_long_success()
    throws Exception {
        Assert.assertEquals(this.SUP, 0l, 0l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_long_failure()
    throws Exception {
        Assert.assertEquals(this.SUP, 0l, 1l);
    }

    @Test
    public void test_assertEquals_Object_success()
    throws Exception {
        Assert.assertEquals(this.SUP, "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_Object_failure()
    throws Exception {
        Assert.assertEquals(this.SUP, "hello", "world");
    }

    @Test
    public void test_assertEquals_ObjectArray_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertEquals(this.SUP, array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_ObjectArray_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertEquals(this.SUP, array, new Object[] {});
    }

    @Test
    public void test_assertFalse_success()
    throws Exception {
        Assert.assertFalse(this.SUP, false);
    }

    @Test(expected = AssertionError.class)
    public void test_assertFalse_failure()
    throws Exception {
        Assert.assertFalse(this.SUP, true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double_deprecated()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0d, 0.0d);
    }

    @Test
    public void test_assertNotEquals_double_success()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double_failure()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float_deprecated()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_float_success()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0f, 1.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float_failure()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0.0f, 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_long_success()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0l, 1l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_long_failure()
    throws Exception {
        Assert.assertNotEquals(this.SUP, 0l, 0l);
    }

    @Test
    public void test_assertNotEquals_Object_success()
    throws Exception {
        Assert.assertNotEquals(this.SUP, "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_Object_failure()
    throws Exception {
        Assert.assertNotEquals(this.SUP, "hello", "hello");
    }

    @Test
    public void test_assertNotNull_success()
    throws Exception {
        Assert.assertNotNull(this.SUP, "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotNull_failure()
    throws Exception {
        Assert.assertNotNull(this.SUP, null);
    }

    @Test
    public void test_assertNotSame_success()
    throws Exception {
        Assert.assertNotSame(this.SUP, "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotSame_failure()
    throws Exception {
        Assert.assertNotSame(this.SUP, "hello", "hello");
    }

    @Test
    public void test_assertNull_success()
    throws Exception {
        Assert.assertNull(this.SUP, null);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNull_failure()
    throws Exception {
        Assert.assertNull(this.SUP, "hello");
    }

    @Test
    public void test_assertSame_success()
    throws Exception {
        Assert.assertSame(this.SUP, "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertSame_failure()
    throws Exception {
        Assert.assertSame(this.SUP, "hello", "world");
    }

    @Test
    public void test_assertTrue_success()
    throws Exception {
        Assert.assertTrue(this.SUP, true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertTrue_failure()
    throws Exception {
        Assert.assertTrue(this.SUP, false);
    }

    @Test
    public void test_assertThat_success()
    throws Exception {
        Assert.assertThat(this.SUP, 42, is(42));
    }

    @Test(expected = AssertionError.class)
    public void test_assertThat_failure()
    throws Exception {
        Assert.assertThat(this.SUP, 42, is(23));
    }

}
