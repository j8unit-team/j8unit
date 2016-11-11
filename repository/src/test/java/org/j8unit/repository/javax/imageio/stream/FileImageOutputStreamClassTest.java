package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.FileImageOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileImageOutputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.stream.FileImageOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileImageOutputStreamClassTest
implements FileImageOutputStreamClassTests<FileImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.FileImageOutputStream]

    @Override
    public Class<FileImageOutputStream> createNewSUT() {
        return FileImageOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.FileImageOutputStream#FileImageOutputStream(java.io.File) public
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
        final FileImageOutputStream sut = null; // = new FileImageOutputStream(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.FileImageOutputStream#FileImageOutputStream(java.io.RandomAccessFile) public
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
        final FileImageOutputStream sut = null; // = new FileImageOutputStream(java.io.RandomAccessFile);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.FileImageOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.FileImageOutputStream]

}
