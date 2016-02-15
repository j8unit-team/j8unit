package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.SelectableChannel class
 * java.nio.channels.SelectableChannel}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SelectableChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.SelectableChannel class java.nio.channels.SelectableChannel (the hereby targeted
 *      class-under-test class)
 * @see SelectableChannelClassTests SelectableChannelClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SelectableChannelTests<SUT extends java.nio.channels.SelectableChannel>
extends ChannelTests<SUT>, org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#provider() public abstract
     * java.nio.channels.spi.SelectorProvider java.nio.channels.SelectableChannel.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#provider() public abstract
     * java.nio.channels.spi.SelectorProvider java.nio.channels.SelectableChannel.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#provider() public abstract java.nio.channels.spi.SelectorProvider
     *      java.nio.channels.SelectableChannel.provider() (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SelectableChannel#isBlocking() public abstract boolean
     * java.nio.channels.SelectableChannel.isBlocking()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#isBlocking() public abstract boolean
     * java.nio.channels.SelectableChannel.isBlocking()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#isBlocking() public abstract boolean
     *      java.nio.channels.SelectableChannel.isBlocking() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SelectableChannel#keyFor(java.nio.channels.Selector) public abstract
     * java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.keyFor(java.nio.channels.Selector)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#keyFor(java.nio.channels.Selector) public abstract
     * java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.keyFor(java.nio.channels.Selector)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#keyFor(java.nio.channels.Selector) public abstract
     *      java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.keyFor(java.nio.channels.Selector) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keyFor_Selector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#blockingLock() public abstract java.lang.Object
     * java.nio.channels.SelectableChannel.blockingLock()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#blockingLock() public abstract java.lang.Object
     * java.nio.channels.SelectableChannel.blockingLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#blockingLock() public abstract java.lang.Object
     *      java.nio.channels.SelectableChannel.blockingLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int) public final
     * java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int)
     * throws java.nio.channels.ClosedChannelException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int) public final
     * java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int)
     * throws java.nio.channels.ClosedChannelException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int) public final
     *      java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int)
     *      throws java.nio.channels.ClosedChannelException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_Selector_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int, Object)
     * public abstract java.nio.channels.SelectionKey
     * java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     * java.nio.channels.ClosedChannelException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int, Object)
     * public abstract java.nio.channels.SelectionKey
     * java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     * java.nio.channels.ClosedChannelException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#register(java.nio.channels.Selector, int, Object) public abstract
     *      java.nio.channels.SelectionKey
     *      java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     *      java.nio.channels.ClosedChannelException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SelectableChannel#configureBlocking(boolean) public abstract
     * java.nio.channels.SelectableChannel java.nio.channels.SelectableChannel.configureBlocking(boolean) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#configureBlocking(boolean) public abstract
     * java.nio.channels.SelectableChannel java.nio.channels.SelectableChannel.configureBlocking(boolean) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#configureBlocking(boolean) public abstract
     *      java.nio.channels.SelectableChannel java.nio.channels.SelectableChannel.configureBlocking(boolean) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SelectableChannel#validOps() public abstract int
     * java.nio.channels.SelectableChannel.validOps()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#validOps() public abstract int
     * java.nio.channels.SelectableChannel.validOps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#validOps() public abstract int
     *      java.nio.channels.SelectableChannel.validOps() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SelectableChannel#isRegistered() public abstract boolean
     * java.nio.channels.SelectableChannel.isRegistered()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#isRegistered() public abstract boolean
     * java.nio.channels.SelectableChannel.isRegistered()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SelectableChannel#isRegistered() public abstract boolean
     *      java.nio.channels.SelectableChannel.isRegistered() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
     * <li>{@linkplain java.nio.channels.spi.AbstractInterruptibleChannel#close() class
     * java.nio.channels.spi.AbstractInterruptibleChannel}</li>
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
     * <li>{@linkplain java.nio.channels.Channel#isOpen() interface java.nio.channels.Channel}</li>
     * <li>{@linkplain java.nio.channels.spi.AbstractInterruptibleChannel#isOpen() class
     * java.nio.channels.spi.AbstractInterruptibleChannel}</li>
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
