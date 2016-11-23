package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExceptionInInitializerError} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.ExceptionInInitializerErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExceptionInInitializerErrorClassTest
implements ExceptionInInitializerErrorClassTests<ExceptionInInitializerError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ExceptionInInitializerError]

    @Override
    public Class<ExceptionInInitializerError> createNewSUT() {
        return ExceptionInInitializerError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ExceptionInInitializerError#ExceptionInInitializerError(String) public
     * java.lang.ExceptionInInitializerError(java.lang.String)}.
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
    public void create_ExceptionInInitializerError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExceptionInInitializerError sut = null; // = new ExceptionInInitializerError(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ExceptionInInitializerError#ExceptionInInitializerError(Throwable) public
     * java.lang.ExceptionInInitializerError(java.lang.Throwable)}.
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
    public void create_ExceptionInInitializerError_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExceptionInInitializerError sut = null; // = new ExceptionInInitializerError(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ExceptionInInitializerError#ExceptionInInitializerError() public java.lang.ExceptionInInitializerError()}.
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
    public void create_ExceptionInInitializerError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExceptionInInitializerError sut = new ExceptionInInitializerError();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ExceptionInInitializerError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ExceptionInInitializerError]

}
