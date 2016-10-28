package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateExpiredException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExpiredExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateExpiredExceptionClassTests<CertificateExpiredException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.CertificateExpiredException]

    @Override
    public Class<CertificateExpiredException> createNewSUT() {
        return CertificateExpiredException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateExpiredException#CertificateExpiredException() public
     * javax.security.cert.CertificateExpiredException()}.
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
    public void create_CertificateExpiredException()
    throws Exception {
        // create new instance
        final CertificateExpiredException sut = new CertificateExpiredException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateExpiredException#CertificateExpiredException(String) public
     * javax.security.cert.CertificateExpiredException(java.lang.String)}.
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
    public void create_CertificateExpiredException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateExpiredException sut = null; // = new CertificateExpiredException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.CertificateExpiredException]

}
