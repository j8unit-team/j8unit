package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.SocketChannel class java.nio.channels.SocketChannel}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.SocketChannelClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketChannelTests<SUT extends java.nio.channels.SocketChannel>
extends org.j8unit.repository.java.nio.channels.ByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<SUT>,
org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.NetworkChannelTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_bind_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test. In result, there are duplicated according test method within the super test classes. To solve
     * this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon and,
     * thus, overriding becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#connect(java.net.SocketAddress) public abstract boolean
     * java.nio.channels.SocketChannel.connect(java.net.SocketAddress) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#finishConnect() public abstract boolean
     * java.nio.channels.SocketChannel.finishConnect() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_finishConnect()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getLocalAddress() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLocalAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#getRemoteAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getRemoteAddress() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemoteAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#isConnected() public abstract boolean
     * java.nio.channels.SocketChannel.isConnected()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConnected()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#isConnectionPending() public abstract boolean
     * java.nio.channels.SocketChannel.isConnectionPending()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConnectionPending()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test. In result, there are duplicated according test method within the super test classes. To solve
     * this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon and,
     * thus, overriding becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isOpen()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[],int,int) public abstract long
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#setOption(java.net.SocketOption,java.lang.Object) public
     * abstract java.nio.channels.SocketChannel
     * java.nio.channels.SocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setOption_SocketOption_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#shutdownInput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownInput() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdownInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#shutdownOutput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownOutput() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdownOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#socket() public abstract java.net.Socket
     * java.nio.channels.SocketChannel.socket()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_socket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#validOps() public final int
     * java.nio.channels.SocketChannel.validOps()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_validOps()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[],int,int) public abstract long
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}