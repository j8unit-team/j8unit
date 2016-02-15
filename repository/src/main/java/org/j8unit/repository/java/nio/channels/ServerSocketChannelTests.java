package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.ServerSocketChannel class
 * java.nio.channels.ServerSocketChannel}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ServerSocketChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.ServerSocketChannel class java.nio.channels.ServerSocketChannel (the hereby targeted
 *      class-under-test class)
 * @see ServerSocketChannelClassTests ServerSocketChannelClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerSocketChannelTests<SUT extends java.nio.channels.ServerSocketChannel>
extends NetworkChannelTests<SUT>, org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#accept() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.ServerSocketChannel.accept() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#accept() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.ServerSocketChannel.accept() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#accept() public abstract java.nio.channels.SocketChannel
     *      java.nio.channels.ServerSocketChannel.accept() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#getLocalAddress() public abstract
     * java.net.SocketAddress java.nio.channels.ServerSocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#getLocalAddress() public abstract
     * java.net.SocketAddress java.nio.channels.ServerSocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.ServerSocketChannel.getLocalAddress() throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.nio.channels.ServerSocketChannel#validOps() public final int
     * java.nio.channels.ServerSocketChannel.validOps()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#validOps() public final int
     * java.nio.channels.ServerSocketChannel.validOps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#validOps() public final int
     *      java.nio.channels.ServerSocketChannel.validOps() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.ServerSocketChannel#socket() public abstract java.net.ServerSocket
     * java.nio.channels.ServerSocketChannel.socket()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#socket() public abstract java.net.ServerSocket
     * java.nio.channels.ServerSocketChannel.socket()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#socket() public abstract java.net.ServerSocket
     *      java.nio.channels.ServerSocketChannel.socket() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress, int) public abstract
     * java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress,int)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress, int) public abstract
     * java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress,int)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress, int) public abstract
     *      java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress,int)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bind_SocketAddress_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress) public final
     * java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress) public final
     * java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress) public final
     *      java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress)
     *      throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.ServerSocketChannel#setOption(java.net.SocketOption, Object) public
     * abstract <T> java.nio.channels.ServerSocketChannel
     * java.nio.channels.ServerSocketChannel.setOption(java.net.SocketOption<T>,T) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#setOption(java.net.SocketOption, Object) public
     * abstract java.nio.channels.ServerSocketChannel
     * java.nio.channels.ServerSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.ServerSocketChannel#setOption(java.net.SocketOption, Object) public abstract
     *      java.nio.channels.ServerSocketChannel
     *      java.nio.channels.ServerSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws
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
