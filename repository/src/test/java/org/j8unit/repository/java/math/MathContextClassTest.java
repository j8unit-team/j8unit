package org.j8unit.repository.java.math;

import java.math.MathContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MathContext} (by simply reusing the
 * J8Unit test interface {@link MathContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class MathContextClassTest
implements MathContextClassTests<MathContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.math.MathContext]

    @Override
    public Class<MathContext> createNewSUT() {
        return MathContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.math.MathContext#MathContext(int) public
     * java.math.MathContext(int)}.
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
    public void create_MathContext_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MathContext sut = null; // = new MathContext(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.math.MathContext#MathContext(String)
     * public java.math.MathContext(java.lang.String)}.
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
    public void create_MathContext_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MathContext sut = null; // = new MathContext(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.math.MathContext#MathContext(int, java.math.RoundingMode) public
     * java.math.MathContext(int,java.math.RoundingMode)}.
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
    public void create_MathContext_int_RoundingMode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MathContext sut = null; // = new MathContext(int, java.math.RoundingMode);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.math.MathContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.math.MathContext]

}
