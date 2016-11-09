package org.j8unit.repository.javax.security.auth.x500;

import javax.security.auth.x500.X500PrivateCredential;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X500PrivateCredential} (by simply reusing
 * the J8Unit test interface {@link X500PrivateCredentialClassTests}).
 */

@RunWith(J8Unit4.class)
public class X500PrivateCredentialClassTest
implements X500PrivateCredentialClassTests<X500PrivateCredential> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.x500.X500PrivateCredential]

    @Override
    public Class<X500PrivateCredential> createNewSUT() {
        return X500PrivateCredential.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500PrivateCredential#X500PrivateCredential(java.security.cert.X509Certificate, java.security.PrivateKey)
     * public
     * javax.security.auth.x500.X500PrivateCredential(java.security.cert.X509Certificate,java.security.PrivateKey)}.
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
    public void create_X500PrivateCredential_X509Certificate_PrivateKey()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500PrivateCredential sut = null; // = new X500PrivateCredential(java.security.cert.X509Certificate,
                                                // java.security.PrivateKey);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500PrivateCredential#X500PrivateCredential(java.security.cert.X509Certificate, java.security.PrivateKey, String)
     * public
     * javax.security.auth.x500.X500PrivateCredential(java.security.cert.X509Certificate,java.security.PrivateKey,java.lang.String)}.
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
    public void create_X500PrivateCredential_X509Certificate_PrivateKey_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500PrivateCredential sut = null; // = new X500PrivateCredential(java.security.cert.X509Certificate,
                                                // java.security.PrivateKey, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.x500.X500PrivateCredential]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.x500.X500PrivateCredential]

}
