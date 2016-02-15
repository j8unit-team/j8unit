package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ScheduledExecutorService interface
 * java.util.concurrent.ScheduledExecutorService}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ScheduledExecutorServiceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ScheduledExecutorService interface java.util.concurrent.ScheduledExecutorService (the
 *      hereby targeted class-under-test class)
 * @see ScheduledExecutorServiceClassTests ScheduledExecutorServiceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScheduledExecutorServiceTests<SUT extends java.util.concurrent.ScheduledExecutorService>
extends ExecutorServiceTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#scheduleAtFixedRate(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledExecutorService.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#scheduleAtFixedRate(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledExecutorService.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledExecutorService#scheduleAtFixedRate(Runnable, long, long,
     *      java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledExecutorService.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.
     *      concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scheduleAtFixedRate_Runnable_long_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#schedule(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)
     * public abstract <V> java.util.concurrent.ScheduledFuture
     * <V> java.util.concurrent.ScheduledExecutorService.schedule(java.util.concurrent.Callable
     * <V>,long,java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#schedule(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledExecutorService.schedule(java.util.concurrent.Callable,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledExecutorService#schedule(java.util.concurrent.Callable, long,
     *      java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledExecutorService.schedule(java.util.concurrent.Callable,long,java.util.
     *      concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_schedule_Callable_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#schedule(Runnable, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledExecutorService.schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#schedule(Runnable, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledExecutorService.schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledExecutorService#schedule(Runnable, long, java.util.concurrent.TimeUnit) public
     *      abstract java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledExecutorService.schedule(java.lang.Runnable,long,java.util.concurrent.
     *      TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_schedule_Runnable_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#scheduleWithFixedDelay(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledExecutorService.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledExecutorService#scheduleWithFixedDelay(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledExecutorService.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledExecutorService#scheduleWithFixedDelay(Runnable, long, long,
     *      java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledExecutorService.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.
     *      concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scheduleWithFixedDelay_Runnable_long_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
