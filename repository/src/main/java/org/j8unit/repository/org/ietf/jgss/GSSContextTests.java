package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.ietf.jgss.GSSContext interface org.ietf.jgss.GSSContext}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.ietf.jgss.GSSContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface GSSContextTests<SUT extends org.ietf.jgss.GSSContext>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#isProtReady() public abstract boolean
     * org.ietf.jgss.GSSContext.isProtReady()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isProtReady()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getConfState() public abstract boolean
     * org.ietf.jgss.GSSContext.getConfState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConfState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#export() public abstract byte[] org.ietf.jgss.GSSContext.export()
     * throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_export()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#initSecContext(java.io.InputStream,java.io.OutputStream) public
     * abstract int org.ietf.jgss.GSSContext.initSecContext(java.io.InputStream,java.io.OutputStream) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initSecContext_InputStream_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#initSecContext(byte[],int,int) public abstract byte[]
     * org.ietf.jgss.GSSContext.initSecContext(byte[],int,int) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initSecContext_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getAnonymityState() public abstract boolean
     * org.ietf.jgss.GSSContext.getAnonymityState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnonymityState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getMIC(byte[],int,int,org.ietf.jgss.MessageProp) public abstract
     * byte[] org.ietf.jgss.GSSContext.getMIC(byte[],int,int,org.ietf.jgss.MessageProp) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMIC_byteArray_int_int_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.ietf.jgss.GSSContext#getMIC(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp) public
     * abstract void org.ietf.jgss.GSSContext.getMIC(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp)
     * throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMIC_InputStream_OutputStream_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestConf(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestConf(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestConf_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestAnonymity(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestAnonymity(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestAnonymity_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.ietf.jgss.GSSContext#unwrap(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp) public
     * abstract void org.ietf.jgss.GSSContext.unwrap(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp)
     * throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_InputStream_OutputStream_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#unwrap(byte[],int,int,org.ietf.jgss.MessageProp) public abstract
     * byte[] org.ietf.jgss.GSSContext.unwrap(byte[],int,int,org.ietf.jgss.MessageProp) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_byteArray_int_int_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestCredDeleg(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestCredDeleg(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestCredDeleg_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getSequenceDetState() public abstract boolean
     * org.ietf.jgss.GSSContext.getSequenceDetState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSequenceDetState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getCredDelegState() public abstract boolean
     * org.ietf.jgss.GSSContext.getCredDelegState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCredDelegState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getIntegState() public abstract boolean
     * org.ietf.jgss.GSSContext.getIntegState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIntegState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#acceptSecContext(byte[],int,int) public abstract byte[]
     * org.ietf.jgss.GSSContext.acceptSecContext(byte[],int,int) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptSecContext_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#acceptSecContext(java.io.InputStream,java.io.OutputStream) public
     * abstract void org.ietf.jgss.GSSContext.acceptSecContext(java.io.InputStream,java.io.OutputStream) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptSecContext_InputStream_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getSrcName() public abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSContext.getSrcName() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSrcName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#isInitiator() public abstract boolean
     * org.ietf.jgss.GSSContext.isInitiator() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInitiator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#wrap(byte[],int,int,org.ietf.jgss.MessageProp) public abstract
     * byte[] org.ietf.jgss.GSSContext.wrap(byte[],int,int,org.ietf.jgss.MessageProp) throws org.ietf.jgss.GSSException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_byteArray_int_int_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.ietf.jgss.GSSContext#wrap(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp) public
     * abstract void org.ietf.jgss.GSSContext.wrap(java.io.InputStream,java.io.OutputStream,org.ietf.jgss.MessageProp)
     * throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_InputStream_OutputStream_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#dispose() public abstract void org.ietf.jgss.GSSContext.dispose()
     * throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getReplayDetState() public abstract boolean
     * org.ietf.jgss.GSSContext.getReplayDetState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReplayDetState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestInteg(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestInteg(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestInteg_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestMutualAuth(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestMutualAuth(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestMutualAuth_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getTargName() public abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSContext.getTargName() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getMech() public abstract org.ietf.jgss.Oid
     * org.ietf.jgss.GSSContext.getMech() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMech()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getWrapSizeLimit(int,boolean,int) public abstract int
     * org.ietf.jgss.GSSContext.getWrapSizeLimit(int,boolean,int) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWrapSizeLimit_int_boolean_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#setChannelBinding(org.ietf.jgss.ChannelBinding) public abstract
     * void org.ietf.jgss.GSSContext.setChannelBinding(org.ietf.jgss.ChannelBinding) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setChannelBinding_ChannelBinding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#isTransferable() public abstract boolean
     * org.ietf.jgss.GSSContext.isTransferable() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTransferable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestLifetime(int) public abstract void
     * org.ietf.jgss.GSSContext.requestLifetime(int) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestLifetime_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestSequenceDet(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestSequenceDet(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestSequenceDet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getMutualAuthState() public abstract boolean
     * org.ietf.jgss.GSSContext.getMutualAuthState()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMutualAuthState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getLifetime() public abstract int
     * org.ietf.jgss.GSSContext.getLifetime()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLifetime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.ietf.jgss.GSSContext#verifyMIC(byte[],int,int,byte[],int,int,org.ietf.jgss.MessageProp) public
     * abstract void org.ietf.jgss.GSSContext.verifyMIC(byte[],int,int,byte[],int,int,org.ietf.jgss.MessageProp) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verifyMIC_byteArray_int_int_byteArray_int_int_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.ietf.jgss.GSSContext#verifyMIC(java.io.InputStream,java.io.InputStream,org.ietf.jgss.MessageProp)
     * public abstract void
     * org.ietf.jgss.GSSContext.verifyMIC(java.io.InputStream,java.io.InputStream,org.ietf.jgss.MessageProp) throws
     * org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verifyMIC_InputStream_InputStream_MessageProp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#requestReplayDet(boolean) public abstract void
     * org.ietf.jgss.GSSContext.requestReplayDet(boolean) throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requestReplayDet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#isEstablished() public abstract boolean
     * org.ietf.jgss.GSSContext.isEstablished()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEstablished()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSContext#getDelegCred() public abstract org.ietf.jgss.GSSCredential
     * org.ietf.jgss.GSSContext.getDelegCred() throws org.ietf.jgss.GSSException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDelegCred()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
