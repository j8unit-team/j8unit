package org.j8unit.repository.java.nio;

import java.nio.ReadOnlyBufferException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadOnlyBufferExceptionClassTest
implements org.j8unit.repository.java.nio.ReadOnlyBufferExceptionClassTests<ReadOnlyBufferException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.ReadOnlyBufferException]

    @Override
    public Class<ReadOnlyBufferException> createNewSUT() {
        return ReadOnlyBufferException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ReadOnlyBufferException#ReadOnlyBufferException() public java.nio.ReadOnlyBufferException()}.
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
        final ReadOnlyBufferException sut = new ReadOnlyBufferException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.ReadOnlyBufferException]

}
