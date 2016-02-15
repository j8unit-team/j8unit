package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.spi.AbstractSelectableChannel class
 * java.nio.channels.spi.AbstractSelectableChannel}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AbstractSelectableChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.spi.AbstractSelectableChannel class java.nio.channels.spi.AbstractSelectableChannel (the
 *      hereby targeted class-under-test class)
 * @see AbstractSelectableChannelClassTests AbstractSelectableChannelClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractSelectableChannelTests<SUT extends java.nio.channels.spi.AbstractSelectableChannel>
extends org.j8unit.repository.java.nio.channels.SelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#blockingLock() public final
     * java.lang.Object java.nio.channels.spi.AbstractSelectableChannel.blockingLock()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#blockingLock() public final
     * java.lang.Object java.nio.channels.spi.AbstractSelectableChannel.blockingLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#blockingLock() public final java.lang.Object
     *      java.nio.channels.spi.AbstractSelectableChannel.blockingLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_blockingLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AbstractSelectableChannel#register(java.nio.channels.Selector, int, Object) public
     * final java.nio.channels.SelectionKey
     * java.nio.channels.spi.AbstractSelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     * java.nio.channels.ClosedChannelException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AbstractSelectableChannel#register(java.nio.channels.Selector, int, Object) public
     * final java.nio.channels.SelectionKey
     * java.nio.channels.spi.AbstractSelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     * java.nio.channels.ClosedChannelException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#register(java.nio.channels.Selector, int, Object) public
     *      final java.nio.channels.SelectionKey
     *      java.nio.channels.spi.AbstractSelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object)
     *      throws java.nio.channels.ClosedChannelException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_register_Selector_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#configureBlocking(boolean) public final
     * java.nio.channels.SelectableChannel java.nio.channels.spi.AbstractSelectableChannel.configureBlocking(boolean)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#configureBlocking(boolean) public final
     * java.nio.channels.SelectableChannel java.nio.channels.spi.AbstractSelectableChannel.configureBlocking(boolean)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#configureBlocking(boolean) public final
     *      java.nio.channels.SelectableChannel
     *      java.nio.channels.spi.AbstractSelectableChannel.configureBlocking(boolean) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_configureBlocking_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isRegistered() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isRegistered()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isRegistered() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isRegistered()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#isRegistered() public final boolean
     *      java.nio.channels.spi.AbstractSelectableChannel.isRegistered() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isRegistered()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#provider() public final
     * java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelectableChannel.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#provider() public final
     * java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelectableChannel.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#provider() public final
     *      java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelectableChannel.provider() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isBlocking() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isBlocking()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isBlocking() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isBlocking()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#isBlocking() public final boolean
     *      java.nio.channels.spi.AbstractSelectableChannel.isBlocking() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isBlocking()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#keyFor(java.nio.channels.Selector) public
     * final java.nio.channels.SelectionKey
     * java.nio.channels.spi.AbstractSelectableChannel.keyFor(java.nio.channels.Selector)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#keyFor(java.nio.channels.Selector) public
     * final java.nio.channels.SelectionKey
     * java.nio.channels.spi.AbstractSelectableChannel.keyFor(java.nio.channels.Selector)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelectableChannel#keyFor(java.nio.channels.Selector) public final
     *      java.nio.channels.SelectionKey
     *      java.nio.channels.spi.AbstractSelectableChannel.keyFor(java.nio.channels.Selector) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_keyFor_Selector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
