package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ForkJoinWorkerThread class
 * java.util.concurrent.ForkJoinWorkerThread}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ForkJoinWorkerThreadClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ForkJoinWorkerThread class java.util.concurrent.ForkJoinWorkerThread (the hereby targeted
 *      class-under-test class)
 * @see ForkJoinWorkerThreadClassTests ForkJoinWorkerThreadClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForkJoinWorkerThreadTests<SUT extends java.util.concurrent.ForkJoinWorkerThread>
extends org.j8unit.repository.java.lang.ThreadTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#getPoolIndex() public int
     * java.util.concurrent.ForkJoinWorkerThread.getPoolIndex()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#getPoolIndex() public int
     * java.util.concurrent.ForkJoinWorkerThread.getPoolIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinWorkerThread#getPoolIndex() public int
     *      java.util.concurrent.ForkJoinWorkerThread.getPoolIndex() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPoolIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#getPool() public
     * java.util.concurrent.ForkJoinPool java.util.concurrent.ForkJoinWorkerThread.getPool()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#getPool() public
     * java.util.concurrent.ForkJoinPool java.util.concurrent.ForkJoinWorkerThread.getPool()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinWorkerThread#getPool() public java.util.concurrent.ForkJoinPool
     *      java.util.concurrent.ForkJoinWorkerThread.getPool() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPool()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#run() public void
     * java.util.concurrent.ForkJoinWorkerThread.run()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinWorkerThread#run() public void
     * java.util.concurrent.ForkJoinWorkerThread.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinWorkerThread#run() public void java.util.concurrent.ForkJoinWorkerThread.run()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_run()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
