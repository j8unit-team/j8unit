package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.CertPathTrustManagerParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathTrustManagerParameters} (by
 * simply reusing the J8Unit test interface {@link CertPathTrustManagerParametersClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertPathTrustManagerParametersClassTest
implements CertPathTrustManagerParametersClassTests<CertPathTrustManagerParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.CertPathTrustManagerParameters]

    @Override
    public Class<CertPathTrustManagerParameters> createNewSUT() {
        return CertPathTrustManagerParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.CertPathTrustManagerParameters#CertPathTrustManagerParameters(java.security.cert.CertPathParameters)
     * public javax.net.ssl.CertPathTrustManagerParameters(java.security.cert.CertPathParameters)}.
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
    public void create_CertPathTrustManagerParameters_CertPathParameters()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathTrustManagerParameters sut = null; // = new
                                                         // CertPathTrustManagerParameters(java.security.cert.CertPathParameters);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.CertPathTrustManagerParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.CertPathTrustManagerParameters]

}
