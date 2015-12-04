package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.X509ExtendedTrustManager class javax.net.ssl.X509ExtendedTrustManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.X509ExtendedTrustManagerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedTrustManagerTests<SUT extends javax.net.ssl.X509ExtendedTrustManager>
extends org.j8unit.repository.javax.net.ssl.X509TrustManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkClientTrusted_X509CertificateArray_String_Socket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkClientTrusted_X509CertificateArray_String_SSLEngine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkServerTrusted_X509CertificateArray_String_Socket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkServerTrusted_X509CertificateArray_String_SSLEngine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
