package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractMethodError} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.AbstractMethodErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractMethodErrorClassTest
implements AbstractMethodErrorClassTests<AbstractMethodError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.AbstractMethodError]

    @Override
    public Class<AbstractMethodError> createNewSUT() {
        return AbstractMethodError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link AbstractMethodError#AbstractMethodError()
     * public java.lang.AbstractMethodError()}.
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
    public void create_AbstractMethodError()
    throws Exception {
        // create new instance
        final AbstractMethodError sut = new AbstractMethodError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link AbstractMethodError#AbstractMethodError(String)
     * public java.lang.AbstractMethodError(java.lang.String)}.
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
    public void create_AbstractMethodError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AbstractMethodError sut = null; // = new AbstractMethodError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.AbstractMethodError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.AbstractMethodError]

}
