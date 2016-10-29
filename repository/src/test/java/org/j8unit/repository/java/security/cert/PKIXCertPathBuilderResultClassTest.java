package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathBuilderResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathBuilderResultClassTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathBuilderResultClassTests<PKIXCertPathBuilderResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXCertPathBuilderResult]

    @Override
    public Class<PKIXCertPathBuilderResult> createNewSUT() {
        return PKIXCertPathBuilderResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXCertPathBuilderResult#PKIXCertPathBuilderResult(java.security.cert.CertPath, java.security.cert.TrustAnchor, java.security.cert.PolicyNode, java.security.PublicKey)
     * public
     * java.security.cert.PKIXCertPathBuilderResult(java.security.cert.CertPath,java.security.cert.TrustAnchor,java.security.cert.PolicyNode,java.security.PublicKey)}.
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
    public void create_PKIXCertPathBuilderResult_CertPath_TrustAnchor_PolicyNode_PublicKey()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXCertPathBuilderResult sut = null; // = new PKIXCertPathBuilderResult(java.security.cert.CertPath,
                                                    // java.security.cert.TrustAnchor, java.security.cert.PolicyNode,
                                                    // java.security.PublicKey);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXCertPathBuilderResult]

}
