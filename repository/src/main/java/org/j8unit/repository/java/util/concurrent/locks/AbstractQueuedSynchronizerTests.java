package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.locks.AbstractQueuedSynchronizer class
 * java.util.concurrent.locks.AbstractQueuedSynchronizer}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractQueuedSynchronizerTests<SUT extends java.util.concurrent.locks.AbstractQueuedSynchronizer>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.concurrent.locks.AbstractOwnableSynchronizerTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for
     * {@linkplain java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject class
     * java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerTests.ConditionObjectTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests.
     *      ConditionObjectClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ConditionObjectTests<SUT extends java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject>
    extends org.j8unit.repository.java.util.concurrent.locks.ConditionTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#await() public
         * final void java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await() throws
         * java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#await()
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
         * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#await(long, java.util.concurrent.TimeUnit)
         * public final boolean
         * java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(long,java.util.concurrent.TimeUnit)
         * throws java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#await(long,
         *             java.util.concurrent.TimeUnit)
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
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitNanos(long)
         * public final long java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(long)
         * throws java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitNanos(long)
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
         * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitUninterruptibly() public
         * final void java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitUninterruptibly()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitUninterruptibly()
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
         * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitUntil(java.util.Date)
         * public final boolean
         * java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitUntil(java.util.Date) throws
         * java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#awaitUntil(java.util.Date)
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
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#signal() public
         * final void java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.signal()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#signal()
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
         * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#signalAll()
         * public final void java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.signalAll()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject#signalAll()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#acquire(int) public final void
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#acquire(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquire_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireInterruptibly(int) public
     * final void java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(int) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireInterruptibly(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireInterruptibly_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireShared(int) public final void
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireShared(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireShared(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireShared_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireSharedInterruptibly(int)
     * public final void java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(int) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#acquireSharedInterruptibly(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireSharedInterruptibly_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getExclusiveQueuedThreads() public
     * final java.util.Collection java.util.concurrent.locks.AbstractQueuedSynchronizer.getExclusiveQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getExclusiveQueuedThreads()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getFirstQueuedThread() public final
     * java.lang.Thread java.util.concurrent.locks.AbstractQueuedSynchronizer.getFirstQueuedThread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getFirstQueuedThread()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getQueuedThreads() public final
     * java.util.Collection java.util.concurrent.locks.AbstractQueuedSynchronizer.getQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getQueuedThreads()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getQueueLength() public final int
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.getQueueLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getQueueLength()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getSharedQueuedThreads() public
     * final java.util.Collection java.util.concurrent.locks.AbstractQueuedSynchronizer.getSharedQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getSharedQueuedThreads()
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
     * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getWaitingThreads(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject)
     * public final java.util.Collection
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.getWaitingThreads(java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getWaitingThreads(java.util.concurrent.locks.
     *             AbstractQueuedSynchronizer.ConditionObject)
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
     * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject)
     * public final int
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#getWaitQueueLength(java.util.concurrent.locks.
     *             AbstractQueuedSynchronizer.ConditionObject)
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#hasContended() public final boolean
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.hasContended()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#hasContended()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#hasQueuedPredecessors() public final
     * boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.hasQueuedPredecessors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#hasQueuedPredecessors()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#hasQueuedThreads() public final
     * boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.hasQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#hasQueuedThreads()
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
     * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#hasWaiters(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject)
     * public final boolean
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.hasWaiters(java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#hasWaiters(java.util.concurrent.locks.
     *             AbstractQueuedSynchronizer.ConditionObject)
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#isQueued(java.lang.Thread) public
     * final boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.isQueued(java.lang.Thread)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#isQueued(java.lang.Thread)
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
     * {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#owns(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject)
     * public final boolean
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.owns(java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#owns(java.util.concurrent.locks.
     *             AbstractQueuedSynchronizer.ConditionObject)
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#release(int) public final boolean
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.release(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#release(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_release_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#releaseShared(int) public final
     * boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.releaseShared(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#releaseShared(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseShared_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#toString() public java.lang.String
     * java.util.concurrent.locks.AbstractQueuedSynchronizer.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#toString()
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
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#tryAcquireNanos(int, long) public
     * final boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.tryAcquireNanos(int,long) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#tryAcquireNanos(int, long)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquireNanos_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.AbstractQueuedSynchronizer#tryAcquireSharedNanos(int, long)
     * public final boolean java.util.concurrent.locks.AbstractQueuedSynchronizer.tryAcquireSharedNanos(int,long) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.AbstractQueuedSynchronizer#tryAcquireSharedNanos(int, long)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquireSharedNanos_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
