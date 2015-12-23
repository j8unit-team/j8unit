package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.spi.AsynchronousChannelProvider class
 * java.nio.channels.spi.AsynchronousChannelProvider}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.spi.AsynchronousChannelProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousChannelProviderTests<SUT extends java.nio.channels.spi.AsynchronousChannelProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousChannelGroup(java.util.concurrent.ExecutorService, int)
     * public abstract java.nio.channels.AsynchronousChannelGroup
     * java.nio.channels.spi.AsynchronousChannelProvider.openAsynchronousChannelGroup(java.util.concurrent.ExecutorService,int)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousChannelGroup(java.util.concurrent.
     *             ExecutorService, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openAsynchronousChannelGroup_ExecutorService_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousChannelGroup(int, java.util.concurrent.ThreadFactory)
     * public abstract java.nio.channels.AsynchronousChannelGroup
     * java.nio.channels.spi.AsynchronousChannelProvider.openAsynchronousChannelGroup(int,java.util.concurrent.ThreadFactory)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousChannelGroup(int,
     *             java.util.concurrent.ThreadFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openAsynchronousChannelGroup_int_ThreadFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousServerSocketChannel(java.nio.channels.AsynchronousChannelGroup)
     * public abstract java.nio.channels.AsynchronousServerSocketChannel
     * java.nio.channels.spi.AsynchronousChannelProvider.openAsynchronousServerSocketChannel(java.nio.channels.AsynchronousChannelGroup)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousServerSocketChannel(java.nio.
     *             channels.AsynchronousChannelGroup)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openAsynchronousServerSocketChannel_AsynchronousChannelGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousSocketChannel(java.nio.channels.AsynchronousChannelGroup)
     * public abstract java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.spi.AsynchronousChannelProvider.openAsynchronousSocketChannel(java.nio.channels.AsynchronousChannelGroup)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.spi.AsynchronousChannelProvider#openAsynchronousSocketChannel(java.nio.channels.
     *             AsynchronousChannelGroup)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_openAsynchronousSocketChannel_AsynchronousChannelGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
