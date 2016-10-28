package org.j8unit.repository.javax.imageio.stream;

import java.io.File;
import java.io.RandomAccessFile;
import javax.imageio.stream.FileImageOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileImageOutputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.FileImageOutputStreamClassTests<FileImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.FileImageOutputStream]

    @Override
    public Class<FileImageOutputStream> createNewSUT() {
        return FileImageOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link FileImageOutputStream#FileImageOutputStream(File) public
     * javax.imageio.stream.FileImageOutputStream(java.io.File) throws
     * java.io.FileNotFoundException,java.io.IOException}.
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
    public void create_FileImageOutputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileImageOutputStream sut = null; // = new FileImageOutputStream(File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link FileImageOutputStream#FileImageOutputStream(RandomAccessFile) public
     * javax.imageio.stream.FileImageOutputStream(java.io.RandomAccessFile)}.
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
    public void create_FileImageOutputStream_RandomAccessFile()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileImageOutputStream sut = null; // = new FileImageOutputStream(RandomAccessFile);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.FileImageOutputStream]

}
