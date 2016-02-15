package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.spi.SelectorProvider class
 * java.nio.channels.spi.SelectorProvider}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SelectorProviderClassTests}.
 * </p>
 *
 * @see java.nio.channels.spi.SelectorProvider class java.nio.channels.spi.SelectorProvider (the hereby targeted
 *      class-under-test class)
 * @see SelectorProviderClassTests SelectorProviderClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SelectorProviderTests<SUT extends java.nio.channels.spi.SelectorProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openPipe() public abstract java.nio.channels.Pipe
     * java.nio.channels.spi.SelectorProvider.openPipe() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openPipe() public abstract java.nio.channels.Pipe
     * java.nio.channels.spi.SelectorProvider.openPipe() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openPipe() public abstract java.nio.channels.Pipe
     *      java.nio.channels.spi.SelectorProvider.openPipe() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openPipe()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openSocketChannel() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.spi.SelectorProvider.openSocketChannel() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openSocketChannel() public abstract
     * java.nio.channels.SocketChannel java.nio.channels.spi.SelectorProvider.openSocketChannel() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openSocketChannel() public abstract java.nio.channels.SocketChannel
     *      java.nio.channels.spi.SelectorProvider.openSocketChannel() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openSocketChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openServerSocketChannel() public abstract
     * java.nio.channels.ServerSocketChannel java.nio.channels.spi.SelectorProvider.openServerSocketChannel() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openServerSocketChannel() public abstract
     * java.nio.channels.ServerSocketChannel java.nio.channels.spi.SelectorProvider.openServerSocketChannel() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openServerSocketChannel() public abstract
     *      java.nio.channels.ServerSocketChannel java.nio.channels.spi.SelectorProvider.openServerSocketChannel()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openServerSocketChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openDatagramChannel() public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.spi.SelectorProvider.openDatagramChannel() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openDatagramChannel() public abstract
     * java.nio.channels.DatagramChannel java.nio.channels.spi.SelectorProvider.openDatagramChannel() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openDatagramChannel() public abstract
     *      java.nio.channels.DatagramChannel java.nio.channels.spi.SelectorProvider.openDatagramChannel() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openDatagramChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openDatagramChannel(java.net.ProtocolFamily) public
     * abstract java.nio.channels.DatagramChannel
     * java.nio.channels.spi.SelectorProvider.openDatagramChannel(java.net.ProtocolFamily) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openDatagramChannel(java.net.ProtocolFamily) public
     * abstract java.nio.channels.DatagramChannel
     * java.nio.channels.spi.SelectorProvider.openDatagramChannel(java.net.ProtocolFamily) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openDatagramChannel(java.net.ProtocolFamily) public abstract
     *      java.nio.channels.DatagramChannel
     *      java.nio.channels.spi.SelectorProvider.openDatagramChannel(java.net.ProtocolFamily) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openDatagramChannel_ProtocolFamily()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#inheritedChannel() public java.nio.channels.Channel
     * java.nio.channels.spi.SelectorProvider.inheritedChannel() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#inheritedChannel() public java.nio.channels.Channel
     * java.nio.channels.spi.SelectorProvider.inheritedChannel() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#inheritedChannel() public java.nio.channels.Channel
     *      java.nio.channels.spi.SelectorProvider.inheritedChannel() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inheritedChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openSelector() public abstract
     * java.nio.channels.spi.AbstractSelector java.nio.channels.spi.SelectorProvider.openSelector() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.SelectorProvider#openSelector() public abstract
     * java.nio.channels.spi.AbstractSelector java.nio.channels.spi.SelectorProvider.openSelector() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.SelectorProvider#openSelector() public abstract java.nio.channels.spi.AbstractSelector
     *      java.nio.channels.spi.SelectorProvider.openSelector() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openSelector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
