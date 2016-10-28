package org.j8unit.repository.java.io;

import java.io.File;
import java.io.RandomAccessFile;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RandomAccessFileClassTest
implements org.j8unit.repository.java.io.RandomAccessFileClassTests<RandomAccessFile> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.RandomAccessFile]

    @Override
    public Class<RandomAccessFile> createNewSUT() {
        return RandomAccessFile.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RandomAccessFile#RandomAccessFile(String, String) public
     * java.io.RandomAccessFile(java.lang.String,java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_RandomAccessFile_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RandomAccessFile sut = null; // = new RandomAccessFile(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RandomAccessFile#RandomAccessFile(File, String)
     * public java.io.RandomAccessFile(java.io.File,java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_RandomAccessFile_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RandomAccessFile sut = null; // = new RandomAccessFile(File, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.RandomAccessFile]

}
