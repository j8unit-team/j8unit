package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZipOutputStream} (by simply reusing the
 * J8Unit test interface {@link ZipOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ZipOutputStreamClassTest
implements ZipOutputStreamClassTests<ZipOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.ZipOutputStream]

    @Override
    public Class<ZipOutputStream> createNewSUT() {
        return ZipOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.ZipOutputStream#ZipOutputStream(java.io.OutputStream, java.nio.charset.Charset) public
     * java.util.zip.ZipOutputStream(java.io.OutputStream,java.nio.charset.Charset)}.
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
    public void create_ZipOutputStream_OutputStream_Charset()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipOutputStream sut = null; // = new ZipOutputStream(java.io.OutputStream, java.nio.charset.Charset);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.ZipOutputStream#ZipOutputStream(java.io.OutputStream) public
     * java.util.zip.ZipOutputStream(java.io.OutputStream)}.
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
    public void create_ZipOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipOutputStream sut = null; // = new ZipOutputStream(java.io.OutputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.ZipOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.ZipOutputStream]

}
