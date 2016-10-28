package org.j8unit.repository.java.io;

import java.io.FileReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileReaderClassTest
implements org.j8unit.repository.java.io.FileReaderClassTests<FileReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileReader]

    @Override
    public Class<FileReader> createNewSUT() {
        return FileReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileReader#FileReader(String) public
     * java.io.FileReader(java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_FileReader_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileReader sut = null; // = new FileReader(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileReader#FileReader(java.io.File)
     * public java.io.FileReader(java.io.File) throws java.io.FileNotFoundException}.
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
    public void create_FileReader_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileReader sut = null; // = new FileReader(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileReader#FileReader(java.io.FileDescriptor) public java.io.FileReader(java.io.FileDescriptor)}.
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
    public void create_FileReader_FileDescriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileReader sut = null; // = new FileReader(java.io.FileDescriptor);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileReader]

}
