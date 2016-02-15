package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CyclicBarrier class
 * java.util.concurrent.CyclicBarrier}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CyclicBarrierClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CyclicBarrier class java.util.concurrent.CyclicBarrier (the hereby targeted
 *      class-under-test class)
 * @see CyclicBarrierClassTests CyclicBarrierClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CyclicBarrierTests<SUT extends java.util.concurrent.CyclicBarrier>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#getParties() public int
     * java.util.concurrent.CyclicBarrier.getParties()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#getParties() public int
     * java.util.concurrent.CyclicBarrier.getParties()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#getParties() public int java.util.concurrent.CyclicBarrier.getParties()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#await(long, java.util.concurrent.TimeUnit) public int
     * java.util.concurrent.CyclicBarrier.await(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException,java.util.concurrent.TimeoutException}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#await(long, java.util.concurrent.TimeUnit) public int
     * java.util.concurrent.CyclicBarrier.await(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException,java.util.concurrent.TimeoutException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#await(long, java.util.concurrent.TimeUnit) public int
     *      java.util.concurrent.CyclicBarrier.await(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException,java.util.concurrent.
     *      TimeoutException (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CyclicBarrier#await() public int
     * java.util.concurrent.CyclicBarrier.await() throws
     * java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#await() public int
     * java.util.concurrent.CyclicBarrier.await() throws
     * java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#await() public int java.util.concurrent.CyclicBarrier.await() throws
     *      java.lang.InterruptedException,java.util.concurrent.BrokenBarrierException (the hereby targeted
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
     * Test method for {@link java.util.concurrent.CyclicBarrier#reset() public void
     * java.util.concurrent.CyclicBarrier.reset()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#reset() public void
     * java.util.concurrent.CyclicBarrier.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#reset() public void java.util.concurrent.CyclicBarrier.reset() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#getNumberWaiting() public int
     * java.util.concurrent.CyclicBarrier.getNumberWaiting()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#getNumberWaiting() public int
     * java.util.concurrent.CyclicBarrier.getNumberWaiting()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#getNumberWaiting() public int
     *      java.util.concurrent.CyclicBarrier.getNumberWaiting() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumberWaiting()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#isBroken() public boolean
     * java.util.concurrent.CyclicBarrier.isBroken()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CyclicBarrier#isBroken() public boolean
     * java.util.concurrent.CyclicBarrier.isBroken()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CyclicBarrier#isBroken() public boolean java.util.concurrent.CyclicBarrier.isBroken()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBroken()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
