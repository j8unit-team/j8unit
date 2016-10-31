package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryIteratorException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryIteratorExceptionClassTest
implements org.j8unit.repository.java.nio.file.DirectoryIteratorExceptionClassTests<DirectoryIteratorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.DirectoryIteratorException]

    @Override
    public Class<DirectoryIteratorException> createNewSUT() {
        return DirectoryIteratorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.DirectoryIteratorException#DirectoryIteratorException(java.io.IOException) public
     * java.nio.file.DirectoryIteratorException(java.io.IOException)}.
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
    public void create_DirectoryIteratorException_IOException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DirectoryIteratorException sut = null; // = new DirectoryIteratorException(java.io.IOException);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.DirectoryIteratorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.DirectoryIteratorException]

}
