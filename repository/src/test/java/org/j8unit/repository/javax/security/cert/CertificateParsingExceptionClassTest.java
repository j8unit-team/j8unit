package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateParsingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateParsingException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.security.cert.CertificateParsingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateParsingExceptionClassTest
implements CertificateParsingExceptionClassTests<CertificateParsingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.CertificateParsingException]

    @Override
    public Class<CertificateParsingException> createNewSUT() {
        return CertificateParsingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateParsingException#CertificateParsingException() public
     * javax.security.cert.CertificateParsingException()}.
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
    public void create_CertificateParsingException()
    throws Exception {
        // create new instance
        final CertificateParsingException sut = new CertificateParsingException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.CertificateParsingException#CertificateParsingException(String) public
     * javax.security.cert.CertificateParsingException(java.lang.String)}.
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
    public void create_CertificateParsingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateParsingException sut = null; // = new CertificateParsingException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.cert.CertificateParsingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.CertificateParsingException]

}
