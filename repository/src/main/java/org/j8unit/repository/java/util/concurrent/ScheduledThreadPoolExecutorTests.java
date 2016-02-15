package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ScheduledThreadPoolExecutor class
 * java.util.concurrent.ScheduledThreadPoolExecutor}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ScheduledThreadPoolExecutorClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ScheduledThreadPoolExecutor class java.util.concurrent.ScheduledThreadPoolExecutor (the
 *      hereby targeted class-under-test class)
 * @see ScheduledThreadPoolExecutorClassTests ScheduledThreadPoolExecutorClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScheduledThreadPoolExecutorTests<SUT extends java.util.concurrent.ScheduledThreadPoolExecutor>
extends ScheduledExecutorServiceTests<SUT>, ThreadPoolExecutorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#execute(Runnable) public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.execute(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#execute(Runnable) public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.execute(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#execute(Runnable) public void
     *      java.util.concurrent.ScheduledThreadPoolExecutor.execute(java.lang.Runnable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_execute_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#scheduleAtFixedRate(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledThreadPoolExecutor.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#scheduleAtFixedRate(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledThreadPoolExecutor.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#scheduleAtFixedRate(Runnable, long, long,
     *      java.util.concurrent.TimeUnit) public java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledThreadPoolExecutor.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.
     *      concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#getExecuteExistingDelayedTasksAfterShutdownPolicy()
     * public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getExecuteExistingDelayedTasksAfterShutdownPolicy()}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#getExecuteExistingDelayedTasksAfterShutdownPolicy()
     * public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getExecuteExistingDelayedTasksAfterShutdownPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#getExecuteExistingDelayedTasksAfterShutdownPolicy() public
     *      boolean java.util.concurrent.ScheduledThreadPoolExecutor.getExecuteExistingDelayedTasksAfterShutdownPolicy()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExecuteExistingDelayedTasksAfterShutdownPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#getContinueExistingPeriodicTasksAfterShutdownPolicy()
     * public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getContinueExistingPeriodicTasksAfterShutdownPolicy()}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#getContinueExistingPeriodicTasksAfterShutdownPolicy()
     * public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getContinueExistingPeriodicTasksAfterShutdownPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#getContinueExistingPeriodicTasksAfterShutdownPolicy()
     *      public boolean
     *      java.util.concurrent.ScheduledThreadPoolExecutor.getContinueExistingPeriodicTasksAfterShutdownPolicy() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContinueExistingPeriodicTasksAfterShutdownPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#scheduleWithFixedDelay(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledThreadPoolExecutor.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#scheduleWithFixedDelay(Runnable, long, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledThreadPoolExecutor.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#scheduleWithFixedDelay(Runnable, long, long,
     *      java.util.concurrent.TimeUnit) public java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledThreadPoolExecutor.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.
     *      util.concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_scheduleWithFixedDelay_Runnable_long_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable, Object) public
     * <T> java.util.concurrent.Future<T> java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable,T)}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable, Object) public
     * java.util.concurrent.Future
     * java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable, Object) public java.util.concurrent.Future
     *      java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_submit_Runnable_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable) public
     * java.util.concurrent.Future<?> java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable) public
     * java.util.concurrent.Future java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#submit(Runnable) public java.util.concurrent.Future
     *      java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.lang.Runnable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_submit_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(java.util.concurrent.Callable)
     * public <T> java.util.concurrent.Future
     * <T> java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.util.concurrent.Callable<T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#submit(java.util.concurrent.Callable)
     * public java.util.concurrent.Future
     * java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.util.concurrent.Callable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#submit(java.util.concurrent.Callable) public
     *      java.util.concurrent.Future
     *      java.util.concurrent.ScheduledThreadPoolExecutor.submit(java.util.concurrent.Callable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_submit_Callable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#shutdownNow() public java.util.List
     * <java.lang.Runnable> java.util.concurrent.ScheduledThreadPoolExecutor.shutdownNow()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#shutdownNow() public java.util.List
     * java.util.concurrent.ScheduledThreadPoolExecutor.shutdownNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#shutdownNow() public java.util.List
     *      java.util.concurrent.ScheduledThreadPoolExecutor.shutdownNow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_shutdownNow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)
     * public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)
     * public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)
     *      public void
     *      java.util.concurrent.ScheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setExecuteExistingDelayedTasksAfterShutdownPolicy_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean)
     * public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean)
     * public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean)
     *      public void
     *      java.util.concurrent.ScheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(
     *      boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContinueExistingPeriodicTasksAfterShutdownPolicy_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#shutdown() public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.shutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#shutdown() public void
     * java.util.concurrent.ScheduledThreadPoolExecutor.shutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#shutdown() public void
     *      java.util.concurrent.ScheduledThreadPoolExecutor.shutdown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_shutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#getRemoveOnCancelPolicy() public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getRemoveOnCancelPolicy()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#getRemoveOnCancelPolicy() public boolean
     * java.util.concurrent.ScheduledThreadPoolExecutor.getRemoveOnCancelPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#getRemoveOnCancelPolicy() public boolean
     *      java.util.concurrent.ScheduledThreadPoolExecutor.getRemoveOnCancelPolicy() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemoveOnCancelPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#setRemoveOnCancelPolicy(boolean) public
     * void java.util.concurrent.ScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#setRemoveOnCancelPolicy(boolean) public
     * void java.util.concurrent.ScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#setRemoveOnCancelPolicy(boolean) public void
     *      java.util.concurrent.ScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRemoveOnCancelPolicy_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#schedule(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)
     * public <V> java.util.concurrent.ScheduledFuture
     * <V> java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.util.concurrent.Callable
     * <V>,long,java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#schedule(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.util.concurrent.Callable,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#schedule(java.util.concurrent.Callable, long,
     *      java.util.concurrent.TimeUnit) public java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.util.concurrent.Callable,long,java.util.
     *      concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#schedule(Runnable, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture<?>
     * java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor#schedule(Runnable, long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.ScheduledFuture
     * java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#schedule(Runnable, long, java.util.concurrent.TimeUnit)
     *      public java.util.concurrent.ScheduledFuture
     *      java.util.concurrent.ScheduledThreadPoolExecutor.schedule(java.lang.Runnable,long,java.util.concurrent.
     *      TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#getQueue() public
     * java.util.concurrent.BlockingQueue
     * <java.lang.Runnable> java.util.concurrent.ScheduledThreadPoolExecutor.getQueue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledThreadPoolExecutor#getQueue() public
     * java.util.concurrent.BlockingQueue java.util.concurrent.ScheduledThreadPoolExecutor.getQueue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ScheduledThreadPoolExecutor#getQueue() public java.util.concurrent.BlockingQueue
     *      java.util.concurrent.ScheduledThreadPoolExecutor.getQueue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getQueue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ThreadPoolExecutor#isTerminated() class
     * java.util.concurrent.ThreadPoolExecutor}</li>
     * <li>{@linkplain java.util.concurrent.ExecutorService#isTerminated() interface
     * java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isTerminated()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection) class
     * java.util.concurrent.AbstractExecutorService}</li>
     * <li>{@linkplain java.util.concurrent.ExecutorService#invokeAll(java.util.Collection) interface
     * java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * class java.util.concurrent.AbstractExecutorService}</li>
     * <li>
     * {@linkplain java.util.concurrent.ExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * interface java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAll_Collection_long_TimeUnit()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ThreadPoolExecutor#isShutdown() class
     * java.util.concurrent.ThreadPoolExecutor}</li>
     * <li>{@linkplain java.util.concurrent.ExecutorService#isShutdown() interface java.util.concurrent.ExecutorService}
     * </li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isShutdown()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * class java.util.concurrent.AbstractExecutorService}</li>
     * <li>
     * {@linkplain java.util.concurrent.ExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * interface java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAny_Collection_long_TimeUnit()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection) class
     * java.util.concurrent.AbstractExecutorService}</li>
     * <li>{@linkplain java.util.concurrent.ExecutorService#invokeAny(java.util.Collection) interface
     * java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAny_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.concurrent.ThreadPoolExecutor#awaitTermination(long, java.util.concurrent.TimeUnit)
     * class java.util.concurrent.ThreadPoolExecutor}</li>
     * <li>{@linkplain java.util.concurrent.ExecutorService#awaitTermination(long, java.util.concurrent.TimeUnit)
     * interface java.util.concurrent.ExecutorService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_awaitTermination_long_TimeUnit()
    throws Exception {
    }

}
