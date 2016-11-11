package org.j8unit.repository.java.io;

import java.io.InterruptedIOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InterruptedIOException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.InterruptedIOExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InterruptedIOExceptionClassTest
implements InterruptedIOExceptionClassTests<InterruptedIOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.InterruptedIOException]

    @Override
    public Class<InterruptedIOException> createNewSUT() {
        return InterruptedIOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InterruptedIOException#InterruptedIOException() public java.io.InterruptedIOException()}.
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
    public void create_InterruptedIOException()
    throws Exception {
        // create new instance
        final InterruptedIOException sut = new InterruptedIOException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InterruptedIOException#InterruptedIOException(String) public
     * java.io.InterruptedIOException(java.lang.String)}.
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
    public void create_InterruptedIOException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InterruptedIOException sut = null; // = new InterruptedIOException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.InterruptedIOException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.InterruptedIOException]

}
