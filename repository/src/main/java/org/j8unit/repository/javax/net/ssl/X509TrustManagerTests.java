package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.X509TrustManager interface javax.net.ssl.X509TrustManager}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link X509TrustManagerClassTests}.
 * </p>
 *
 * @see javax.net.ssl.X509TrustManager interface javax.net.ssl.X509TrustManager (the hereby targeted class-under-test
 *      class)
 * @see X509TrustManagerClassTests X509TrustManagerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509TrustManagerTests<SUT extends javax.net.ssl.X509TrustManager>
extends TrustManagerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String) public
     * abstract void
     * javax.net.ssl.X509TrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String) public
     * abstract void
     * javax.net.ssl.X509TrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], String) public
     *      abstract void
     *      javax.net.ssl.X509TrustManager.checkServerTrusted(java.security.cert.X509Certificate[],java.lang.String)
     *      throws java.security.cert.CertificateException (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String) public
     * abstract void
     * javax.net.ssl.X509TrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String) public
     * abstract void
     * javax.net.ssl.X509TrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[], String) public
     *      abstract void
     *      javax.net.ssl.X509TrustManager.checkClientTrusted(java.security.cert.X509Certificate[],java.lang.String)
     *      throws java.security.cert.CertificateException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.X509TrustManager#getAcceptedIssuers() public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509TrustManager.getAcceptedIssuers()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.X509TrustManager#getAcceptedIssuers() public abstract
     * java.security.cert.X509Certificate[] javax.net.ssl.X509TrustManager.getAcceptedIssuers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers() public abstract java.security.cert.X509Certificate[]
     *      javax.net.ssl.X509TrustManager.getAcceptedIssuers() (the hereby targeted method-under-test)
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
