package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.MemoryCacheImageInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryCacheImageInputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.MemoryCacheImageInputStreamClassTests<MemoryCacheImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.MemoryCacheImageInputStream]

    @Override
    public Class<MemoryCacheImageInputStream> createNewSUT() {
        return MemoryCacheImageInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.MemoryCacheImageInputStream#MemoryCacheImageInputStream(java.io.InputStream) public
     * javax.imageio.stream.MemoryCacheImageInputStream(java.io.InputStream)}.
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
    public void create_MemoryCacheImageInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MemoryCacheImageInputStream sut = null; // = new MemoryCacheImageInputStream(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.MemoryCacheImageInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.MemoryCacheImageInputStream]

}
