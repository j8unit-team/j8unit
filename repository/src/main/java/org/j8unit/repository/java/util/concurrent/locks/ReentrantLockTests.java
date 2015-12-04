package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.locks.ReentrantLock class java.util.concurrent.locks.ReentrantLock},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantLockClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReentrantLockTests<SUT extends java.util.concurrent.locks.ReentrantLock>
extends org.j8unit.repository.java.util.concurrent.locks.LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getHoldCount() public int
     * java.util.concurrent.locks.ReentrantLock.getHoldCount()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantLock.getQueueLength()}.
     * </p>
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
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantLock#getWaitQueueLength(java.util.concurrent.locks.Condition) public
     * int java.util.concurrent.locks.ReentrantLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThread(java.lang.Thread) public final
     * boolean java.util.concurrent.locks.ReentrantLock.hasQueuedThread(java.lang.Thread)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantLock.hasQueuedThreads()}.
     * </p>
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
     * </p>
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantLock.isFair()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isHeldByCurrentThread() public boolean
     * java.util.concurrent.locks.ReentrantLock.isHeldByCurrentThread()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#isLocked() public boolean
     * java.util.concurrent.locks.ReentrantLock.isLocked()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lock() public void
     * java.util.concurrent.locks.ReentrantLock.lock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_lock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#lockInterruptibly() public void
     * java.util.concurrent.locks.ReentrantLock.lockInterruptibly() throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_lockInterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#newCondition() public
     * java.util.concurrent.locks.Condition java.util.concurrent.locks.ReentrantLock.newCondition()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_newCondition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantLock.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock() public boolean
     * java.util.concurrent.locks.ReentrantLock.tryLock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_tryLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#tryLock(long,java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.locks.ReentrantLock.tryLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_tryLock_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantLock#unlock() public void
     * java.util.concurrent.locks.ReentrantLock.unlock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_unlock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
