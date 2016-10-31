package org.j8unit.repository.java.nio.file;

import java.nio.file.ClosedDirectoryStreamException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedDirectoryStreamExceptionClassTest
implements org.j8unit.repository.java.nio.file.ClosedDirectoryStreamExceptionClassTests<ClosedDirectoryStreamException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.ClosedDirectoryStreamException]

    @Override
    public Class<ClosedDirectoryStreamException> createNewSUT() {
        return ClosedDirectoryStreamException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.ClosedDirectoryStreamException#ClosedDirectoryStreamException() public
     * java.nio.file.ClosedDirectoryStreamException()}.
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
    public void create_ClosedDirectoryStreamException()
    throws Exception {
        // create new instance
        final ClosedDirectoryStreamException sut = new ClosedDirectoryStreamException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.ClosedDirectoryStreamException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.ClosedDirectoryStreamException]

}
