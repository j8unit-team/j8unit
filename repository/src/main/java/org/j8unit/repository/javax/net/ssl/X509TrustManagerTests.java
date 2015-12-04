package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.X509TrustManager interface javax.net.ssl.X509TrustManager}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.X509TrustManagerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509TrustManagerTests<SUT extends javax.net.ssl.X509TrustManager>
extends org.j8unit.repository.javax.net.ssl.TrustManagerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String)
     * public abstract void
     * javax.net.ssl.X509TrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkClientTrusted_X509CertificateArray_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String)
     * public abstract void
     * javax.net.ssl.X509TrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkServerTrusted_X509CertificateArray_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.X509TrustManager#getAcceptedIssuers() public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509TrustManager.getAcceptedIssuers()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAcceptedIssuers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
