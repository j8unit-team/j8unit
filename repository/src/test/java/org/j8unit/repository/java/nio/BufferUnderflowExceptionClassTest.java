package org.j8unit.repository.java.nio;

import java.nio.BufferUnderflowException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferUnderflowException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.BufferUnderflowExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferUnderflowExceptionClassTest
implements BufferUnderflowExceptionClassTests<BufferUnderflowException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.BufferUnderflowException]

    @Override
    public Class<BufferUnderflowException> createNewSUT() {
        return BufferUnderflowException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.BufferUnderflowException#BufferUnderflowException() public java.nio.BufferUnderflowException()}.
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
    public void create_BufferUnderflowException()
    throws Exception {
        // create new instance
        final BufferUnderflowException sut = new BufferUnderflowException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.BufferUnderflowException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.BufferUnderflowException]

}
