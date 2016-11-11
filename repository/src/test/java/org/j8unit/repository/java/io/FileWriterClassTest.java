package org.j8unit.repository.java.io;

import java.io.FileWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileWriter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.FileWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileWriterClassTest
implements FileWriterClassTests<FileWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileWriter]

    @Override
    public Class<FileWriter> createNewSUT() {
        return FileWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileWriter#FileWriter(java.io.FileDescriptor) public java.io.FileWriter(java.io.FileDescriptor)}.
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
    public void create_FileWriter_FileDescriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileWriter sut = null; // = new FileWriter(java.io.FileDescriptor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileWriter#FileWriter(java.io.File, boolean) public java.io.FileWriter(java.io.File,boolean)
     * throws java.io.IOException}.
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
    public void create_FileWriter_File_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileWriter sut = null; // = new FileWriter(java.io.File, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileWriter#FileWriter(java.io.File)
     * public java.io.FileWriter(java.io.File) throws java.io.IOException}.
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
    public void create_FileWriter_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileWriter sut = null; // = new FileWriter(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileWriter#FileWriter(String, boolean)
     * public java.io.FileWriter(java.lang.String,boolean) throws java.io.IOException}.
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
    public void create_FileWriter_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileWriter sut = null; // = new FileWriter(String, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileWriter#FileWriter(String) public
     * java.io.FileWriter(java.lang.String) throws java.io.IOException}.
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
    public void create_FileWriter_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileWriter sut = null; // = new FileWriter(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FileWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileWriter]

}
