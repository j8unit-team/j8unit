package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKIXParameters} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.PKIXParametersClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKIXParametersClassTest
implements PKIXParametersClassTests<PKIXParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXParameters]

    @Override
    public Class<PKIXParameters> createNewSUT() {
        return PKIXParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXParameters#PKIXParameters(java.util.Set) public
     * java.security.cert.PKIXParameters(java.util.Set<java.security.cert.TrustAnchor>) throws
     * java.security.InvalidAlgorithmParameterException}.
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
    public void create_PKIXParameters_Set()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXParameters sut = null; // = new PKIXParameters(java.util.Set);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PKIXParameters#PKIXParameters(java.security.KeyStore) public
     * java.security.cert.PKIXParameters(java.security.KeyStore) throws
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
    public void create_PKIXParameters_KeyStore()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKIXParameters sut = null; // = new PKIXParameters(java.security.KeyStore);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PKIXParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXParameters]

}
