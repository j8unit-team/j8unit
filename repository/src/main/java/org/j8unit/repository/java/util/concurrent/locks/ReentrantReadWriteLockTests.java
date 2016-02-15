package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock class
 * java.util.concurrent.locks.ReentrantReadWriteLock}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ReentrantReadWriteLockClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.ReentrantReadWriteLock class java.util.concurrent.locks.ReentrantReadWriteLock (the
 *      hereby targeted class-under-test class)
 * @see ReentrantReadWriteLockClassTests ReentrantReadWriteLockClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReentrantReadWriteLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock>
extends ReadWriteLockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWriteHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWriteHoldCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWriteHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWriteHoldCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#getWriteHoldCount() public int
     *      java.util.concurrent.locks.ReentrantReadWriteLock.getWriteHoldCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWriteHoldCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getQueueLength()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getQueueLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#getQueueLength() public final int
     *      java.util.concurrent.locks.ReentrantReadWriteLock.getQueueLength() (the hereby targeted method-under-test)
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
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWaitQueueLength(java.util.concurrent.locks.Condition)
     * public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWaitQueueLength(java.util.concurrent.locks.Condition)
     * public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#getWaitQueueLength(java.util.concurrent.locks.Condition)
     *      public int
     *      java.util.concurrent.locks.ReentrantReadWriteLock.getWaitQueueLength(java.util.concurrent.locks.Condition)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isFair()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isFair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#isFair() public final boolean
     *      java.util.concurrent.locks.ReentrantReadWriteLock.isFair() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#writeLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock
     * java.util.concurrent.locks.ReentrantReadWriteLock.writeLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#writeLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock
     * java.util.concurrent.locks.ReentrantReadWriteLock.writeLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#writeLock() public
     *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock
     *      java.util.concurrent.locks.ReentrantReadWriteLock.writeLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#readLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
     * java.util.concurrent.locks.ReentrantReadWriteLock.readLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#readLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
     * java.util.concurrent.locks.ReentrantReadWriteLock.readLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#readLock() public
     *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
     *      java.util.concurrent.locks.ReentrantReadWriteLock.readLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadLockCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadLockCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadLockCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadLockCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#getReadLockCount() public int
     *      java.util.concurrent.locks.ReentrantReadWriteLock.getReadLockCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReadLockCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantReadWriteLock.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantReadWriteLock.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#toString() public java.lang.String
     *      java.util.concurrent.locks.ReentrantReadWriteLock.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThreads()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThreads() public final boolean
     *      java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThreads() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasWaiters(java.util.concurrent.locks.Condition) public
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasWaiters(java.util.concurrent.locks.Condition)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasWaiters(java.util.concurrent.locks.Condition) public
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasWaiters(java.util.concurrent.locks.Condition)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#hasWaiters(java.util.concurrent.locks.Condition) public
     *      boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasWaiters(java.util.concurrent.locks.Condition)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThread(Thread) public final
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThread(java.lang.Thread)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThread(Thread) public final
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThread(java.lang.Thread)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThread(Thread) public final boolean
     *      java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThread(java.lang.Thread) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLocked() public boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLocked()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLocked() public boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLocked()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLocked() public boolean
     *      java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLocked() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWriteLocked()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLockedByCurrentThread() public
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLockedByCurrentThread()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLockedByCurrentThread() public
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLockedByCurrentThread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLockedByCurrentThread() public boolean
     *      java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLockedByCurrentThread() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWriteLockedByCurrentThread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadHoldCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadHoldCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#getReadHoldCount() public int
     *      java.util.concurrent.locks.ReentrantReadWriteLock.getReadHoldCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReadHoldCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link ReentrantReadWriteLockClassTests.WriteLockClassTests}.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock class
     *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock (the hereby targeted class-under-test class)
     * @see ReentrantReadWriteLockClassTests.WriteLockClassTests ReentrantReadWriteLockClassTests.WriteLockClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface WriteLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock>
    extends LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#getHoldCount() public int
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.getHoldCount()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#getHoldCount() public int
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.getHoldCount()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#getHoldCount() public int
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.getHoldCount() (the hereby targeted
         *      method-under-test)
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
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock(long, java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock(long,java.util.concurrent.TimeUnit)
         * throws java.lang.InterruptedException}.
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock(long, java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock(long,java.util.concurrent.TimeUnit)
         * throws java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock(long, java.util.concurrent.TimeUnit)
         *      public boolean
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock(long,java.util.concurrent.TimeUnit)
         *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock() public boolean
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lock() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#isHeldByCurrentThread()
         * public boolean java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.isHeldByCurrentThread()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#isHeldByCurrentThread()
         * public boolean java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.isHeldByCurrentThread()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#isHeldByCurrentThread() public boolean
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.isHeldByCurrentThread() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.toString()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#toString() public java.lang.String
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.toString() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.newCondition()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.newCondition()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#newCondition() public
         *      java.util.concurrent.locks.Condition
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.newCondition() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lockInterruptibly() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lockInterruptibly() throws
         *      java.lang.InterruptedException (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#unlock() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock() (the hereby targeted
         *      method-under-test)
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

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link ReentrantReadWriteLockClassTests.ReadLockClassTests}.
     * </p>
     *
     * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock class
     *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock (the hereby targeted class-under-test class)
     * @see ReentrantReadWriteLockClassTests.ReadLockClassTests ReentrantReadWriteLockClassTests.ReadLockClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReadLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock>
    extends LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.newCondition()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.newCondition()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#newCondition() public
         *      java.util.concurrent.locks.Condition
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.newCondition() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lockInterruptibly() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lockInterruptibly() throws
         *      java.lang.InterruptedException (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#unlock() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock() (the hereby targeted
         *      method-under-test)
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
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock(long, java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock(long,java.util.concurrent.TimeUnit) throws
         * java.lang.InterruptedException}.
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock(long, java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock(long,java.util.concurrent.TimeUnit) throws
         * java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock(long, java.util.concurrent.TimeUnit)
         *      public boolean
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock(long,java.util.concurrent.TimeUnit)
         *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock() public boolean
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lock() public void
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock() (the hereby targeted
         *      method-under-test)
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.toString()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#toString() public java.lang.String
         *      java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.toString() (the hereby targeted
         *      method-under-test)
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

    }

}
