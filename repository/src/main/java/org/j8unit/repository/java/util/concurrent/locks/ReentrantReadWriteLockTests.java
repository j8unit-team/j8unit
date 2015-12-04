package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.locks.ReentrantReadWriteLock class
 * java.util.concurrent.locks.ReentrantReadWriteLock}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReentrantReadWriteLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock>
extends org.j8unit.repository.java.util.concurrent.locks.ReadWriteLockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.ReadLockClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReadLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock>
    extends org.j8unit.repository.java.util.concurrent.locks.LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.newCondition()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock()}.
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
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#tryLock(long,java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.tryLock(long,java.util.concurrent.TimeUnit) throws
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()}.
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

    /**
     * <p>
     * Test class for {@link java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.WriteLockClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface WriteLockTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock>
    extends org.j8unit.repository.java.util.concurrent.locks.LockTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#getHoldCount() public int
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.getHoldCount()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#isHeldByCurrentThread()
         * public boolean java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.isHeldByCurrentThread()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#lockInterruptibly() public
         * void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lockInterruptibly() throws
         * java.lang.InterruptedException}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#newCondition() public
         * java.util.concurrent.locks.Condition
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.newCondition()}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#toString() public
         * java.lang.String java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock() public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock()}.
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
         * Test method for
         * {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#tryLock(long,java.util.concurrent.TimeUnit)
         * public boolean
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.tryLock(long,java.util.concurrent.TimeUnit)
         * throws java.lang.InterruptedException}.
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
         * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#unlock() public void
         * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()}.
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getQueueLength() public final int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getQueueLength()}.
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadHoldCount()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getReadLockCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getReadLockCount()}.
     * </p>
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
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWaitQueueLength(java.util.concurrent.locks.Condition)
     * public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWaitQueueLength(java.util.concurrent.locks.Condition)}.
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#getWriteHoldCount() public int
     * java.util.concurrent.locks.ReentrantReadWriteLock.getWriteHoldCount()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThread(java.lang.Thread) public
     * final boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThread(java.lang.Thread)}.
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasQueuedThreads() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.hasQueuedThreads()}.
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
     * Test method for
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#hasWaiters(java.util.concurrent.locks.Condition) public
     * boolean java.util.concurrent.locks.ReentrantReadWriteLock.hasWaiters(java.util.concurrent.locks.Condition)}.
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isFair() public final boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isFair()}.
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#isWriteLocked() public boolean
     * java.util.concurrent.locks.ReentrantReadWriteLock.isWriteLocked()}.
     * </p>
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
     * </p>
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
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#readLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
     * java.util.concurrent.locks.ReentrantReadWriteLock.readLock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_readLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#toString() public java.lang.String
     * java.util.concurrent.locks.ReentrantReadWriteLock.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_writeLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
