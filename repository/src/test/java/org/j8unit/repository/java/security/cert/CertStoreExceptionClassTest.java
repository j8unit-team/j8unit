package org.j8unit.repository.java.security.cert;

import java.security.cert.CertStoreException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertStoreException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertStoreExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertStoreExceptionClassTest
implements CertStoreExceptionClassTests<CertStoreException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertStoreException]

    @Override
    public Class<CertStoreException> createNewSUT() {
        return CertStoreException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertStoreException#CertStoreException(String, Throwable) public
     * java.security.cert.CertStoreException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CertStoreException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertStoreException sut = null; // = new CertStoreException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertStoreException#CertStoreException(Throwable) public
     * java.security.cert.CertStoreException(java.lang.Throwable)}.
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
    public void create_CertStoreException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertStoreException sut = null; // = new CertStoreException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertStoreException#CertStoreException(String) public
     * java.security.cert.CertStoreException(java.lang.String)}.
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
    public void create_CertStoreException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertStoreException sut = null; // = new CertStoreException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertStoreException#CertStoreException() public
     * java.security.cert.CertStoreException()}.
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
    public void create_CertStoreException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertStoreException sut = new CertStoreException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertStoreException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertStoreException]

}
