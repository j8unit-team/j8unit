package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.spi.AbstractSelectableChannel class
 * java.nio.channels.spi.AbstractSelectableChannel}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractSelectableChannelTests<SUT extends java.nio.channels.spi.AbstractSelectableChannel>
extends org.j8unit.repository.java.nio.channels.SelectableChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#blockingLock() public final
     * java.lang.Object java.nio.channels.spi.AbstractSelectableChannel.blockingLock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_blockingLock()
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_configureBlocking_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isBlocking() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isBlocking()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isBlocking()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#isRegistered() public final boolean
     * java.nio.channels.spi.AbstractSelectableChannel.isRegistered()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isRegistered()
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_keyFor_Selector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectableChannel#provider() public final
     * java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelectableChannel.provider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.spi.AbstractSelectableChannel#register(java.nio.channels.Selector,int,java.lang.Object)
     * public final java.nio.channels.SelectionKey
     * java.nio.channels.spi.AbstractSelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws
     * java.nio.channels.ClosedChannelException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_register_Selector_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
