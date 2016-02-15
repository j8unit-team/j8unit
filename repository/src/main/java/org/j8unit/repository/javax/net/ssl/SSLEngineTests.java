package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLEngine class javax.net.ssl.SSLEngine}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SSLEngineClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLEngine class javax.net.ssl.SSLEngine (the hereby targeted class-under-test class)
 * @see SSLEngineClassTests SSLEngineClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLEngineTests<SUT extends javax.net.ssl.SSLEngine>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[]) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[]) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[]) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[]) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[]) public
     *      javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[])
     *      throws javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_ByteBuffer_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     *      javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     *      javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_ByteBuffer_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[], int, int)
     * public abstract javax.net.ssl.SSLEngineResult
     * javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[],int,int) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[], int, int)
     * public abstract javax.net.ssl.SSLEngineResult
     * javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[],int,int) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#unwrap(java.nio.ByteBuffer, java.nio.ByteBuffer[], int, int) public abstract
     *      javax.net.ssl.SSLEngineResult
     *      javax.net.ssl.SSLEngine.unwrap(java.nio.ByteBuffer,java.nio.ByteBuffer[],int,int) throws
     *      javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_ByteBuffer_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#closeOutbound() public abstract void
     * javax.net.ssl.SSLEngine.closeOutbound()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#closeOutbound() public abstract void
     * javax.net.ssl.SSLEngine.closeOutbound()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#closeOutbound() public abstract void javax.net.ssl.SSLEngine.closeOutbound() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_closeOutbound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#isOutboundDone() public abstract boolean
     * javax.net.ssl.SSLEngine.isOutboundDone()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#isOutboundDone() public abstract boolean
     * javax.net.ssl.SSLEngine.isOutboundDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#isOutboundDone() public abstract boolean javax.net.ssl.SSLEngine.isOutboundDone()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOutboundDone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setWantClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setWantClientAuth(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setWantClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setWantClientAuth(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setWantClientAuth(boolean) public abstract void
     *      javax.net.ssl.SSLEngine.setWantClientAuth(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getSSLParameters() public javax.net.ssl.SSLParameters
     * javax.net.ssl.SSLEngine.getSSLParameters()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSSLParameters() public javax.net.ssl.SSLParameters
     * javax.net.ssl.SSLEngine.getSSLParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getSSLParameters() public javax.net.ssl.SSLParameters
     *      javax.net.ssl.SSLEngine.getSSLParameters() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getPeerPort() public int javax.net.ssl.SSLEngine.getPeerPort()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getPeerPort() public int javax.net.ssl.SSLEngine.getPeerPort()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getPeerPort() public int javax.net.ssl.SSLEngine.getPeerPort() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeerPort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#beginHandshake() public abstract void
     * javax.net.ssl.SSLEngine.beginHandshake() throws javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#beginHandshake() public abstract void
     * javax.net.ssl.SSLEngine.beginHandshake() throws javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#beginHandshake() public abstract void javax.net.ssl.SSLEngine.beginHandshake()
     *      throws javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_beginHandshake()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setUseClientMode(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setUseClientMode(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setUseClientMode(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setUseClientMode(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setUseClientMode(boolean) public abstract void
     *      javax.net.ssl.SSLEngine.setUseClientMode(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getPeerHost() public java.lang.String
     * javax.net.ssl.SSLEngine.getPeerHost()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getPeerHost() public java.lang.String
     * javax.net.ssl.SSLEngine.getPeerHost()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getPeerHost() public java.lang.String javax.net.ssl.SSLEngine.getPeerHost() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeerHost()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setSSLParameters(javax.net.ssl.SSLParameters) public void
     * javax.net.ssl.SSLEngine.setSSLParameters(javax.net.ssl.SSLParameters)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setSSLParameters(javax.net.ssl.SSLParameters) public void
     * javax.net.ssl.SSLEngine.setSSLParameters(javax.net.ssl.SSLParameters)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setSSLParameters(javax.net.ssl.SSLParameters) public void
     *      javax.net.ssl.SSLEngine.setSSLParameters(javax.net.ssl.SSLParameters) (the hereby targeted
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
     * Test method for {@link javax.net.ssl.SSLEngine#setEnabledProtocols(String[]) public abstract void
     * javax.net.ssl.SSLEngine.setEnabledProtocols(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setEnabledProtocols(String[]) public abstract void
     * javax.net.ssl.SSLEngine.setEnabledProtocols(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setEnabledProtocols(String[]) public abstract void
     *      javax.net.ssl.SSLEngine.setEnabledProtocols(java.lang.String[]) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getHandshakeSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLEngine.getHandshakeSession()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getHandshakeSession() public javax.net.ssl.SSLSession
     * javax.net.ssl.SSLEngine.getHandshakeSession()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getHandshakeSession() public javax.net.ssl.SSLSession
     *      javax.net.ssl.SSLEngine.getHandshakeSession() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#setEnabledCipherSuites(String[]) public abstract void
     * javax.net.ssl.SSLEngine.setEnabledCipherSuites(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setEnabledCipherSuites(String[]) public abstract void
     * javax.net.ssl.SSLEngine.setEnabledCipherSuites(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setEnabledCipherSuites(String[]) public abstract void
     *      javax.net.ssl.SSLEngine.setEnabledCipherSuites(java.lang.String[]) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getDelegatedTask() public abstract java.lang.Runnable
     * javax.net.ssl.SSLEngine.getDelegatedTask()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getDelegatedTask() public abstract java.lang.Runnable
     * javax.net.ssl.SSLEngine.getDelegatedTask()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getDelegatedTask() public abstract java.lang.Runnable
     *      javax.net.ssl.SSLEngine.getDelegatedTask() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDelegatedTask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setEnableSessionCreation(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setEnableSessionCreation(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setEnableSessionCreation(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setEnableSessionCreation(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setEnableSessionCreation(boolean) public abstract void
     *      javax.net.ssl.SSLEngine.setEnableSessionCreation(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getEnabledProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getEnabledProtocols()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getEnabledProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getEnabledProtocols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getEnabledProtocols() public abstract java.lang.String[]
     *      javax.net.ssl.SSLEngine.getEnabledProtocols() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#isInboundDone() public abstract boolean
     * javax.net.ssl.SSLEngine.isInboundDone()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#isInboundDone() public abstract boolean
     * javax.net.ssl.SSLEngine.isInboundDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#isInboundDone() public abstract boolean javax.net.ssl.SSLEngine.isInboundDone() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInboundDone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSupportedProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getSupportedProtocols()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSupportedProtocols() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getSupportedProtocols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getSupportedProtocols() public abstract java.lang.String[]
     *      javax.net.ssl.SSLEngine.getSupportedProtocols() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getEnableSessionCreation() public abstract boolean
     * javax.net.ssl.SSLEngine.getEnableSessionCreation()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getEnableSessionCreation() public abstract boolean
     * javax.net.ssl.SSLEngine.getEnableSessionCreation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getEnableSessionCreation() public abstract boolean
     *      javax.net.ssl.SSLEngine.getEnableSessionCreation() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getNeedClientAuth() public abstract boolean
     * javax.net.ssl.SSLEngine.getNeedClientAuth()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getNeedClientAuth() public abstract boolean
     * javax.net.ssl.SSLEngine.getNeedClientAuth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getNeedClientAuth() public abstract boolean
     *      javax.net.ssl.SSLEngine.getNeedClientAuth() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], java.nio.ByteBuffer) public
     *      javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],java.nio.ByteBuffer) throws
     *      javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_ByteBufferArray_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     * javax.net.ssl.SSLEngineResult javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer, java.nio.ByteBuffer) public javax.net.ssl.SSLEngineResult
     *      javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer,java.nio.ByteBuffer) throws javax.net.ssl.SSLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_ByteBuffer_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer) public
     * abstract javax.net.ssl.SSLEngineResult
     * javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],int,int,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer) public
     * abstract javax.net.ssl.SSLEngineResult
     * javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],int,int,java.nio.ByteBuffer) throws
     * javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer) public abstract
     *      javax.net.ssl.SSLEngineResult
     *      javax.net.ssl.SSLEngine.wrap(java.nio.ByteBuffer[],int,int,java.nio.ByteBuffer) throws
     *      javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_ByteBufferArray_int_int_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSession() public abstract javax.net.ssl.SSLSession
     * javax.net.ssl.SSLEngine.getSession()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSession() public abstract javax.net.ssl.SSLSession
     * javax.net.ssl.SSLEngine.getSession()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getSession() public abstract javax.net.ssl.SSLSession
     *      javax.net.ssl.SSLEngine.getSession() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#setNeedClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setNeedClientAuth(boolean)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#setNeedClientAuth(boolean) public abstract void
     * javax.net.ssl.SSLEngine.setNeedClientAuth(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#setNeedClientAuth(boolean) public abstract void
     *      javax.net.ssl.SSLEngine.setNeedClientAuth(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getSupportedCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getSupportedCipherSuites()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getSupportedCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getSupportedCipherSuites()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getSupportedCipherSuites() public abstract java.lang.String[]
     *      javax.net.ssl.SSLEngine.getSupportedCipherSuites() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getEnabledCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getEnabledCipherSuites()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getEnabledCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLEngine.getEnabledCipherSuites()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getEnabledCipherSuites() public abstract java.lang.String[]
     *      javax.net.ssl.SSLEngine.getEnabledCipherSuites() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#getHandshakeStatus() public abstract
     * javax.net.ssl.SSLEngineResult$HandshakeStatus javax.net.ssl.SSLEngine.getHandshakeStatus()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getHandshakeStatus() public abstract
     * javax.net.ssl.SSLEngineResult$HandshakeStatus javax.net.ssl.SSLEngine.getHandshakeStatus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getHandshakeStatus() public abstract javax.net.ssl.SSLEngineResult$HandshakeStatus
     *      javax.net.ssl.SSLEngine.getHandshakeStatus() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHandshakeStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getWantClientAuth() public abstract boolean
     * javax.net.ssl.SSLEngine.getWantClientAuth()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getWantClientAuth() public abstract boolean
     * javax.net.ssl.SSLEngine.getWantClientAuth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getWantClientAuth() public abstract boolean
     *      javax.net.ssl.SSLEngine.getWantClientAuth() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.net.ssl.SSLEngine#closeInbound() public abstract void
     * javax.net.ssl.SSLEngine.closeInbound() throws javax.net.ssl.SSLException}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#closeInbound() public abstract void
     * javax.net.ssl.SSLEngine.closeInbound() throws javax.net.ssl.SSLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#closeInbound() public abstract void javax.net.ssl.SSLEngine.closeInbound() throws
     *      javax.net.ssl.SSLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_closeInbound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getUseClientMode() public abstract boolean
     * javax.net.ssl.SSLEngine.getUseClientMode()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngine#getUseClientMode() public abstract boolean
     * javax.net.ssl.SSLEngine.getUseClientMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SSLEngine#getUseClientMode() public abstract boolean
     *      javax.net.ssl.SSLEngine.getUseClientMode() (the hereby targeted method-under-test)
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

}
