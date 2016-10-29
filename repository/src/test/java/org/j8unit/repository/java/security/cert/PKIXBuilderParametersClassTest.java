package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXBuilderParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXBuilderParametersClassTest
implements org.j8unit.repository.java.security.cert.PKIXBuilderParametersClassTests<PKIXBuilderParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXBuilderParameters]

    @Override
    public Class<PKIXBuilderParameters> createNewSUT() {
        return PKIXBuilderParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXBuilderParameters#PKIXBuilderParameters(java.util.Set, java.security.cert.CertSelector)
     * public
     * java.security.cert.PKIXBuilderParameters(java.util.Set<java.security.cert.TrustAnchor>,java.security.cert.CertSelector)
     * throws java.security.InvalidAlgorithmParameterException}.
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
    public void create_PKIXBuilderParameters_Set_CertSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXBuilderParameters sut = null; // = new PKIXBuilderParameters(java.util.Set,
                                                // java.security.cert.CertSelector);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXBuilderParameters#PKIXBuilderParameters(java.security.KeyStore, java.security.cert.CertSelector)
     * public java.security.cert.PKIXBuilderParameters(java.security.KeyStore,java.security.cert.CertSelector) throws
     * java.security.KeyStoreException,java.security.InvalidAlgorithmParameterException}.
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
    public void create_PKIXBuilderParameters_KeyStore_CertSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXBuilderParameters sut = null; // = new PKIXBuilderParameters(java.security.KeyStore,
                                                // java.security.cert.CertSelector);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXBuilderParameters]

}
