package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalThreadStateException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.IllegalThreadStateExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalThreadStateExceptionClassTest
implements IllegalThreadStateExceptionClassTests<IllegalThreadStateException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IllegalThreadStateException]

    @Override
    public Class<IllegalThreadStateException> createNewSUT() {
        return IllegalThreadStateException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalThreadStateException#IllegalThreadStateException() public java.lang.IllegalThreadStateException()}.
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
    public void create_IllegalThreadStateException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalThreadStateException sut = new IllegalThreadStateException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalThreadStateException#IllegalThreadStateException(String) public
     * java.lang.IllegalThreadStateException(java.lang.String)}.
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
    public void create_IllegalThreadStateException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalThreadStateException sut = null; // = new IllegalThreadStateException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IllegalThreadStateException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IllegalThreadStateException]

}
