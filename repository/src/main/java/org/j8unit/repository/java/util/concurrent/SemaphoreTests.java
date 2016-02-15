package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.Semaphore class java.util.concurrent.Semaphore}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SemaphoreClassTests}.
 * </p>
 *
 * @see java.util.concurrent.Semaphore class java.util.concurrent.Semaphore (the hereby targeted class-under-test class)
 * @see SemaphoreClassTests SemaphoreClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SemaphoreTests<SUT extends java.util.concurrent.Semaphore>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#release(int) public void
     * java.util.concurrent.Semaphore.release(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#release(int) public void
     * java.util.concurrent.Semaphore.release(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#release(int) public void java.util.concurrent.Semaphore.release(int) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#release() public void
     * java.util.concurrent.Semaphore.release()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#release() public void
     * java.util.concurrent.Semaphore.release()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#release() public void java.util.concurrent.Semaphore.release() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_release()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#availablePermits() public int
     * java.util.concurrent.Semaphore.availablePermits()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#availablePermits() public int
     * java.util.concurrent.Semaphore.availablePermits()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#availablePermits() public int
     *      java.util.concurrent.Semaphore.availablePermits() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_availablePermits()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#isFair() public boolean
     * java.util.concurrent.Semaphore.isFair()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#isFair() public boolean
     * java.util.concurrent.Semaphore.isFair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#isFair() public boolean java.util.concurrent.Semaphore.isFair() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#acquire() public void
     * java.util.concurrent.Semaphore.acquire() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquire() public void
     * java.util.concurrent.Semaphore.acquire() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#acquire() public void java.util.concurrent.Semaphore.acquire() throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquire()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquire(int) public void
     * java.util.concurrent.Semaphore.acquire(int) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquire(int) public void
     * java.util.concurrent.Semaphore.acquire(int) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#acquire(int) public void java.util.concurrent.Semaphore.acquire(int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#getQueueLength() public final int
     * java.util.concurrent.Semaphore.getQueueLength()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#getQueueLength() public final int
     * java.util.concurrent.Semaphore.getQueueLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#getQueueLength() public final int
     *      java.util.concurrent.Semaphore.getQueueLength() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#drainPermits() public int
     * java.util.concurrent.Semaphore.drainPermits()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#drainPermits() public int
     * java.util.concurrent.Semaphore.drainPermits()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#drainPermits() public int java.util.concurrent.Semaphore.drainPermits() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_drainPermits()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquireUninterruptibly() public void
     * java.util.concurrent.Semaphore.acquireUninterruptibly()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquireUninterruptibly() public void
     * java.util.concurrent.Semaphore.acquireUninterruptibly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#acquireUninterruptibly() public void
     *      java.util.concurrent.Semaphore.acquireUninterruptibly() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireUninterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquireUninterruptibly(int) public void
     * java.util.concurrent.Semaphore.acquireUninterruptibly(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#acquireUninterruptibly(int) public void
     * java.util.concurrent.Semaphore.acquireUninterruptibly(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#acquireUninterruptibly(int) public void
     *      java.util.concurrent.Semaphore.acquireUninterruptibly(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquireUninterruptibly_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#toString() public java.lang.String
     * java.util.concurrent.Semaphore.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#toString() public java.lang.String
     * java.util.concurrent.Semaphore.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#toString() public java.lang.String java.util.concurrent.Semaphore.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#hasQueuedThreads() public final boolean
     * java.util.concurrent.Semaphore.hasQueuedThreads()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#hasQueuedThreads() public final boolean
     * java.util.concurrent.Semaphore.hasQueuedThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#hasQueuedThreads() public final boolean
     *      java.util.concurrent.Semaphore.hasQueuedThreads() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(int, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.Semaphore.tryAcquire(int,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(int, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.Semaphore.tryAcquire(int,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#tryAcquire(int, long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.Semaphore.tryAcquire(int,long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquire_int_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(int) public boolean
     * java.util.concurrent.Semaphore.tryAcquire(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(int) public boolean
     * java.util.concurrent.Semaphore.tryAcquire(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#tryAcquire(int) public boolean java.util.concurrent.Semaphore.tryAcquire(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquire_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.Semaphore.tryAcquire(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire(long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.Semaphore.tryAcquire(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#tryAcquire(long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.Semaphore.tryAcquire(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquire_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire() public boolean
     * java.util.concurrent.Semaphore.tryAcquire()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Semaphore#tryAcquire() public boolean
     * java.util.concurrent.Semaphore.tryAcquire()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Semaphore#tryAcquire() public boolean java.util.concurrent.Semaphore.tryAcquire() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryAcquire()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
