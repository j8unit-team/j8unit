package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.ReentrantLock class
 * java.util.concurrent.locks.ReentrantLock}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ReentrantLockClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.ReentrantLock class java.util.concurrent.locks.ReentrantLock (the hereby targeted
 *      class-under-test class)
 * @see ReentrantLockClassTests ReentrantLockClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReentrantLockTests<SUT extends java.util.concurrent.locks.ReentrantLock>
extends LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#unlock() public void
     * java.util.concurrent.locks.ReentrantLock.unlock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#unlock() public void
     * java.util.concurrent.locks.ReentrantLock.unlock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#unlock() public void
     *      java.util.concurrent.locks.ReentrantLock.unlock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unlock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantLock.isFair()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantLock.isFair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#isFair() public final boolean
     *      java.util.concurrent.locks.ReentrantLock.isFair() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFair()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.locks.ReentrantLock.tryLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.locks.ReentrantLock.tryLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#tryLock(long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.locks.ReentrantLock.tryLock(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tryLock_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock() public boolean
     * java.util.concurrent.locks.ReentrantLock.tryLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock() public boolean
     * java.util.concurrent.locks.ReentrantLock.tryLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#tryLock() public boolean
     *      java.util.concurrent.locks.ReentrantLock.tryLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tryLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantLock#getWaitQueueLength(java.util.concurrent.locks.Condition) public
     * int java.util.concurrent.locks.ReentrantLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantLock#getWaitQueueLength(java.util.concurrent.locks.Condition) public
     * int java.util.concurrent.locks.ReentrantLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#getWaitQueueLength(java.util.concurrent.locks.Condition) public int
     *      java.util.concurrent.locks.ReentrantLock.getWaitQueueLength(java.util.concurrent.locks.Condition) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWaitQueueLength_Condition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantLock.getQueueLength()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantLock.getQueueLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#getQueueLength() public final int
     *      java.util.concurrent.locks.ReentrantLock.getQueueLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQueueLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#newCondition() public
     * java.util.concurrent.locks.Condition java.util.concurrent.locks.ReentrantLock.newCondition()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#newCondition() public
     * java.util.concurrent.locks.Condition java.util.concurrent.locks.ReentrantLock.newCondition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#newCondition() public java.util.concurrent.locks.Condition
     *      java.util.concurrent.locks.ReentrantLock.newCondition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_newCondition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isLocked() public boolean
     * java.util.concurrent.locks.ReentrantLock.isLocked()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isLocked() public boolean
     * java.util.concurrent.locks.ReentrantLock.isLocked()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#isLocked() public boolean
     *      java.util.concurrent.locks.ReentrantLock.isLocked() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLocked()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lockInterruptibly() public void
     * java.util.concurrent.locks.ReentrantLock.lockInterruptibly() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lockInterruptibly() public void
     * java.util.concurrent.locks.ReentrantLock.lockInterruptibly() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#lockInterruptibly() public void
     *      java.util.concurrent.locks.ReentrantLock.lockInterruptibly() throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lockInterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getHoldCount() public int
     * java.util.concurrent.locks.ReentrantLock.getHoldCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getHoldCount() public int
     * java.util.concurrent.locks.ReentrantLock.getHoldCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#getHoldCount() public int
     *      java.util.concurrent.locks.ReentrantLock.getHoldCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHoldCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThread(Thread) public final boolean
     * java.util.concurrent.locks.ReentrantLock.hasQueuedThread(java.lang.Thread)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThread(Thread) public final boolean
     * java.util.concurrent.locks.ReentrantLock.hasQueuedThread(java.lang.Thread)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#hasQueuedThread(Thread) public final boolean
     *      java.util.concurrent.locks.ReentrantLock.hasQueuedThread(java.lang.Thread) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasQueuedThread_Thread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lock() public void
     * java.util.concurrent.locks.ReentrantLock.lock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lock() public void
     * java.util.concurrent.locks.ReentrantLock.lock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#lock() public void java.util.concurrent.locks.ReentrantLock.lock()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isHeldByCurrentThread() public boolean
     * java.util.concurrent.locks.ReentrantLock.isHeldByCurrentThread()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isHeldByCurrentThread() public boolean
     * java.util.concurrent.locks.ReentrantLock.isHeldByCurrentThread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#isHeldByCurrentThread() public boolean
     *      java.util.concurrent.locks.ReentrantLock.isHeldByCurrentThread() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isHeldByCurrentThread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantLock.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantLock.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#toString() public java.lang.String
     *      java.util.concurrent.locks.ReentrantLock.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantLock.hasQueuedThreads()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantLock.hasQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#hasQueuedThreads() public final boolean
     *      java.util.concurrent.locks.ReentrantLock.hasQueuedThreads() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasQueuedThreads()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasWaiters(java.util.concurrent.locks.Condition)
     * public boolean java.util.concurrent.locks.ReentrantLock.hasWaiters(java.util.concurrent.locks.Condition)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasWaiters(java.util.concurrent.locks.Condition)
     * public boolean java.util.concurrent.locks.ReentrantLock.hasWaiters(java.util.concurrent.locks.Condition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantLock#hasWaiters(java.util.concurrent.locks.Condition) public boolean
     *      java.util.concurrent.locks.ReentrantLock.hasWaiters(java.util.concurrent.locks.Condition) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasWaiters_Condition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
