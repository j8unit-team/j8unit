package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.FileCacheImageOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileCacheImageOutputStream} (by simply
 * reusing the J8Unit test interface {@link FileCacheImageOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileCacheImageOutputStreamClassTest
implements FileCacheImageOutputStreamClassTests<FileCacheImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.FileCacheImageOutputStream]

    @Override
    public Class<FileCacheImageOutputStream> createNewSUT() {
        return FileCacheImageOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.FileCacheImageOutputStream#FileCacheImageOutputStream(java.io.OutputStream, java.io.File)
     * public javax.imageio.stream.FileCacheImageOutputStream(java.io.OutputStream,java.io.File) throws
     * java.io.IOException}.
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
    public void create_FileCacheImageOutputStream_OutputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileCacheImageOutputStream sut = null; // = new FileCacheImageOutputStream(java.io.OutputStream,
                                                     // java.io.File);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.FileCacheImageOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.FileCacheImageOutputStream]

}
