package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer class
 * java.util.concurrent.locks.AbstractQueuedLongSynchronizer}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractQueuedLongSynchronizerTests<SUT extends java.util.concurrent.locks.AbstractQueuedLongSynchronizer>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.concurrent.locks.AbstractOwnableSynchronizerTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject class
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerClassTests.
     *      ConditionObjectClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ConditionObjectTests<SUT extends java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject>
    extends org.j8unit.repository.java.util.concurrent.locks.ConditionTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#await()
         * public final void java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.await() throws
         * java.lang.InterruptedException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_await()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#await(long,java.util.concurrent.TimeUnit)
         * public final boolean
         * java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.await(long,java.util.concurrent.TimeUnit)
         * throws java.lang.InterruptedException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_await_long_TimeUnit()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#awaitNanos(long) public
         * final long java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.awaitNanos(long) throws
         * java.lang.InterruptedException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_awaitNanos_long()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#awaitUninterruptibly()
         * public final void
         * java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.awaitUninterruptibly()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_awaitUninterruptibly()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#awaitUntil(java.util.Date)
         * public final boolean
         * java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.awaitUntil(java.util.Date) throws
         * java.lang.InterruptedException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_awaitUntil_Date()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#signal()
         * public final void java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.signal()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_signal()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject#signalAll()
         * public final void java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject.signalAll()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_signalAll()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#acquire(long) public final void
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.acquire(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquire_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#acquireInterruptibly(long)
     * public final void java.util.concurrent.locks.AbstractQueuedLongSynchronizer.acquireInterruptibly(long) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireInterruptibly_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#acquireShared(long) public final
     * void java.util.concurrent.locks.AbstractQueuedLongSynchronizer.acquireShared(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireShared_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#acquireSharedInterruptibly(long)
     * public final void java.util.concurrent.locks.AbstractQueuedLongSynchronizer.acquireSharedInterruptibly(long)
     * throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireSharedInterruptibly_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getExclusiveQueuedThreads()
     * public final java.util.Collection
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getExclusiveQueuedThreads()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExclusiveQueuedThreads()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getFirstQueuedThread() public
     * final java.lang.Thread java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getFirstQueuedThread()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFirstQueuedThread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getQueuedThreads() public final
     * java.util.Collection java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getQueuedThreads()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQueuedThreads()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getQueueLength() public final
     * int java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getQueueLength()}.
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getSharedQueuedThreads() public
     * final java.util.Collection java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getSharedQueuedThreads()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSharedQueuedThreads()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getWaitingThreads(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject)
     * public final java.util.Collection
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getWaitingThreads(java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWaitingThreads_ConditionObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject)
     * public final int
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWaitQueueLength_ConditionObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#hasContended() public final
     * boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.hasContended()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasContended()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#hasQueuedPredecessors() public
     * final boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.hasQueuedPredecessors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasQueuedPredecessors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#hasQueuedThreads() public final
     * boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.hasQueuedThreads()}.
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
     * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#hasWaiters(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject)
     * public final boolean
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.hasWaiters(java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasWaiters_ConditionObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#isQueued(java.lang.Thread)
     * public final boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.isQueued(java.lang.Thread)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isQueued_Thread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#owns(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject)
     * public final boolean
     * java.util.concurrent.locks.AbstractQueuedLongSynchronizer.owns(java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_owns_ConditionObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#release(long) public final
     * boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.release(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_release_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#releaseShared(long) public final
     * boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.releaseShared(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseShared_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#toString() public
     * java.lang.String java.util.concurrent.locks.AbstractQueuedLongSynchronizer.toString()}.
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#tryAcquireNanos(long,long)
     * public final boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.tryAcquireNanos(long,long) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquireNanos_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedLongSynchronizer#tryAcquireSharedNanos(long,long)
     * public final boolean java.util.concurrent.locks.AbstractQueuedLongSynchronizer.tryAcquireSharedNanos(long,long)
     * throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquireSharedNanos_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
