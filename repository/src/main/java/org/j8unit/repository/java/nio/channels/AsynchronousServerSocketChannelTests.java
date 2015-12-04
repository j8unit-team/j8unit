package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.AsynchronousServerSocketChannel class
 * java.nio.channels.AsynchronousServerSocketChannel}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.AsynchronousServerSocketChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AsynchronousServerSocketChannelTests<SUT extends java.nio.channels.AsynchronousServerSocketChannel>
extends org.j8unit.repository.java.nio.channels.AsynchronousChannelTests<SUT>, org.j8unit.repository.java.nio.channels.NetworkChannelTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousServerSocketChannel#accept() public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousServerSocketChannel.accept()}.
     * </p>
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
     * Test method for
     * {@link java.nio.channels.AsynchronousServerSocketChannel#accept(java.lang.Object,java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousServerSocketChannel.accept(java.lang.Object,java.nio.channels.CompletionHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousServerSocketChannel#bind(java.net.SocketAddress) public
     * final java.nio.channels.AsynchronousServerSocketChannel
     * java.nio.channels.AsynchronousServerSocketChannel.bind(java.net.SocketAddress) throws java.io.IOException}.
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
     * Test method for {@link java.nio.channels.AsynchronousServerSocketChannel#bind(java.net.SocketAddress,int) public
     * abstract java.nio.channels.AsynchronousServerSocketChannel
     * java.nio.channels.AsynchronousServerSocketChannel.bind(java.net.SocketAddress,int) throws java.io.IOException}.
     * </p>
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
     * Test method for {@link java.nio.channels.AsynchronousServerSocketChannel#getLocalAddress() public abstract
     * java.net.SocketAddress java.nio.channels.AsynchronousServerSocketChannel.getLocalAddress() throws
     * java.io.IOException}.
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
     * Test method for {@link java.nio.channels.AsynchronousServerSocketChannel#provider() public final
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousServerSocketChannel.provider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousServerSocketChannel#setOption(java.net.SocketOption,java.lang.Object) public
     * abstract java.nio.channels.AsynchronousServerSocketChannel
     * java.nio.channels.AsynchronousServerSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws
     * java.io.IOException}.
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

}
