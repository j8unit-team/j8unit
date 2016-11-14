package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathValidatorResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKIXCertPathValidatorResult} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.PKIXCertPathValidatorResultClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKIXCertPathValidatorResultClassTest
implements PKIXCertPathValidatorResultClassTests<PKIXCertPathValidatorResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXCertPathValidatorResult]

    @Override
    public Class<PKIXCertPathValidatorResult> createNewSUT() {
        return PKIXCertPathValidatorResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXCertPathValidatorResult#PKIXCertPathValidatorResult(java.security.cert.TrustAnchor, java.security.cert.PolicyNode, java.security.PublicKey)
     * public
     * java.security.cert.PKIXCertPathValidatorResult(java.security.cert.TrustAnchor,java.security.cert.PolicyNode,java.security.PublicKey)}.
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
    public void create_PKIXCertPathValidatorResult_TrustAnchor_PolicyNode_PublicKey()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXCertPathValidatorResult sut = null; // = new
                                                      // PKIXCertPathValidatorResult(java.security.cert.TrustAnchor,
                                                      // java.security.cert.PolicyNode, java.security.PublicKey);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PKIXCertPathValidatorResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXCertPathValidatorResult]

}
