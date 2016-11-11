package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Long} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.lang.LongClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongClassTest
implements LongClassTests<Long> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Long]

    @Override
    public Class<Long> createNewSUT() {
        return Long.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Long#Long(long) public java.lang.Long(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Long_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Long sut = null; // = new Long(long);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Long#Long(String) public
     * java.lang.Long(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Long_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Long sut = null; // = new Long(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#hashCode(long) public static int
     * java.lang.Long.hashCode(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_hashCode_long()
    throws Exception {
        // write some test for {@link Long#hashCode(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#parseUnsignedLong(String, int) public static
     * long java.lang.Long.parseUnsignedLong(java.lang.String,int) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_parseUnsignedLong_String_int()
    throws Exception {
        // write some test for {@link Long#parseUnsignedLong(String, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#parseUnsignedLong(String) public static long
     * java.lang.Long.parseUnsignedLong(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_parseUnsignedLong_String()
    throws Exception {
        // write some test for {@link Long#parseUnsignedLong(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#min(long, long) public static long
     * java.lang.Long.min(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_min_long_long()
    throws Exception {
        // write some test for {@link Long#min(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#remainderUnsigned(long, long) public static
     * long java.lang.Long.remainderUnsigned(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_remainderUnsigned_long_long()
    throws Exception {
        // write some test for {@link Long#remainderUnsigned(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#lowestOneBit(long) public static long
     * java.lang.Long.lowestOneBit(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lowestOneBit_long()
    throws Exception {
        // write some test for {@link Long#lowestOneBit(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#compare(long, long) public static int
     * java.lang.Long.compare(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_compare_long_long()
    throws Exception {
        // write some test for {@link Long#compare(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#decode(String) public static java.lang.Long
     * java.lang.Long.decode(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_decode_String()
    throws Exception {
        // write some test for {@link Long#decode(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toOctalString(long) public static
     * java.lang.String java.lang.Long.toOctalString(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toOctalString_long()
    throws Exception {
        // write some test for {@link Long#toOctalString(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#rotateLeft(long, int) public static long
     * java.lang.Long.rotateLeft(long,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_rotateLeft_long_int()
    throws Exception {
        // write some test for {@link Long#rotateLeft(long, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#sum(long, long) public static long
     * java.lang.Long.sum(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_sum_long_long()
    throws Exception {
        // write some test for {@link Long#sum(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toBinaryString(long) public static
     * java.lang.String java.lang.Long.toBinaryString(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toBinaryString_long()
    throws Exception {
        // write some test for {@link Long#toBinaryString(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#parseLong(String, int) public static long
     * java.lang.Long.parseLong(java.lang.String,int) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_parseLong_String_int()
    throws Exception {
        // write some test for {@link Long#parseLong(String, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#parseLong(String) public static long
     * java.lang.Long.parseLong(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_parseLong_String()
    throws Exception {
        // write some test for {@link Long#parseLong(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#getLong(String, Long) public static
     * java.lang.Long java.lang.Long.getLong(java.lang.String,java.lang.Long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getLong_String_Long()
    throws Exception {
        // write some test for {@link Long#getLong(String, Long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#getLong(String, long) public static
     * java.lang.Long java.lang.Long.getLong(java.lang.String,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getLong_String_long()
    throws Exception {
        // write some test for {@link Long#getLong(String, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#getLong(String) public static java.lang.Long
     * java.lang.Long.getLong(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getLong_String()
    throws Exception {
        // write some test for {@link Long#getLong(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#compareUnsigned(long, long) public static int
     * java.lang.Long.compareUnsigned(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_compareUnsigned_long_long()
    throws Exception {
        // write some test for {@link Long#compareUnsigned(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#highestOneBit(long) public static long
     * java.lang.Long.highestOneBit(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_highestOneBit_long()
    throws Exception {
        // write some test for {@link Long#highestOneBit(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#reverseBytes(long) public static long
     * java.lang.Long.reverseBytes(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_reverseBytes_long()
    throws Exception {
        // write some test for {@link Long#reverseBytes(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#numberOfTrailingZeros(long) public static int
     * java.lang.Long.numberOfTrailingZeros(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_numberOfTrailingZeros_long()
    throws Exception {
        // write some test for {@link Long#numberOfTrailingZeros(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#bitCount(long) public static int
     * java.lang.Long.bitCount(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_bitCount_long()
    throws Exception {
        // write some test for {@link Long#bitCount(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toString(long, int) public static
     * java.lang.String java.lang.Long.toString(long,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toString_long_int()
    throws Exception {
        // write some test for {@link Long#toString(long, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toString(long) public static java.lang.String
     * java.lang.Long.toString(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toString_long()
    throws Exception {
        // write some test for {@link Long#toString(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toUnsignedString(long, int) public static
     * java.lang.String java.lang.Long.toUnsignedString(long,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toUnsignedString_long_int()
    throws Exception {
        // write some test for {@link Long#toUnsignedString(long, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toUnsignedString(long) public static
     * java.lang.String java.lang.Long.toUnsignedString(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toUnsignedString_long()
    throws Exception {
        // write some test for {@link Long#toUnsignedString(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#max(long, long) public static long
     * java.lang.Long.max(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_max_long_long()
    throws Exception {
        // write some test for {@link Long#max(long, long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#toHexString(long) public static
     * java.lang.String java.lang.Long.toHexString(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_toHexString_long()
    throws Exception {
        // write some test for {@link Long#toHexString(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#rotateRight(long, int) public static long
     * java.lang.Long.rotateRight(long,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_rotateRight_long_int()
    throws Exception {
        // write some test for {@link Long#rotateRight(long, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#valueOf(String, int) public static
     * java.lang.Long java.lang.Long.valueOf(java.lang.String,int) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_valueOf_String_int()
    throws Exception {
        // write some test for {@link Long#valueOf(String, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#valueOf(long) public static java.lang.Long
     * java.lang.Long.valueOf(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_valueOf_long()
    throws Exception {
        // write some test for {@link Long#valueOf(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#valueOf(String) public static java.lang.Long
     * java.lang.Long.valueOf(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link Long#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#signum(long) public static int
     * java.lang.Long.signum(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_signum_long()
    throws Exception {
        // write some test for {@link Long#signum(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#reverse(long) public static long
     * java.lang.Long.reverse(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_reverse_long()
    throws Exception {
        // write some test for {@link Long#reverse(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#numberOfLeadingZeros(long) public static int
     * java.lang.Long.numberOfLeadingZeros(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_numberOfLeadingZeros_long()
    throws Exception {
        // write some test for {@link Long#numberOfLeadingZeros(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Long#divideUnsigned(long, long) public static long
     * java.lang.Long.divideUnsigned(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_divideUnsigned_long_long()
    throws Exception {
        // write some test for {@link Long#divideUnsigned(long, long)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Long]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Long]

}
