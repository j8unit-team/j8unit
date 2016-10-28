package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipExceptionClassTest
implements org.j8unit.repository.java.util.zip.ZipExceptionClassTests<ZipException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.ZipException]

    @Override
    public Class<ZipException> createNewSUT() {
        return ZipException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.ZipException#ZipException()
     * public java.util.zip.ZipException()}.
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
    public void create_ZipException()
    throws Exception {
        // create new instance
        final ZipException sut = new ZipException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.ZipException#ZipException(String)
     * public java.util.zip.ZipException(java.lang.String)}.
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
    public void create_ZipException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipException sut = null; // = new ZipException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.ZipException]

}
