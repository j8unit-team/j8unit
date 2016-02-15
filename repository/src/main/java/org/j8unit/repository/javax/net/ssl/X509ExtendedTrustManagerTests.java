package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.X509ExtendedTrustManager class
 * javax.net.ssl.X509ExtendedTrustManager}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link X509ExtendedTrustManagerClassTests}.
 * </p>
 *
 * @see javax.net.ssl.X509ExtendedTrustManager class javax.net.ssl.X509ExtendedTrustManager (the hereby targeted
 *      class-under-test class)
 * @see X509ExtendedTrustManagerClassTests X509ExtendedTrustManagerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509ExtendedTrustManagerTests<SUT extends javax.net.ssl.X509ExtendedTrustManager>
extends X509TrustManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String, javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String, javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String,
     *      javax.net.ssl.SSLEngine) public abstract void
     *      javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.
     *      String,javax.net.ssl.SSLEngine) throws java.security.cert.CertificateException (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String, java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String, java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String,
     *      java.net.Socket) public abstract void
     *      javax.net.ssl.X509ExtendedTrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.
     *      String,java.net.Socket) throws java.security.cert.CertificateException (the hereby targeted
     *      method-under-test)
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
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String, javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String, javax.net.ssl.SSLEngine)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,javax.net.ssl.SSLEngine)
     * throws java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String,
     *      javax.net.ssl.SSLEngine) public abstract void
     *      javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.
     *      String,javax.net.ssl.SSLEngine) throws java.security.cert.CertificateException (the hereby targeted
     *      method-under-test)
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
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String, java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String, java.net.Socket)
     * public abstract void
     * javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String,java.net.Socket)
     * throws java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String,
     *      java.net.Socket) public abstract void
     *      javax.net.ssl.X509ExtendedTrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.
     *      String,java.net.Socket) throws java.security.cert.CertificateException (the hereby targeted
     *      method-under-test)
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

}
