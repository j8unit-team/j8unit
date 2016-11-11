package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalArgumentException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.IllegalArgumentExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalArgumentExceptionClassTest
implements IllegalArgumentExceptionClassTests<IllegalArgumentException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IllegalArgumentException]

    @Override
    public Class<IllegalArgumentException> createNewSUT() {
        return IllegalArgumentException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalArgumentException#IllegalArgumentException(Throwable) public
     * java.lang.IllegalArgumentException(java.lang.Throwable)}.
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
    public void create_IllegalArgumentException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalArgumentException sut = null; // = new IllegalArgumentException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalArgumentException#IllegalArgumentException(String, Throwable) public
     * java.lang.IllegalArgumentException(java.lang.String,java.lang.Throwable)}.
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
    public void create_IllegalArgumentException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalArgumentException sut = null; // = new IllegalArgumentException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalArgumentException#IllegalArgumentException(String) public
     * java.lang.IllegalArgumentException(java.lang.String)}.
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
    public void create_IllegalArgumentException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalArgumentException sut = null; // = new IllegalArgumentException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalArgumentException#IllegalArgumentException() public java.lang.IllegalArgumentException()}.
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
    public void create_IllegalArgumentException()
    throws Exception {
        // create new instance
        final IllegalArgumentException sut = new IllegalArgumentException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IllegalArgumentException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IllegalArgumentException]

}
