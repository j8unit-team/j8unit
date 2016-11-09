package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateEncodingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateEncodingException} (by simply
 * reusing the J8Unit test interface {@link CertificateEncodingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateEncodingExceptionClassTest
implements CertificateEncodingExceptionClassTests<CertificateEncodingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.CertificateEncodingException]

    @Override
    public Class<CertificateEncodingException> createNewSUT() {
        return CertificateEncodingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateEncodingException#CertificateEncodingException() public
     * javax.security.cert.CertificateEncodingException()}.
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
    public void create_CertificateEncodingException()
    throws Exception {
        // create new instance
        final CertificateEncodingException sut = new CertificateEncodingException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateEncodingException#CertificateEncodingException(String) public
     * javax.security.cert.CertificateEncodingException(java.lang.String)}.
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
    public void create_CertificateEncodingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateEncodingException sut = null; // = new CertificateEncodingException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.cert.CertificateEncodingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.CertificateEncodingException]

}
