package org.j8unit.repository.java.io;

import java.io.FileOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileOutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.FileOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileOutputStreamClassTest
implements FileOutputStreamClassTests<FileOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileOutputStream]

    @Override
    public Class<FileOutputStream> createNewSUT() {
        return FileOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileOutputStream#FileOutputStream(java.io.FileDescriptor) public
     * java.io.FileOutputStream(java.io.FileDescriptor)}.
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
    public void create_FileOutputStream_FileDescriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileOutputStream sut = null; // = new FileOutputStream(java.io.FileDescriptor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileOutputStream#FileOutputStream(java.io.File, boolean) public
     * java.io.FileOutputStream(java.io.File,boolean) throws java.io.FileNotFoundException}.
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
    public void create_FileOutputStream_File_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileOutputStream sut = null; // = new FileOutputStream(java.io.File, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileOutputStream#FileOutputStream(java.io.File) public java.io.FileOutputStream(java.io.File)
     * throws java.io.FileNotFoundException}.
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
    public void create_FileOutputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileOutputStream sut = null; // = new FileOutputStream(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileOutputStream#FileOutputStream(String, boolean) public
     * java.io.FileOutputStream(java.lang.String,boolean) throws java.io.FileNotFoundException}.
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
    public void create_FileOutputStream_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileOutputStream sut = null; // = new FileOutputStream(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileOutputStream#FileOutputStream(String) public java.io.FileOutputStream(java.lang.String) throws
     * java.io.FileNotFoundException}.
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
    public void create_FileOutputStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileOutputStream sut = null; // = new FileOutputStream(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FileOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileOutputStream]

}
