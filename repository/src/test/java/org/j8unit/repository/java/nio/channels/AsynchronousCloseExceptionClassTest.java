package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousCloseException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsynchronousCloseException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.AsynchronousCloseExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AsynchronousCloseExceptionClassTest
implements AsynchronousCloseExceptionClassTests<AsynchronousCloseException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousCloseException]

    @Override
    public Class<AsynchronousCloseException> createNewSUT() {
        return AsynchronousCloseException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.AsynchronousCloseException#AsynchronousCloseException() public
     * java.nio.channels.AsynchronousCloseException()}.
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
    public void create_AsynchronousCloseException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AsynchronousCloseException sut = new AsynchronousCloseException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousCloseException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousCloseException]

}
