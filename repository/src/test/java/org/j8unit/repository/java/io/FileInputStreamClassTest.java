package org.j8unit.repository.java.io;

import java.io.FileInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileInputStreamClassTest
implements org.j8unit.repository.java.io.FileInputStreamClassTests<FileInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileInputStream]

    @Override
    public Class<FileInputStream> createNewSUT() {
        return FileInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileInputStream#FileInputStream(java.io.FileDescriptor) public
     * java.io.FileInputStream(java.io.FileDescriptor)}.
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
    public void create_FileInputStream_FileDescriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileInputStream sut = null; // = new FileInputStream(java.io.FileDescriptor);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.FileInputStream#FileInputStream(java.io.File) public java.io.FileInputStream(java.io.File) throws
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
    public void create_FileInputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileInputStream sut = null; // = new FileInputStream(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.FileInputStream#FileInputStream(String)
     * public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_FileInputStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileInputStream sut = null; // = new FileInputStream(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileInputStream]

}
