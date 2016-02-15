package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.TransferQueue interface
 * java.util.concurrent.TransferQueue}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link TransferQueueClassTests}.
 * </p>
 *
 * @see java.util.concurrent.TransferQueue interface java.util.concurrent.TransferQueue (the hereby targeted
 *      class-under-test class)
 * @see TransferQueueClassTests TransferQueueClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransferQueueTests<SUT extends java.util.concurrent.TransferQueue<E>, E>
extends BlockingQueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#hasWaitingConsumer() public abstract boolean
     * java.util.concurrent.TransferQueue.hasWaitingConsumer()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#hasWaitingConsumer() public abstract boolean
     * java.util.concurrent.TransferQueue.hasWaitingConsumer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.TransferQueue#hasWaitingConsumer() public abstract boolean
     *      java.util.concurrent.TransferQueue.hasWaitingConsumer() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.TransferQueue#getWaitingConsumerCount() public abstract int
     * java.util.concurrent.TransferQueue.getWaitingConsumerCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#getWaitingConsumerCount() public abstract int
     * java.util.concurrent.TransferQueue.getWaitingConsumerCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.TransferQueue#getWaitingConsumerCount() public abstract int
     *      java.util.concurrent.TransferQueue.getWaitingConsumerCount() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.TransferQueue#tryTransfer(Object) public abstract boolean
     * java.util.concurrent.TransferQueue.tryTransfer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#tryTransfer(Object) public abstract boolean
     * java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.TransferQueue#tryTransfer(Object) public abstract boolean
     *      java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object) (the hereby targeted method-under-test)
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
     * {@link java.util.concurrent.TransferQueue#tryTransfer(Object, long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.util.concurrent.TransferQueue.tryTransfer(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.TransferQueue#tryTransfer(Object, long, java.util.concurrent.TimeUnit) public
     * abstract boolean
     * java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.TransferQueue#tryTransfer(Object, long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.TransferQueue.tryTransfer(java.lang.Object,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#transfer(Object) public abstract void
     * java.util.concurrent.TransferQueue.transfer(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.TransferQueue#transfer(Object) public abstract void
     * java.util.concurrent.TransferQueue.transfer(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.TransferQueue#transfer(Object) public abstract void
     *      java.util.concurrent.TransferQueue.transfer(java.lang.Object) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
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

}
