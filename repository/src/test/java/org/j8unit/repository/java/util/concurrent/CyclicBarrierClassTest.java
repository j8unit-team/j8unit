package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CyclicBarrier;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CyclicBarrier} (by simply reusing the
 * J8Unit test interface {@link CyclicBarrierClassTests}).
 */

@RunWith(J8Unit4.class)
public class CyclicBarrierClassTest
implements CyclicBarrierClassTests<CyclicBarrier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CyclicBarrier]

    @Override
    public Class<CyclicBarrier> createNewSUT() {
        return CyclicBarrier.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CyclicBarrier#CyclicBarrier(int, Runnable) public
     * java.util.concurrent.CyclicBarrier(int,java.lang.Runnable)}.
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
    public void create_CyclicBarrier_int_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CyclicBarrier sut = null; // = new CyclicBarrier(int, Runnable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CyclicBarrier#CyclicBarrier(int) public java.util.concurrent.CyclicBarrier(int)}.
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
    public void create_CyclicBarrier_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CyclicBarrier sut = null; // = new CyclicBarrier(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CyclicBarrier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CyclicBarrier]

}
