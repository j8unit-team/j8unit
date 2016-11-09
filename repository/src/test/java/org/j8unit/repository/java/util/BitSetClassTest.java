package org.j8unit.repository.java.util;

import java.util.BitSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BitSet} (by simply reusing the J8Unit
 * test interface {@link BitSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class BitSetClassTest
implements BitSetClassTests<BitSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.BitSet]

    @Override
    public Class<BitSet> createNewSUT() {
        return BitSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.BitSet#BitSet(int) public
     * java.util.BitSet(int)}.
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
    public void create_BitSet_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BitSet sut = null; // = new BitSet(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.BitSet#BitSet() public
     * java.util.BitSet()}.
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
    public void create_BitSet()
    throws Exception {
        // create new instance
        final BitSet sut = new BitSet();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.BitSet#valueOf(java.nio.LongBuffer) public
     * static java.util.BitSet java.util.BitSet.valueOf(java.nio.LongBuffer)}.
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
    public void test_valueOf_LongBuffer()
    throws Exception {
        // write some test for {@link java.util.BitSet#valueOf(java.nio.LongBuffer)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.BitSet#valueOf(long[]) public static
     * java.util.BitSet java.util.BitSet.valueOf(long[])}.
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
    public void test_valueOf_longArray()
    throws Exception {
        // write some test for {@link java.util.BitSet#valueOf(long[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.BitSet#valueOf(java.nio.ByteBuffer) public
     * static java.util.BitSet java.util.BitSet.valueOf(java.nio.ByteBuffer)}.
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
    public void test_valueOf_ByteBuffer()
    throws Exception {
        // write some test for {@link java.util.BitSet#valueOf(java.nio.ByteBuffer)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.BitSet#valueOf(byte[]) public static
     * java.util.BitSet java.util.BitSet.valueOf(byte[])}.
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
    public void test_valueOf_byteArray()
    throws Exception {
        // write some test for {@link java.util.BitSet#valueOf(byte[])}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.BitSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.BitSet]

}
