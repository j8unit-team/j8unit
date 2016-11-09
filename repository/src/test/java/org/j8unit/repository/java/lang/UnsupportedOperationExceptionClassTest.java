package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedOperationException} (by simply
 * reusing the J8Unit test interface {@link UnsupportedOperationExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedOperationExceptionClassTest
implements UnsupportedOperationExceptionClassTests<UnsupportedOperationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.UnsupportedOperationException]

    @Override
    public Class<UnsupportedOperationException> createNewSUT() {
        return UnsupportedOperationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedOperationException#UnsupportedOperationException(Throwable) public
     * java.lang.UnsupportedOperationException(java.lang.Throwable)}.
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
    public void create_UnsupportedOperationException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedOperationException sut = null; // = new UnsupportedOperationException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedOperationException#UnsupportedOperationException(String, Throwable) public
     * java.lang.UnsupportedOperationException(java.lang.String,java.lang.Throwable)}.
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
    public void create_UnsupportedOperationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedOperationException sut = null; // = new UnsupportedOperationException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedOperationException#UnsupportedOperationException(String) public
     * java.lang.UnsupportedOperationException(java.lang.String)}.
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
    public void create_UnsupportedOperationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedOperationException sut = null; // = new UnsupportedOperationException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsupportedOperationException#UnsupportedOperationException() public
     * java.lang.UnsupportedOperationException()}.
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
    public void create_UnsupportedOperationException()
    throws Exception {
        // create new instance
        final UnsupportedOperationException sut = new UnsupportedOperationException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.UnsupportedOperationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.UnsupportedOperationException]

}
