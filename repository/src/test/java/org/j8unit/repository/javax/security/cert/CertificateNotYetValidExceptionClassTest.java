package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateNotYetValidException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateNotYetValidException} (by
 * simply reusing the J8Unit test interface {@link CertificateNotYetValidExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateNotYetValidExceptionClassTest
implements CertificateNotYetValidExceptionClassTests<CertificateNotYetValidException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.CertificateNotYetValidException]

    @Override
    public Class<CertificateNotYetValidException> createNewSUT() {
        return CertificateNotYetValidException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateNotYetValidException#CertificateNotYetValidException() public
     * javax.security.cert.CertificateNotYetValidException()}.
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
    public void create_CertificateNotYetValidException()
    throws Exception {
        // create new instance
        final CertificateNotYetValidException sut = new CertificateNotYetValidException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateNotYetValidException#CertificateNotYetValidException(String) public
     * javax.security.cert.CertificateNotYetValidException(java.lang.String)}.
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
    public void create_CertificateNotYetValidException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateNotYetValidException sut = null; // = new CertificateNotYetValidException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.cert.CertificateNotYetValidException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.CertificateNotYetValidException]

}
