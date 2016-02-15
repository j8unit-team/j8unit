package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLSocket class javax.net.ssl.SSLSocket}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SSLSocketClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLSocket class javax.net.ssl.SSLSocket (the hereby targeted class-under-test class)
 * @see SSLSocketClassTests SSLSocketClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLSocketTests<SUT extends javax.net.ssl.SSLSocket>
extends org.j8unit.repository.java.net.SocketTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getHandshakeSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSocket.getHandshakeSession()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getHandshakeSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSocket.getHandshakeSession()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getHandshakeSession() public javax.net.ssl.SSLSession
     *      javax.net.ssl.SSLSocket.getHandshakeSession() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHandshakeSession()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnabledCipherSuites(String[]) public abstract void
     * javax.net.ssl.SSLSocket.setEnabledCipherSuites(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnabledCipherSuites(String[]) public abstract void
     * javax.net.ssl.SSLSocket.setEnabledCipherSuites(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setEnabledCipherSuites(String[]) public abstract void
     *      javax.net.ssl.SSLSocket.setEnabledCipherSuites(java.lang.String[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEnabledCipherSuites_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnabledProtocols(String[]) public abstract void
     * javax.net.ssl.SSLSocket.setEnabledProtocols(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnabledProtocols(String[]) public abstract void
     * javax.net.ssl.SSLSocket.setEnabledProtocols(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setEnabledProtocols(String[]) public abstract void
     *      javax.net.ssl.SSLSocket.setEnabledProtocols(java.lang.String[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEnabledProtocols_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setSSLParameters(javax.net.ssl.SSLParameters) public void
     * javax.net.ssl.SSLSocket.setSSLParameters(javax.net.ssl.SSLParameters)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setSSLParameters(javax.net.ssl.SSLParameters) public void
     * javax.net.ssl.SSLSocket.setSSLParameters(javax.net.ssl.SSLParameters)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setSSLParameters(javax.net.ssl.SSLParameters) public void
     *      javax.net.ssl.SSLSocket.setSSLParameters(javax.net.ssl.SSLParameters) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSSLParameters_SSLParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSSLParameters() public javax.net.ssl.SSLParameters
     * javax.net.ssl.SSLSocket.getSSLParameters()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSSLParameters() public javax.net.ssl.SSLParameters
     * javax.net.ssl.SSLSocket.getSSLParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getSSLParameters() public javax.net.ssl.SSLParameters
     *      javax.net.ssl.SSLSocket.getSSLParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSSLParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#startHandshake() public abstract void
     * javax.net.ssl.SSLSocket.startHandshake() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#startHandshake() public abstract void
     * javax.net.ssl.SSLSocket.startHandshake() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#startHandshake() public abstract void javax.net.ssl.SSLSocket.startHandshake()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startHandshake()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnabledProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getEnabledProtocols()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnabledProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getEnabledProtocols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getEnabledProtocols() public abstract java.lang.String[]
     *      javax.net.ssl.SSLSocket.getEnabledProtocols() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledProtocols()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setWantClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setWantClientAuth(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setWantClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setWantClientAuth(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setWantClientAuth(boolean) public abstract void
     *      javax.net.ssl.SSLSocket.setWantClientAuth(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setWantClientAuth_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnableSessionCreation(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setEnableSessionCreation(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setEnableSessionCreation(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setEnableSessionCreation(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setEnableSessionCreation(boolean) public abstract void
     *      javax.net.ssl.SSLSocket.setEnableSessionCreation(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEnableSessionCreation_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLSocket#addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     * abstract void javax.net.ssl.SSLSocket.addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLSocket#addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     * abstract void javax.net.ssl.SSLSocket.addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     *      abstract void
     *      javax.net.ssl.SSLSocket.addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addHandshakeCompletedListener_HandshakeCompletedListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLSocket#removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     * abstract void javax.net.ssl.SSLSocket.removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.SSLSocket#removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     * abstract void javax.net.ssl.SSLSocket.removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) public
     *      abstract void
     *      javax.net.ssl.SSLSocket.removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeHandshakeCompletedListener_HandshakeCompletedListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setNeedClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setNeedClientAuth(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setNeedClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setNeedClientAuth(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setNeedClientAuth(boolean) public abstract void
     *      javax.net.ssl.SSLSocket.setNeedClientAuth(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNeedClientAuth_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSession() public abstract javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSocket.getSession()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSession() public abstract javax.net.ssl.SSLSession
     * javax.net.ssl.SSLSocket.getSession()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getSession() public abstract javax.net.ssl.SSLSession
     *      javax.net.ssl.SSLSocket.getSession() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSession()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSupportedProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getSupportedProtocols()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSupportedProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getSupportedProtocols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getSupportedProtocols() public abstract java.lang.String[]
     *      javax.net.ssl.SSLSocket.getSupportedProtocols() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedProtocols()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnableSessionCreation() public abstract boolean
     * javax.net.ssl.SSLSocket.getEnableSessionCreation()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnableSessionCreation() public abstract boolean
     * javax.net.ssl.SSLSocket.getEnableSessionCreation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getEnableSessionCreation() public abstract boolean
     *      javax.net.ssl.SSLSocket.getEnableSessionCreation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnableSessionCreation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getNeedClientAuth() public abstract boolean
     * javax.net.ssl.SSLSocket.getNeedClientAuth()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getNeedClientAuth() public abstract boolean
     * javax.net.ssl.SSLSocket.getNeedClientAuth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getNeedClientAuth() public abstract boolean
     *      javax.net.ssl.SSLSocket.getNeedClientAuth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNeedClientAuth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getUseClientMode() public abstract boolean
     * javax.net.ssl.SSLSocket.getUseClientMode()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getUseClientMode() public abstract boolean
     * javax.net.ssl.SSLSocket.getUseClientMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getUseClientMode() public abstract boolean
     *      javax.net.ssl.SSLSocket.getUseClientMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUseClientMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getWantClientAuth() public abstract boolean
     * javax.net.ssl.SSLSocket.getWantClientAuth()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getWantClientAuth() public abstract boolean
     * javax.net.ssl.SSLSocket.getWantClientAuth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getWantClientAuth() public abstract boolean
     *      javax.net.ssl.SSLSocket.getWantClientAuth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWantClientAuth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnabledCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getEnabledCipherSuites()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getEnabledCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getEnabledCipherSuites()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getEnabledCipherSuites() public abstract java.lang.String[]
     *      javax.net.ssl.SSLSocket.getEnabledCipherSuites() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setUseClientMode(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setUseClientMode(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#setUseClientMode(boolean) public abstract void
     * javax.net.ssl.SSLSocket.setUseClientMode(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#setUseClientMode(boolean) public abstract void
     *      javax.net.ssl.SSLSocket.setUseClientMode(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUseClientMode_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSupportedCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getSupportedCipherSuites()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocket#getSupportedCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocket.getSupportedCipherSuites()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLSocket#getSupportedCipherSuites() public abstract java.lang.String[]
     *      javax.net.ssl.SSLSocket.getSupportedCipherSuites() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
