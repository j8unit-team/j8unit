package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.Lock interface java.util.concurrent.locks.Lock}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link LockClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.Lock interface java.util.concurrent.locks.Lock (the hereby targeted class-under-test
 *      class)
 * @see LockClassTests LockClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LockTests<SUT extends java.util.concurrent.locks.Lock>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#lockInterruptibly() public abstract void
     * java.util.concurrent.locks.Lock.lockInterruptibly() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#lockInterruptibly() public abstract void
     * java.util.concurrent.locks.Lock.lockInterruptibly() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#lockInterruptibly() public abstract void
     *      java.util.concurrent.locks.Lock.lockInterruptibly() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.Lock#unlock() public abstract void
     * java.util.concurrent.locks.Lock.unlock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#unlock() public abstract void
     * java.util.concurrent.locks.Lock.unlock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#unlock() public abstract void java.util.concurrent.locks.Lock.unlock() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.Lock#newCondition() public abstract
     * java.util.concurrent.locks.Condition java.util.concurrent.locks.Lock.newCondition()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#newCondition() public abstract
     * java.util.concurrent.locks.Condition java.util.concurrent.locks.Lock.newCondition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#newCondition() public abstract java.util.concurrent.locks.Condition
     *      java.util.concurrent.locks.Lock.newCondition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.Lock#lock() public abstract void
     * java.util.concurrent.locks.Lock.lock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#lock() public abstract void
     * java.util.concurrent.locks.Lock.lock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#lock() public abstract void java.util.concurrent.locks.Lock.lock() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.Lock#tryLock() public abstract boolean
     * java.util.concurrent.locks.Lock.tryLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#tryLock() public abstract boolean
     * java.util.concurrent.locks.Lock.tryLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#tryLock() public abstract boolean java.util.concurrent.locks.Lock.tryLock()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.locks.Lock#tryLock(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.util.concurrent.locks.Lock.tryLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Lock#tryLock(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.util.concurrent.locks.Lock.tryLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Lock#tryLock(long, java.util.concurrent.TimeUnit) public abstract boolean
     *      java.util.concurrent.locks.Lock.tryLock(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryLock_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
