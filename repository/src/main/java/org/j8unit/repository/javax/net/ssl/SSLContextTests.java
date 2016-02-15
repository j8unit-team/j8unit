package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLContext class javax.net.ssl.SSLContext}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SSLContextClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLContext class javax.net.ssl.SSLContext (the hereby targeted class-under-test class)
 * @see SSLContextClassTests SSLContextClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLContextTests<SUT extends javax.net.ssl.SSLContext>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#createSSLEngine(String, int) public final javax.net.ssl.SSLEngine
     * javax.net.ssl.SSLContext.createSSLEngine(java.lang.String,int)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#createSSLEngine(String, int) public final javax.net.ssl.SSLEngine
     * javax.net.ssl.SSLContext.createSSLEngine(java.lang.String,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#createSSLEngine(String, int) public final javax.net.ssl.SSLEngine
     *      javax.net.ssl.SSLContext.createSSLEngine(java.lang.String,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSSLEngine_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#createSSLEngine() public final javax.net.ssl.SSLEngine
     * javax.net.ssl.SSLContext.createSSLEngine()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#createSSLEngine() public final javax.net.ssl.SSLEngine
     * javax.net.ssl.SSLContext.createSSLEngine()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#createSSLEngine() public final javax.net.ssl.SSLEngine
     *      javax.net.ssl.SSLContext.createSSLEngine() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSSLEngine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getSocketFactory() public final javax.net.ssl.SSLSocketFactory
     * javax.net.ssl.SSLContext.getSocketFactory()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getSocketFactory() public final javax.net.ssl.SSLSocketFactory
     * javax.net.ssl.SSLContext.getSocketFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getSocketFactory() public final javax.net.ssl.SSLSocketFactory
     *      javax.net.ssl.SSLContext.getSocketFactory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getServerSocketFactory() public final
     * javax.net.ssl.SSLServerSocketFactory javax.net.ssl.SSLContext.getServerSocketFactory()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getServerSocketFactory() public final
     * javax.net.ssl.SSLServerSocketFactory javax.net.ssl.SSLContext.getServerSocketFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getServerSocketFactory() public final javax.net.ssl.SSLServerSocketFactory
     *      javax.net.ssl.SSLContext.getServerSocketFactory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServerSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLContext#init(javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[], java.security.SecureRandom)
     * public final void
     * javax.net.ssl.SSLContext.init(javax.net.ssl.KeyManager[],javax.net.ssl.TrustManager[],java.security.SecureRandom)
     * throws java.security.KeyManagementException}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLContext#init(javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[], java.security.SecureRandom)
     * public final void
     * javax.net.ssl.SSLContext.init(javax.net.ssl.KeyManager[],javax.net.ssl.TrustManager[],java.security.SecureRandom)
     * throws java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#init(javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[],
     *      java.security.SecureRandom) public final void
     *      javax.net.ssl.SSLContext.init(javax.net.ssl.KeyManager[],javax.net.ssl.TrustManager[],java.security.
     *      SecureRandom) throws java.security.KeyManagementException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_KeyManagerArray_TrustManagerArray_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getProtocol() public final java.lang.String
     * javax.net.ssl.SSLContext.getProtocol()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getProtocol() public final java.lang.String
     * javax.net.ssl.SSLContext.getProtocol()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getProtocol() public final java.lang.String javax.net.ssl.SSLContext.getProtocol()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProtocol()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getSupportedSSLParameters() public final
     * javax.net.ssl.SSLParameters javax.net.ssl.SSLContext.getSupportedSSLParameters()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getSupportedSSLParameters() public final
     * javax.net.ssl.SSLParameters javax.net.ssl.SSLContext.getSupportedSSLParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getSupportedSSLParameters() public final javax.net.ssl.SSLParameters
     *      javax.net.ssl.SSLContext.getSupportedSSLParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedSSLParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getProvider() public final java.security.Provider
     * javax.net.ssl.SSLContext.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getProvider() public final java.security.Provider
     * javax.net.ssl.SSLContext.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getProvider() public final java.security.Provider
     *      javax.net.ssl.SSLContext.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getServerSessionContext() public final
     * javax.net.ssl.SSLSessionContext javax.net.ssl.SSLContext.getServerSessionContext()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getServerSessionContext() public final
     * javax.net.ssl.SSLSessionContext javax.net.ssl.SSLContext.getServerSessionContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getServerSessionContext() public final javax.net.ssl.SSLSessionContext
     *      javax.net.ssl.SSLContext.getServerSessionContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServerSessionContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getClientSessionContext() public final
     * javax.net.ssl.SSLSessionContext javax.net.ssl.SSLContext.getClientSessionContext()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getClientSessionContext() public final
     * javax.net.ssl.SSLSessionContext javax.net.ssl.SSLContext.getClientSessionContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getClientSessionContext() public final javax.net.ssl.SSLSessionContext
     *      javax.net.ssl.SSLContext.getClientSessionContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClientSessionContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getDefaultSSLParameters() public final
     * javax.net.ssl.SSLParameters javax.net.ssl.SSLContext.getDefaultSSLParameters()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLContext#getDefaultSSLParameters() public final
     * javax.net.ssl.SSLParameters javax.net.ssl.SSLContext.getDefaultSSLParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLContext#getDefaultSSLParameters() public final javax.net.ssl.SSLParameters
     *      javax.net.ssl.SSLContext.getDefaultSSLParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultSSLParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
