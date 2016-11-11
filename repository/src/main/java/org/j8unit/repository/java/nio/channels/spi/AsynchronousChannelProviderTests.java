package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AsynchronousChannelProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link AsynchronousChannelProvider public abstract class java.nio.channels.spi.AsynchronousChannelProvider}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousChannelProviderTests<SUT extends AsynchronousChannelProvider>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.AsynchronousChannelProvider]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
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
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
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
     * @since 0.9.0
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

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
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
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
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
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.spi.AsynchronousChannelProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.spi.AsynchronousChannelProvider]

}
