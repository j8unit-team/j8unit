package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Exception} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExceptionClassTest
implements ExceptionClassTests<Exception> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Exception]

    @Override
    public Class<Exception> createNewSUT() {
        return Exception.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Exception#Exception(Throwable) public
     * java.lang.Exception(java.lang.Throwable)}.
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
    public void create_Exception_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Exception sut = null; // = new Exception(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Exception#Exception(String, Throwable) public
     * java.lang.Exception(java.lang.String,java.lang.Throwable)}.
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
    public void create_Exception_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Exception sut = null; // = new Exception(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Exception#Exception(String) public
     * java.lang.Exception(java.lang.String)}.
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
    public void create_Exception_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Exception sut = null; // = new Exception(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Exception#Exception() public
     * java.lang.Exception()}.
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
    public void create_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Exception sut = new Exception();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Exception]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Exception]

}
