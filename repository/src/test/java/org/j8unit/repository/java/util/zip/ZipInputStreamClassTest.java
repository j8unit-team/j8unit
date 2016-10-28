package org.j8unit.repository.java.util.zip;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipInputStreamClassTest
implements org.j8unit.repository.java.util.zip.ZipInputStreamClassTests<ZipInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.ZipInputStream]

    @Override
    public Class<ZipInputStream> createNewSUT() {
        return ZipInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ZipInputStream#ZipInputStream(InputStream, Charset) public
     * java.util.zip.ZipInputStream(java.io.InputStream,java.nio.charset.Charset)}.
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
    public void create_ZipInputStream_InputStream_Charset()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipInputStream sut = null; // = new ZipInputStream(InputStream, Charset);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ZipInputStream#ZipInputStream(InputStream)
     * public java.util.zip.ZipInputStream(java.io.InputStream)}.
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
    public void create_ZipInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipInputStream sut = null; // = new ZipInputStream(InputStream);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.ZipInputStream]

}
