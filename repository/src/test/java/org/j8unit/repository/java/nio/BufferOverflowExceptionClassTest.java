package org.j8unit.repository.java.nio;

import java.nio.BufferOverflowException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferOverflowExceptionClassTest
implements org.j8unit.repository.java.nio.BufferOverflowExceptionClassTests<BufferOverflowException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.BufferOverflowException]

    @Override
    public Class<BufferOverflowException> createNewSUT() {
        return BufferOverflowException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link BufferOverflowException#BufferOverflowException() public java.nio.BufferOverflowException()}.
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
    public void create_BufferOverflowException()
    throws Exception {
        // create new instance
        final BufferOverflowException sut = new BufferOverflowException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.BufferOverflowException]

}
