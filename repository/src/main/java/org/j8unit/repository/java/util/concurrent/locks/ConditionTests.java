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
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.Condition interface
 * java.util.concurrent.locks.Condition}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ConditionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.Condition interface java.util.concurrent.locks.Condition (the hereby targeted
 *      class-under-test class)
 * @see ConditionClassTests ConditionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConditionTests<SUT extends java.util.concurrent.locks.Condition>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#signalAll() public abstract void
     * java.util.concurrent.locks.Condition.signalAll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#signalAll() public abstract void
     * java.util.concurrent.locks.Condition.signalAll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#signalAll() public abstract void
     *      java.util.concurrent.locks.Condition.signalAll() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_signalAll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitNanos(long) public abstract long
     * java.util.concurrent.locks.Condition.awaitNanos(long) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitNanos(long) public abstract long
     * java.util.concurrent.locks.Condition.awaitNanos(long) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#awaitNanos(long) public abstract long
     *      java.util.concurrent.locks.Condition.awaitNanos(long) throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_awaitNanos_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitUninterruptibly() public abstract void
     * java.util.concurrent.locks.Condition.awaitUninterruptibly()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitUninterruptibly() public abstract void
     * java.util.concurrent.locks.Condition.awaitUninterruptibly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#awaitUninterruptibly() public abstract void
     *      java.util.concurrent.locks.Condition.awaitUninterruptibly() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_awaitUninterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#await(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.util.concurrent.locks.Condition.await(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#await(long, java.util.concurrent.TimeUnit) public
     * abstract boolean java.util.concurrent.locks.Condition.await(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#await(long, java.util.concurrent.TimeUnit) public abstract boolean
     *      java.util.concurrent.locks.Condition.await(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_await_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#await() public abstract void
     * java.util.concurrent.locks.Condition.await() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#await() public abstract void
     * java.util.concurrent.locks.Condition.await() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#await() public abstract void
     *      java.util.concurrent.locks.Condition.await() throws java.lang.InterruptedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_await()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitUntil(java.util.Date) public abstract boolean
     * java.util.concurrent.locks.Condition.awaitUntil(java.util.Date) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#awaitUntil(java.util.Date) public abstract boolean
     * java.util.concurrent.locks.Condition.awaitUntil(java.util.Date) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#awaitUntil(java.util.Date) public abstract boolean
     *      java.util.concurrent.locks.Condition.awaitUntil(java.util.Date) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_awaitUntil_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#signal() public abstract void
     * java.util.concurrent.locks.Condition.signal()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.Condition#signal() public abstract void
     * java.util.concurrent.locks.Condition.signal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.Condition#signal() public abstract void
     *      java.util.concurrent.locks.Condition.signal() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_signal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
