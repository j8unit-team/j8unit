package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.DatagramSocket class java.net.DatagramSocket}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link DatagramSocketClassTests}.
 * </p>
 *
 * @see java.net.DatagramSocket class java.net.DatagramSocket (the hereby targeted class-under-test class)
 * @see DatagramSocketClassTests DatagramSocketClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatagramSocketTests<SUT extends java.net.DatagramSocket>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#bind(java.net.SocketAddress) public synchronized void
     * java.net.DatagramSocket.bind(java.net.SocketAddress) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#bind(java.net.SocketAddress) public synchronized void
     * java.net.DatagramSocket.bind(java.net.SocketAddress) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#bind(java.net.SocketAddress) public synchronized void
     *      java.net.DatagramSocket.bind(java.net.SocketAddress) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.net.DatagramSocket#getChannel() public java.nio.channels.DatagramChannel
     * java.net.DatagramSocket.getChannel()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getChannel() public java.nio.channels.DatagramChannel
     * java.net.DatagramSocket.getChannel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getChannel() public java.nio.channels.DatagramChannel
     *      java.net.DatagramSocket.getChannel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getSoTimeout() public synchronized int
     * java.net.DatagramSocket.getSoTimeout() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getSoTimeout() public synchronized int
     * java.net.DatagramSocket.getSoTimeout() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getSoTimeout() public synchronized int java.net.DatagramSocket.getSoTimeout() throws
     *      java.net.SocketException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSoTimeout()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#close() public void java.net.DatagramSocket.close()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#close() public void java.net.DatagramSocket.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#close() public void java.net.DatagramSocket.close() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#connect(java.net.SocketAddress) public void
     * java.net.DatagramSocket.connect(java.net.SocketAddress) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#connect(java.net.SocketAddress) public void
     * java.net.DatagramSocket.connect(java.net.SocketAddress) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#connect(java.net.SocketAddress) public void
     *      java.net.DatagramSocket.connect(java.net.SocketAddress) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.net.DatagramSocket#connect(java.net.InetAddress, int) public void
     * java.net.DatagramSocket.connect(java.net.InetAddress,int)}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#connect(java.net.InetAddress, int) public void
     * java.net.DatagramSocket.connect(java.net.InetAddress,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#connect(java.net.InetAddress, int) public void
     *      java.net.DatagramSocket.connect(java.net.InetAddress,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_InetAddress_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setTrafficClass(int) public synchronized void
     * java.net.DatagramSocket.setTrafficClass(int) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setTrafficClass(int) public synchronized void
     * java.net.DatagramSocket.setTrafficClass(int) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setTrafficClass(int) public synchronized void
     *      java.net.DatagramSocket.setTrafficClass(int) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTrafficClass_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getInetAddress() public java.net.InetAddress
     * java.net.DatagramSocket.getInetAddress()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getInetAddress() public java.net.InetAddress
     * java.net.DatagramSocket.getInetAddress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getInetAddress() public java.net.InetAddress
     *      java.net.DatagramSocket.getInetAddress() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInetAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#disconnect() public void java.net.DatagramSocket.disconnect()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#disconnect() public void java.net.DatagramSocket.disconnect()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#disconnect() public void java.net.DatagramSocket.disconnect() (the hereby targeted
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
     * Test method for {@link java.net.DatagramSocket#getLocalPort() public int java.net.DatagramSocket.getLocalPort()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getLocalPort() public int java.net.DatagramSocket.getLocalPort()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getLocalPort() public int java.net.DatagramSocket.getLocalPort() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalPort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setReceiveBufferSize(int) public synchronized void
     * java.net.DatagramSocket.setReceiveBufferSize(int) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setReceiveBufferSize(int) public synchronized void
     * java.net.DatagramSocket.setReceiveBufferSize(int) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setReceiveBufferSize(int) public synchronized void
     *      java.net.DatagramSocket.setReceiveBufferSize(int) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setReceiveBufferSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#isConnected() public boolean
     * java.net.DatagramSocket.isConnected()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#isConnected() public boolean
     * java.net.DatagramSocket.isConnected()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#isConnected() public boolean java.net.DatagramSocket.isConnected() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.net.DatagramSocket#getLocalAddress() public java.net.InetAddress
     * java.net.DatagramSocket.getLocalAddress()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getLocalAddress() public java.net.InetAddress
     * java.net.DatagramSocket.getLocalAddress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getLocalAddress() public java.net.InetAddress
     *      java.net.DatagramSocket.getLocalAddress() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.net.DatagramSocket#getPort() public int java.net.DatagramSocket.getPort()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getPort() public int java.net.DatagramSocket.getPort()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getPort() public int java.net.DatagramSocket.getPort() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#isClosed() public boolean java.net.DatagramSocket.isClosed()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#isClosed() public boolean java.net.DatagramSocket.isClosed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#isClosed() public boolean java.net.DatagramSocket.isClosed() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isClosed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#isBound() public boolean java.net.DatagramSocket.isBound()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#isBound() public boolean java.net.DatagramSocket.isBound()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#isBound() public boolean java.net.DatagramSocket.isBound() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setSendBufferSize(int) public synchronized void
     * java.net.DatagramSocket.setSendBufferSize(int) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setSendBufferSize(int) public synchronized void
     * java.net.DatagramSocket.setSendBufferSize(int) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setSendBufferSize(int) public synchronized void
     *      java.net.DatagramSocket.setSendBufferSize(int) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSendBufferSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getSendBufferSize() public synchronized int
     * java.net.DatagramSocket.getSendBufferSize() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getSendBufferSize() public synchronized int
     * java.net.DatagramSocket.getSendBufferSize() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getSendBufferSize() public synchronized int
     *      java.net.DatagramSocket.getSendBufferSize() throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSendBufferSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setBroadcast(boolean) public synchronized void
     * java.net.DatagramSocket.setBroadcast(boolean) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setBroadcast(boolean) public synchronized void
     * java.net.DatagramSocket.setBroadcast(boolean) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setBroadcast(boolean) public synchronized void
     *      java.net.DatagramSocket.setBroadcast(boolean) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBroadcast_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#send(java.net.DatagramPacket) public void
     * java.net.DatagramSocket.send(java.net.DatagramPacket) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#send(java.net.DatagramPacket) public void
     * java.net.DatagramSocket.send(java.net.DatagramPacket) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#send(java.net.DatagramPacket) public void
     *      java.net.DatagramSocket.send(java.net.DatagramPacket) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_DatagramPacket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getRemoteSocketAddress() public java.net.SocketAddress
     * java.net.DatagramSocket.getRemoteSocketAddress()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getRemoteSocketAddress() public java.net.SocketAddress
     * java.net.DatagramSocket.getRemoteSocketAddress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getRemoteSocketAddress() public java.net.SocketAddress
     *      java.net.DatagramSocket.getRemoteSocketAddress() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemoteSocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#receive(java.net.DatagramPacket) public synchronized void
     * java.net.DatagramSocket.receive(java.net.DatagramPacket) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#receive(java.net.DatagramPacket) public synchronized void
     * java.net.DatagramSocket.receive(java.net.DatagramPacket) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#receive(java.net.DatagramPacket) public synchronized void
     *      java.net.DatagramSocket.receive(java.net.DatagramPacket) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_DatagramPacket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getBroadcast() public synchronized boolean
     * java.net.DatagramSocket.getBroadcast() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getBroadcast() public synchronized boolean
     * java.net.DatagramSocket.getBroadcast() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getBroadcast() public synchronized boolean java.net.DatagramSocket.getBroadcast()
     *      throws java.net.SocketException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBroadcast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getLocalSocketAddress() public java.net.SocketAddress
     * java.net.DatagramSocket.getLocalSocketAddress()}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getLocalSocketAddress() public java.net.SocketAddress
     * java.net.DatagramSocket.getLocalSocketAddress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getLocalSocketAddress() public java.net.SocketAddress
     *      java.net.DatagramSocket.getLocalSocketAddress() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalSocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getReceiveBufferSize() public synchronized int
     * java.net.DatagramSocket.getReceiveBufferSize() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getReceiveBufferSize() public synchronized int
     * java.net.DatagramSocket.getReceiveBufferSize() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getReceiveBufferSize() public synchronized int
     *      java.net.DatagramSocket.getReceiveBufferSize() throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReceiveBufferSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setReuseAddress(boolean) public synchronized void
     * java.net.DatagramSocket.setReuseAddress(boolean) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setReuseAddress(boolean) public synchronized void
     * java.net.DatagramSocket.setReuseAddress(boolean) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setReuseAddress(boolean) public synchronized void
     *      java.net.DatagramSocket.setReuseAddress(boolean) throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setReuseAddress_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getReuseAddress() public synchronized boolean
     * java.net.DatagramSocket.getReuseAddress() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getReuseAddress() public synchronized boolean
     * java.net.DatagramSocket.getReuseAddress() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getReuseAddress() public synchronized boolean
     *      java.net.DatagramSocket.getReuseAddress() throws java.net.SocketException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReuseAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#getTrafficClass() public synchronized int
     * java.net.DatagramSocket.getTrafficClass() throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#getTrafficClass() public synchronized int
     * java.net.DatagramSocket.getTrafficClass() throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#getTrafficClass() public synchronized int java.net.DatagramSocket.getTrafficClass()
     *      throws java.net.SocketException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrafficClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.DatagramSocket#setSoTimeout(int) public synchronized void
     * java.net.DatagramSocket.setSoTimeout(int) throws java.net.SocketException}.
     *
     * <p>
     * Test method for {@link java.net.DatagramSocket#setSoTimeout(int) public synchronized void
     * java.net.DatagramSocket.setSoTimeout(int) throws java.net.SocketException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.DatagramSocket#setSoTimeout(int) public synchronized void java.net.DatagramSocket.setSoTimeout(int)
     *      throws java.net.SocketException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSoTimeout_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
