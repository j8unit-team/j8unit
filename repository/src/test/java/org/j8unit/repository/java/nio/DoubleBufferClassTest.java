package org.j8unit.repository.java.nio;

import java.nio.DoubleBuffer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleBuffer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.DoubleBufferClassTests}).
 */
@RunWith(J8Unit4.class)
public class DoubleBufferClassTest
implements DoubleBufferClassTests<DoubleBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.DoubleBuffer]

    @Override
    public Class<DoubleBuffer> createNewSUT() {
        return DoubleBuffer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.DoubleBuffer#allocate(int) public static
     * java.nio.DoubleBuffer java.nio.DoubleBuffer.allocate(int)}.
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
    public void test_allocate_int()
    throws Exception {
        // write some test for {@link java.nio.DoubleBuffer#allocate(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.DoubleBuffer#wrap(double[], int, int)
     * public static java.nio.DoubleBuffer java.nio.DoubleBuffer.wrap(double[],int,int)}.
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
    public void test_wrap_doubleArray_int_int()
    throws Exception {
        // write some test for {@link java.nio.DoubleBuffer#wrap(double[], int, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.DoubleBuffer#wrap(double[]) public static
     * java.nio.DoubleBuffer java.nio.DoubleBuffer.wrap(double[])}.
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
    public void test_wrap_doubleArray()
    throws Exception {
        // write some test for {@link java.nio.DoubleBuffer#wrap(double[])}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.DoubleBuffer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.DoubleBuffer]

}
