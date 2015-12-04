package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.TransferQueue interface java.util.concurrent.TransferQueue}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.TransferQueueClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransferQueueTests<SUT extends java.util.concurrent.TransferQueue<E>, E>
extends org.j8unit.repository.java.util.concurrent.BlockingQueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#getWaitingConsumerCount() public abstract int
     * java.util.concurrent.TransferQueue.getWaitingConsumerCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWaitingConsumerCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#hasWaitingConsumer() public abstract boolean
     * java.util.concurrent.TransferQueue.hasWaitingConsumer()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasWaitingConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#transfer(java.lang.Object) public abstract void
     * java.util.concurrent.TransferQueue.transfer(java.lang.Object) throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transfer_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#tryTransfer(java.lang.Object) public abstract boolean
     * java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryTransfer_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.TransferQueue#tryTransfer(java.lang.Object,long,java.util.concurrent.TimeUnit) public
     * abstract boolean
     * java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryTransfer_Object_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
