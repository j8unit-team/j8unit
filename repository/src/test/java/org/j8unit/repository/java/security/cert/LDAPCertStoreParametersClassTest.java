package org.j8unit.repository.java.security.cert;

import java.security.cert.LDAPCertStoreParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LDAPCertStoreParameters} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.LDAPCertStoreParametersClassTests}).
 */
@RunWith(J8Unit4.class)
public class LDAPCertStoreParametersClassTest
implements LDAPCertStoreParametersClassTests<LDAPCertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.LDAPCertStoreParameters]

    @Override
    public Class<LDAPCertStoreParameters> createNewSUT() {
        return LDAPCertStoreParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.LDAPCertStoreParameters#LDAPCertStoreParameters(String, int) public
     * java.security.cert.LDAPCertStoreParameters(java.lang.String,int)}.
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
    public void create_LDAPCertStoreParameters_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LDAPCertStoreParameters sut = null; // = new LDAPCertStoreParameters(String, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.LDAPCertStoreParameters#LDAPCertStoreParameters() public
     * java.security.cert.LDAPCertStoreParameters()}.
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
    public void create_LDAPCertStoreParameters()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LDAPCertStoreParameters sut = new LDAPCertStoreParameters();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.LDAPCertStoreParameters#LDAPCertStoreParameters(String) public
     * java.security.cert.LDAPCertStoreParameters(java.lang.String)}.
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
    public void create_LDAPCertStoreParameters_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LDAPCertStoreParameters sut = null; // = new LDAPCertStoreParameters(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.LDAPCertStoreParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.LDAPCertStoreParameters]

}
