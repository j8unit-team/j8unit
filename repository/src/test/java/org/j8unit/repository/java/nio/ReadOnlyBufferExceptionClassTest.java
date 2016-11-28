package org.j8unit.repository.java.nio;

import java.nio.ReadOnlyBufferException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReadOnlyBufferException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.ReadOnlyBufferExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReadOnlyBufferExceptionClassTest
implements ReadOnlyBufferExceptionClassTests<ReadOnlyBufferException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.ReadOnlyBufferException]

    @Override
    public Class<ReadOnlyBufferException> createNewSUT() {
        return ReadOnlyBufferException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.ReadOnlyBufferException#ReadOnlyBufferException() public java.nio.ReadOnlyBufferException()}.
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
    public void create_ReadOnlyBufferException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ReadOnlyBufferException sut = new ReadOnlyBufferException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.ReadOnlyBufferException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.ReadOnlyBufferException]

}
