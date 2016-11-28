package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.FileImageInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileImageInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.stream.FileImageInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileImageInputStreamClassTest
implements FileImageInputStreamClassTests<FileImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.FileImageInputStream]

    @Override
    public Class<FileImageInputStream> createNewSUT() {
        return FileImageInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.FileImageInputStream#FileImageInputStream(java.io.File) public
     * javax.imageio.stream.FileImageInputStream(java.io.File) throws
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
    public void create_FileImageInputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileImageInputStream sut = null; // = new FileImageInputStream(java.io.File);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.FileImageInputStream#FileImageInputStream(java.io.RandomAccessFile) public
     * javax.imageio.stream.FileImageInputStream(java.io.RandomAccessFile)}.
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
    public void create_FileImageInputStream_RandomAccessFile()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileImageInputStream sut = null; // = new FileImageInputStream(java.io.RandomAccessFile);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.FileImageInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.FileImageInputStream]

}
