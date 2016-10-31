package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicIntegerClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerClassTests<AtomicInteger> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicInteger]

    @Override
    public Class<AtomicInteger> createNewSUT() {
        return AtomicInteger.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicInteger#AtomicInteger(int) public
     * java.util.concurrent.atomic.AtomicInteger(int)}.
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
    public void create_AtomicInteger_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AtomicInteger sut = null; // = new AtomicInteger(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.AtomicInteger#AtomicInteger() public
     * java.util.concurrent.atomic.AtomicInteger()}.
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
    public void create_AtomicInteger()
    throws Exception {
        // create new instance
        final AtomicInteger sut = new AtomicInteger();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.atomic.AtomicInteger]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicInteger]

}
