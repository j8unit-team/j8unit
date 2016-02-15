package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.DatagramChannel class java.nio.channels.DatagramChannel}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link DatagramChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.DatagramChannel class java.nio.channels.DatagramChannel (the hereby targeted class-under-test
 *      class)
 * @see DatagramChannelClassTests DatagramChannelClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatagramChannelTests<SUT extends java.nio.channels.DatagramChannel>
extends ByteChannelTests<SUT>, ScatteringByteChannelTests<SUT>, GatheringByteChannelTests<SUT>, MulticastChannelTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the hereby
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
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.nio.channels.DatagramChannel#receive(java.nio.ByteBuffer) public abstract
     * java.net.SocketAddress java.nio.channels.DatagramChannel.receive(java.nio.ByteBuffer) throws java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#receive(java.nio.ByteBuffer) public abstract
     * java.net.SocketAddress java.nio.channels.DatagramChannel.receive(java.nio.ByteBuffer) throws java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#receive(java.nio.ByteBuffer) public abstract java.net.SocketAddress
     *      java.nio.channels.DatagramChannel.receive(java.nio.ByteBuffer) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#disconnect() public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.disconnect() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#disconnect() public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.disconnect() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#disconnect() public abstract java.nio.channels.DatagramChannel
     *      java.nio.channels.DatagramChannel.disconnect() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disconnect()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#setOption(java.net.SocketOption, Object) public abstract
     * <T> java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.setOption(java.net.SocketOption<T>,T)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#setOption(java.net.SocketOption, Object) public abstract
     * java.nio.channels.DatagramChannel
     * java.nio.channels.DatagramChannel.setOption(java.net.SocketOption,java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#setOption(java.net.SocketOption, Object) public abstract
     *      java.nio.channels.DatagramChannel
     *      java.nio.channels.DatagramChannel.setOption(java.net.SocketOption,java.lang.Object) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#getLocalAddress() public abstract java.net.SocketAddress
     * java.nio.channels.DatagramChannel.getLocalAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#getLocalAddress() public abstract java.net.SocketAddress
     * java.nio.channels.DatagramChannel.getLocalAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#getLocalAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.DatagramChannel.getLocalAddress() throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.nio.channels.DatagramChannel#isConnected() public abstract boolean
     * java.nio.channels.DatagramChannel.isConnected()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#isConnected() public abstract boolean
     * java.nio.channels.DatagramChannel.isConnected()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#isConnected() public abstract boolean
     *      java.nio.channels.DatagramChannel.isConnected() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#getRemoteAddress() public abstract
     * java.net.SocketAddress java.nio.channels.DatagramChannel.getRemoteAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#getRemoteAddress() public abstract
     * java.net.SocketAddress java.nio.channels.DatagramChannel.getRemoteAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#getRemoteAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.DatagramChannel.getRemoteAddress() throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.nio.channels.DatagramChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#bind(java.net.SocketAddress) public abstract
     *      java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.bind(java.net.SocketAddress) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#connect(java.net.SocketAddress) public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.connect(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#connect(java.net.SocketAddress) public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.connect(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#connect(java.net.SocketAddress) public abstract
     *      java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.connect(java.net.SocketAddress) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#validOps() public final int
     * java.nio.channels.DatagramChannel.validOps()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#validOps() public final int
     * java.nio.channels.DatagramChannel.validOps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#validOps() public final int java.nio.channels.DatagramChannel.validOps()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[], int, int) public abstract
     * long java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.nio.channels.DatagramChannel#send(java.nio.ByteBuffer, java.net.SocketAddress) public
     * abstract int java.nio.channels.DatagramChannel.send(java.nio.ByteBuffer,java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#send(java.nio.ByteBuffer, java.net.SocketAddress) public
     * abstract int java.nio.channels.DatagramChannel.send(java.nio.ByteBuffer,java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#send(java.nio.ByteBuffer, java.net.SocketAddress) public abstract int
     *      java.nio.channels.DatagramChannel.send(java.nio.ByteBuffer,java.net.SocketAddress) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_ByteBuffer_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#socket() public abstract java.net.DatagramSocket
     * java.nio.channels.DatagramChannel.socket()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#socket() public abstract java.net.DatagramSocket
     * java.nio.channels.DatagramChannel.socket()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.DatagramChannel#socket() public abstract java.net.DatagramSocket
     *      java.nio.channels.DatagramChannel.socket() (the hereby targeted method-under-test)
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.SelectableChannel#close() class java.nio.channels.SelectableChannel}</li>
     * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
     * <li>{@linkplain java.nio.channels.MulticastChannel#close() interface java.nio.channels.MulticastChannel}</li>
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
