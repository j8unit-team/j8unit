package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystemAlreadyExistsException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileSystemAlreadyExistsException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.FileSystemAlreadyExistsExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileSystemAlreadyExistsExceptionClassTest
implements FileSystemAlreadyExistsExceptionClassTests<FileSystemAlreadyExistsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileSystemAlreadyExistsException]

    @Override
    public Class<FileSystemAlreadyExistsException> createNewSUT() {
        return FileSystemAlreadyExistsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.FileSystemAlreadyExistsException#FileSystemAlreadyExistsException() public
     * java.nio.file.FileSystemAlreadyExistsException()}.
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
    public void create_FileSystemAlreadyExistsException()
    throws Exception {
        // create new instance
        final FileSystemAlreadyExistsException sut = new FileSystemAlreadyExistsException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.FileSystemAlreadyExistsException#FileSystemAlreadyExistsException(String) public
     * java.nio.file.FileSystemAlreadyExistsException(java.lang.String)}.
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
    public void create_FileSystemAlreadyExistsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileSystemAlreadyExistsException sut = null; // = new FileSystemAlreadyExistsException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.FileSystemAlreadyExistsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileSystemAlreadyExistsException]

}
