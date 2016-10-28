package org.j8unit.repository.java.util.zip;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GZIPInputStreamClassTest
implements org.j8unit.repository.java.util.zip.GZIPInputStreamClassTests<GZIPInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.GZIPInputStream]

    @Override
    public Class<GZIPInputStream> createNewSUT() {
        return GZIPInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link GZIPInputStream#GZIPInputStream(InputStream)
     * public java.util.zip.GZIPInputStream(java.io.InputStream) throws java.io.IOException}.
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
    public void create_GZIPInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GZIPInputStream sut = null; // = new GZIPInputStream(InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link GZIPInputStream#GZIPInputStream(InputStream, int) public
     * java.util.zip.GZIPInputStream(java.io.InputStream,int) throws java.io.IOException}.
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
    public void create_GZIPInputStream_InputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GZIPInputStream sut = null; // = new GZIPInputStream(InputStream, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.GZIPInputStream]

}
