package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.AsynchronousChannelGroup class
 * java.nio.channels.AsynchronousChannelGroup}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AsynchronousChannelGroupClassTests}.
 * </p>
 *
 * @see java.nio.channels.AsynchronousChannelGroup class java.nio.channels.AsynchronousChannelGroup (the hereby targeted
 *      class-under-test class)
 * @see AsynchronousChannelGroupClassTests AsynchronousChannelGroupClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousChannelGroupTests<SUT extends java.nio.channels.AsynchronousChannelGroup>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousChannelGroup#awaitTermination(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.nio.channels.AsynchronousChannelGroup.awaitTermination(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousChannelGroup#awaitTermination(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.nio.channels.AsynchronousChannelGroup.awaitTermination(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#awaitTermination(long, java.util.concurrent.TimeUnit) public
     *      abstract boolean
     *      java.nio.channels.AsynchronousChannelGroup.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_awaitTermination_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#shutdownNow() public abstract void
     * java.nio.channels.AsynchronousChannelGroup.shutdownNow() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#shutdownNow() public abstract void
     * java.nio.channels.AsynchronousChannelGroup.shutdownNow() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#shutdownNow() public abstract void
     *      java.nio.channels.AsynchronousChannelGroup.shutdownNow() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdownNow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#shutdown() public abstract void
     * java.nio.channels.AsynchronousChannelGroup.shutdown()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#shutdown() public abstract void
     * java.nio.channels.AsynchronousChannelGroup.shutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#shutdown() public abstract void
     *      java.nio.channels.AsynchronousChannelGroup.shutdown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#isShutdown() public abstract boolean
     * java.nio.channels.AsynchronousChannelGroup.isShutdown()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#isShutdown() public abstract boolean
     * java.nio.channels.AsynchronousChannelGroup.isShutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#isShutdown() public abstract boolean
     *      java.nio.channels.AsynchronousChannelGroup.isShutdown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isShutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#provider() public final
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousChannelGroup.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#provider() public final
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousChannelGroup.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#provider() public final
     *      java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousChannelGroup.provider() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#isTerminated() public abstract boolean
     * java.nio.channels.AsynchronousChannelGroup.isTerminated()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousChannelGroup#isTerminated() public abstract boolean
     * java.nio.channels.AsynchronousChannelGroup.isTerminated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousChannelGroup#isTerminated() public abstract boolean
     *      java.nio.channels.AsynchronousChannelGroup.isTerminated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTerminated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
