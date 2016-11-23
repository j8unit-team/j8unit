package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.cert.CertificateExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateExceptionClassTest
implements CertificateExceptionClassTests<CertificateException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.CertificateException]

    @Override
    public Class<CertificateException> createNewSUT() {
        return CertificateException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateException#CertificateException() public
     * javax.security.cert.CertificateException()}.
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
    public void create_CertificateException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateException sut = new CertificateException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateException#CertificateException(String) public
     * javax.security.cert.CertificateException(java.lang.String)}.
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
    public void create_CertificateException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateException sut = null; // = new CertificateException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.cert.CertificateException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.CertificateException]

}
