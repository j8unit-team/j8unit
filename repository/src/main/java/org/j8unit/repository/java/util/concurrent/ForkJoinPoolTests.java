package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ForkJoinPool class java.util.concurrent.ForkJoinPool}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link ForkJoinPoolClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ForkJoinPool class java.util.concurrent.ForkJoinPool (the hereby targeted class-under-test
 *      class)
 * @see ForkJoinPoolClassTests ForkJoinPoolClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForkJoinPoolTests<SUT extends java.util.concurrent.ForkJoinPool>
extends AbstractExecutorServiceTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isQuiescent() public boolean
     * java.util.concurrent.ForkJoinPool.isQuiescent()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isQuiescent() public boolean
     * java.util.concurrent.ForkJoinPool.isQuiescent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#isQuiescent() public boolean
     *      java.util.concurrent.ForkJoinPool.isQuiescent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isQuiescent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getStealCount() public long
     * java.util.concurrent.ForkJoinPool.getStealCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getStealCount() public long
     * java.util.concurrent.ForkJoinPool.getStealCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getStealCount() public long
     *      java.util.concurrent.ForkJoinPool.getStealCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStealCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getQueuedTaskCount() public long
     * java.util.concurrent.ForkJoinPool.getQueuedTaskCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getQueuedTaskCount() public long
     * java.util.concurrent.ForkJoinPool.getQueuedTaskCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getQueuedTaskCount() public long
     *      java.util.concurrent.ForkJoinPool.getQueuedTaskCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQueuedTaskCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#shutdown() public void
     * java.util.concurrent.ForkJoinPool.shutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#shutdown() public void
     * java.util.concurrent.ForkJoinPool.shutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#shutdown() public void java.util.concurrent.ForkJoinPool.shutdown() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#isShutdown() public boolean
     * java.util.concurrent.ForkJoinPool.isShutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isShutdown() public boolean
     * java.util.concurrent.ForkJoinPool.isShutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#isShutdown() public boolean java.util.concurrent.ForkJoinPool.isShutdown()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isShutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#toString() public java.lang.String
     * java.util.concurrent.ForkJoinPool.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#toString() public java.lang.String
     * java.util.concurrent.ForkJoinPool.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#toString() public java.lang.String
     *      java.util.concurrent.ForkJoinPool.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#invokeAll(java.util.Collection) public
     * <T> java.util.List<java.util.concurrent.Future<T>>
     * java.util.concurrent.ForkJoinPool.invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#invokeAll(java.util.Collection) public java.util.List
     * java.util.concurrent.ForkJoinPool.invokeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#invokeAll(java.util.Collection) public java.util.List
     *      java.util.concurrent.ForkJoinPool.invokeAll(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#awaitQuiescence(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ForkJoinPool.awaitQuiescence(long,java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#awaitQuiescence(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ForkJoinPool.awaitQuiescence(long,java.util.concurrent.TimeUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#awaitQuiescence(long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.ForkJoinPool.awaitQuiescence(long,java.util.concurrent.TimeUnit) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_awaitQuiescence_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getFactory() public
     * java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory java.util.concurrent.ForkJoinPool.getFactory()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getFactory() public
     * java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory java.util.concurrent.ForkJoinPool.getFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getFactory() public
     *      java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory java.util.concurrent.ForkJoinPool.getFactory()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getUncaughtExceptionHandler() public
     * java.lang.Thread$UncaughtExceptionHandler java.util.concurrent.ForkJoinPool.getUncaughtExceptionHandler()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getUncaughtExceptionHandler() public
     * java.lang.Thread$UncaughtExceptionHandler java.util.concurrent.ForkJoinPool.getUncaughtExceptionHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getUncaughtExceptionHandler() public
     *      java.lang.Thread$UncaughtExceptionHandler java.util.concurrent.ForkJoinPool.getUncaughtExceptionHandler()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUncaughtExceptionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#execute(java.util.concurrent.ForkJoinTask) public void
     * java.util.concurrent.ForkJoinPool.execute(java.util.concurrent.ForkJoinTask<?>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#execute(java.util.concurrent.ForkJoinTask) public void
     * java.util.concurrent.ForkJoinPool.execute(java.util.concurrent.ForkJoinTask)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#execute(java.util.concurrent.ForkJoinTask) public void
     *      java.util.concurrent.ForkJoinPool.execute(java.util.concurrent.ForkJoinTask) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_execute_ForkJoinTask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#execute(Runnable) public void
     * java.util.concurrent.ForkJoinPool.execute(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#execute(Runnable) public void
     * java.util.concurrent.ForkJoinPool.execute(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#execute(Runnable) public void
     *      java.util.concurrent.ForkJoinPool.execute(java.lang.Runnable) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#getAsyncMode() public boolean
     * java.util.concurrent.ForkJoinPool.getAsyncMode()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getAsyncMode() public boolean
     * java.util.concurrent.ForkJoinPool.getAsyncMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getAsyncMode() public boolean
     *      java.util.concurrent.ForkJoinPool.getAsyncMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAsyncMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getParallelism() public int
     * java.util.concurrent.ForkJoinPool.getParallelism()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getParallelism() public int
     * java.util.concurrent.ForkJoinPool.getParallelism()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getParallelism() public int
     *      java.util.concurrent.ForkJoinPool.getParallelism() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParallelism()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getQueuedSubmissionCount() public int
     * java.util.concurrent.ForkJoinPool.getQueuedSubmissionCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getQueuedSubmissionCount() public int
     * java.util.concurrent.ForkJoinPool.getQueuedSubmissionCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getQueuedSubmissionCount() public int
     *      java.util.concurrent.ForkJoinPool.getQueuedSubmissionCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getQueuedSubmissionCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#shutdownNow() public java.util.List
     * <java.lang.Runnable> java.util.concurrent.ForkJoinPool.shutdownNow()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#shutdownNow() public java.util.List
     * java.util.concurrent.ForkJoinPool.shutdownNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#shutdownNow() public java.util.List
     *      java.util.concurrent.ForkJoinPool.shutdownNow() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#awaitTermination(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ForkJoinPool.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#awaitTermination(long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ForkJoinPool.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#awaitTermination(long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.ForkJoinPool.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_awaitTermination_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getActiveThreadCount() public int
     * java.util.concurrent.ForkJoinPool.getActiveThreadCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getActiveThreadCount() public int
     * java.util.concurrent.ForkJoinPool.getActiveThreadCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getActiveThreadCount() public int
     *      java.util.concurrent.ForkJoinPool.getActiveThreadCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActiveThreadCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getPoolSize() public int
     * java.util.concurrent.ForkJoinPool.getPoolSize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getPoolSize() public int
     * java.util.concurrent.ForkJoinPool.getPoolSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getPoolSize() public int java.util.concurrent.ForkJoinPool.getPoolSize()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPoolSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(Runnable) public
     * java.util.concurrent.ForkJoinTask<?> java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(Runnable) public
     * java.util.concurrent.ForkJoinTask java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#submit(Runnable) public java.util.concurrent.ForkJoinTask
     *      java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(Runnable, Object) public
     * <T> java.util.concurrent.ForkJoinTask<T> java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable,T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(Runnable, Object) public
     * java.util.concurrent.ForkJoinTask java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#submit(Runnable, Object) public java.util.concurrent.ForkJoinTask
     *      java.util.concurrent.ForkJoinPool.submit(java.lang.Runnable,java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.Callable) public
     * <T> java.util.concurrent.ForkJoinTask<T> java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.Callable
     * <T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.Callable) public
     * java.util.concurrent.ForkJoinTask java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.Callable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.Callable) public
     *      java.util.concurrent.ForkJoinTask java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.Callable)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.ForkJoinTask) public
     * <T> java.util.concurrent.ForkJoinTask
     * <T> java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.ForkJoinTask<T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.ForkJoinTask) public
     * java.util.concurrent.ForkJoinTask java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.ForkJoinTask)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#submit(java.util.concurrent.ForkJoinTask) public
     *      java.util.concurrent.ForkJoinTask
     *      java.util.concurrent.ForkJoinPool.submit(java.util.concurrent.ForkJoinTask) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_submit_ForkJoinTask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#hasQueuedSubmissions() public boolean
     * java.util.concurrent.ForkJoinPool.hasQueuedSubmissions()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#hasQueuedSubmissions() public boolean
     * java.util.concurrent.ForkJoinPool.hasQueuedSubmissions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#hasQueuedSubmissions() public boolean
     *      java.util.concurrent.ForkJoinPool.hasQueuedSubmissions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasQueuedSubmissions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isTerminated() public boolean
     * java.util.concurrent.ForkJoinPool.isTerminated()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isTerminated() public boolean
     * java.util.concurrent.ForkJoinPool.isTerminated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#isTerminated() public boolean
     *      java.util.concurrent.ForkJoinPool.isTerminated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isTerminated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getRunningThreadCount() public int
     * java.util.concurrent.ForkJoinPool.getRunningThreadCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getRunningThreadCount() public int
     * java.util.concurrent.ForkJoinPool.getRunningThreadCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#getRunningThreadCount() public int
     *      java.util.concurrent.ForkJoinPool.getRunningThreadCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRunningThreadCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isTerminating() public boolean
     * java.util.concurrent.ForkJoinPool.isTerminating()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#isTerminating() public boolean
     * java.util.concurrent.ForkJoinPool.isTerminating()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#isTerminating() public boolean
     *      java.util.concurrent.ForkJoinPool.isTerminating() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTerminating()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#invoke(java.util.concurrent.ForkJoinTask) public <T> T
     * java.util.concurrent.ForkJoinPool.invoke(java.util.concurrent.ForkJoinTask<T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#invoke(java.util.concurrent.ForkJoinTask) public
     * java.lang.Object java.util.concurrent.ForkJoinPool.invoke(java.util.concurrent.ForkJoinTask)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool#invoke(java.util.concurrent.ForkJoinTask) public java.lang.Object
     *      java.util.concurrent.ForkJoinPool.invoke(java.util.concurrent.ForkJoinTask) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ForkJoinTask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
     * interface java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link ForkJoinPoolClassTests.ForkJoinWorkerThreadFactoryClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory interface
     *      java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory (the hereby targeted class-under-test class)
     * @see ForkJoinPoolClassTests.ForkJoinWorkerThreadFactoryClassTests
     *      ForkJoinPoolClassTests.ForkJoinWorkerThreadFactoryClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ForkJoinWorkerThreadFactoryTests<SUT extends java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory#newThread(java.util.concurrent.ForkJoinPool)
         * public abstract java.util.concurrent.ForkJoinWorkerThread
         * java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory.newThread(java.util.concurrent.ForkJoinPool)}.
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory#newThread(java.util.concurrent.ForkJoinPool)
         * public abstract java.util.concurrent.ForkJoinWorkerThread
         * java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory.newThread(java.util.concurrent.ForkJoinPool)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory#newThread(java.util.concurrent.ForkJoinPool)
         *      public abstract java.util.concurrent.ForkJoinWorkerThread
         *      java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory.newThread(java.util.concurrent.
         *      ForkJoinPool) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_newThread_ForkJoinPool()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ForkJoinPool.ManagedBlocker interface
     * java.util.concurrent.ForkJoinPool$ManagedBlocker}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link ForkJoinPoolClassTests.ManagedBlockerClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinPool.ManagedBlocker interface java.util.concurrent.ForkJoinPool$ManagedBlocker
     *      (the hereby targeted class-under-test class)
     * @see ForkJoinPoolClassTests.ManagedBlockerClassTests ForkJoinPoolClassTests.ManagedBlockerClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ManagedBlockerTests<SUT extends java.util.concurrent.ForkJoinPool.ManagedBlocker>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ForkJoinPool.ManagedBlocker#block() public abstract boolean
         * java.util.concurrent.ForkJoinPool$ManagedBlocker.block() throws java.lang.InterruptedException}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ForkJoinPool.ManagedBlocker#block() public abstract boolean
         * java.util.concurrent.ForkJoinPool$ManagedBlocker.block() throws java.lang.InterruptedException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ForkJoinPool.ManagedBlocker#block() public abstract boolean
         *      java.util.concurrent.ForkJoinPool$ManagedBlocker.block() throws java.lang.InterruptedException (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_block()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.concurrent.ForkJoinPool.ManagedBlocker#isReleasable() public abstract
         * boolean java.util.concurrent.ForkJoinPool$ManagedBlocker.isReleasable()}.
         *
         * <p>
         * Test method for {@link java.util.concurrent.ForkJoinPool.ManagedBlocker#isReleasable() public abstract
         * boolean java.util.concurrent.ForkJoinPool$ManagedBlocker.isReleasable()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ForkJoinPool.ManagedBlocker#isReleasable() public abstract boolean
         *      java.util.concurrent.ForkJoinPool$ManagedBlocker.isReleasable() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isReleasable()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
