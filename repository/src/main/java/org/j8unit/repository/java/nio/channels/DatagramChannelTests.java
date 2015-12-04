package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.DatagramChannel class java.nio.channels.DatagramChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.DatagramChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DatagramChannelTests<SUT extends java.nio.channels.DatagramChannel>
extends org.j8unit.repository.java.nio.channels.ByteChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.MulticastChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[],int,int) public abstract long java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBufferArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer[]) public final long java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBufferArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#read(java.nio.ByteBuffer) public abstract int java.nio.channels.DatagramChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_ByteBuffer() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#receive(java.nio.ByteBuffer) public abstract java.net.SocketAddress java.nio.channels.DatagramChannel.receive(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_ByteBuffer() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#disconnect() public abstract java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.disconnect() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disconnect() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#setOption(java.net.SocketOption,java.lang.Object) public abstract java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.setOption(java.net.SocketOption,java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setOption_SocketOption_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#getLocalAddress() public abstract java.net.SocketAddress java.nio.channels.DatagramChannel.getLocalAddress() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLocalAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#getRemoteAddress() public abstract java.net.SocketAddress java.nio.channels.DatagramChannel.getRemoteAddress() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemoteAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#isConnected() public abstract boolean java.nio.channels.DatagramChannel.isConnected()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConnected() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#bind(java.net.SocketAddress) public abstract java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.bind(java.net.SocketAddress) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_bind_SocketAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#connect(java.net.SocketAddress) public abstract java.nio.channels.DatagramChannel java.nio.channels.DatagramChannel.connect(java.net.SocketAddress) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_SocketAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#validOps() public final int java.nio.channels.DatagramChannel.validOps()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_validOps() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[]) public final long java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBufferArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer[],int,int) public abstract long java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBufferArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#write(java.nio.ByteBuffer) public abstract int java.nio.channels.DatagramChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_ByteBuffer() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#send(java.nio.ByteBuffer,java.net.SocketAddress) public abstract int java.nio.channels.DatagramChannel.send(java.nio.ByteBuffer,java.net.SocketAddress) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_ByteBuffer_SocketAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.DatagramChannel#socket() public abstract java.net.DatagramSocket java.nio.channels.DatagramChannel.socket()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_socket() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_close() throws Exception {
 }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_isOpen() throws Exception {
 }

}
