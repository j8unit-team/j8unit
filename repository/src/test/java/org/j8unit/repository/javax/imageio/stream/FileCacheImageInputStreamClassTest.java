package org.j8unit.repository.javax.imageio.stream;

import java.io.File;
import java.io.InputStream;
import javax.imageio.stream.FileCacheImageInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileCacheImageInputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.FileCacheImageInputStreamClassTests<FileCacheImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.FileCacheImageInputStream]

    @Override
    public Class<FileCacheImageInputStream> createNewSUT() {
        return FileCacheImageInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link FileCacheImageInputStream#FileCacheImageInputStream(InputStream, File) public
     * javax.imageio.stream.FileCacheImageInputStream(java.io.InputStream,java.io.File) throws java.io.IOException}.
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
    public void create_FileCacheImageInputStream_InputStream_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FileCacheImageInputStream sut = null; // = new FileCacheImageInputStream(InputStream, File);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.FileCacheImageInputStream]

}
