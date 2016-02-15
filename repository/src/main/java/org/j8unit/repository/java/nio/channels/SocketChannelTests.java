package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.SocketChannel class java.nio.channels.SocketChannel}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link SocketChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.SocketChannel class java.nio.channels.SocketChannel (the hereby targeted class-under-test
 *      class)
 * @see SocketChannelClassTests SocketChannelClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketChannelTests<SUT extends java.nio.channels.SocketChannel>
extends ByteChannelTests<SUT>, ScatteringByteChannelTests<SUT>, GatheringByteChannelTests<SUT>, NetworkChannelTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#shutdownInput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownInput() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#shutdownInput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownInput() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#shutdownInput() public abstract java.nio.channels.SocketChannel
     *      java.nio.channels.SocketChannel.shutdownInput() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#bind(java.net.SocketAddress) public abstract java.nio.channels.SocketChannel
     *      java.nio.channels.SocketChannel.bind(java.net.SocketAddress) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#write(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.SocketChannel.write(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#write(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.SocketChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#connect(java.net.SocketAddress) public abstract boolean
     * java.nio.channels.SocketChannel.connect(java.net.SocketAddress) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#connect(java.net.SocketAddress) public abstract boolean
     * java.nio.channels.SocketChannel.connect(java.net.SocketAddress) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#connect(java.net.SocketAddress) public abstract boolean
     *      java.nio.channels.SocketChannel.connect(java.net.SocketAddress) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#validOps() public final int
     * java.nio.channels.SocketChannel.validOps()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#validOps() public final int
     * java.nio.channels.SocketChannel.validOps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#validOps() public final int java.nio.channels.SocketChannel.validOps() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_validOps()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#socket() public abstract java.net.Socket
     * java.nio.channels.SocketChannel.socket()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#socket() public abstract java.net.Socket
     * java.nio.channels.SocketChannel.socket()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#socket() public abstract java.net.Socket
     *      java.nio.channels.SocketChannel.socket() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#isConnectionPending() public abstract boolean
     * java.nio.channels.SocketChannel.isConnectionPending()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#isConnectionPending() public abstract boolean
     * java.nio.channels.SocketChannel.isConnectionPending()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#isConnectionPending() public abstract boolean
     *      java.nio.channels.SocketChannel.isConnectionPending() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#setOption(java.net.SocketOption, Object) public abstract
     * <T> java.nio.channels.SocketChannel java.nio.channels.SocketChannel.setOption(java.net.SocketOption<T>,T) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#setOption(java.net.SocketOption, Object) public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.setOption(java.net.SocketOption,java.lang.Object)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#setOption(java.net.SocketOption, Object) public abstract
     *      java.nio.channels.SocketChannel
     *      java.nio.channels.SocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setOption_SocketOption_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#read(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.SocketChannel.read(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#read(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.SocketChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#finishConnect() public abstract boolean
     * java.nio.channels.SocketChannel.finishConnect() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#finishConnect() public abstract boolean
     * java.nio.channels.SocketChannel.finishConnect() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#finishConnect() public abstract boolean
     *      java.nio.channels.SocketChannel.finishConnect() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#shutdownOutput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownOutput() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#shutdownOutput() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.shutdownOutput() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#shutdownOutput() public abstract java.nio.channels.SocketChannel
     *      java.nio.channels.SocketChannel.shutdownOutput() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.SocketChannel.getLocalAddress() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLocalAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#isConnected() public abstract boolean
     * java.nio.channels.SocketChannel.isConnected()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#isConnected() public abstract boolean
     * java.nio.channels.SocketChannel.isConnected()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#isConnected() public abstract boolean
     *      java.nio.channels.SocketChannel.isConnected() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SocketChannel#getRemoteAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getRemoteAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#getRemoteAddress() public abstract java.net.SocketAddress
     * java.nio.channels.SocketChannel.getRemoteAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SocketChannel#getRemoteAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.SocketChannel.getRemoteAddress() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.SelectableChannel#close() class java.nio.channels.SelectableChannel}</li>
     * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.SelectableChannel#isOpen() class java.nio.channels.SelectableChannel}</li>
     * <li>{@linkplain java.nio.channels.Channel#isOpen() interface java.nio.channels.Channel}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isOpen()
    throws Exception {
    }

}
