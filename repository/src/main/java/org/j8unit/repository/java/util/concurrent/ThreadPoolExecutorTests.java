package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ThreadPoolExecutor class
 * java.util.concurrent.ThreadPoolExecutor}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ThreadPoolExecutorClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ThreadPoolExecutor class java.util.concurrent.ThreadPoolExecutor (the hereby targeted
 *      class-under-test class)
 * @see ThreadPoolExecutorClassTests ThreadPoolExecutorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadPoolExecutorTests<SUT extends java.util.concurrent.ThreadPoolExecutor>
extends AbstractExecutorServiceTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setMaximumPoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setMaximumPoolSize(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setMaximumPoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setMaximumPoolSize(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#setMaximumPoolSize(int) public void
     *      java.util.concurrent.ThreadPoolExecutor.setMaximumPoolSize(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMaximumPoolSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminated() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminated()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminated() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#isTerminated() public boolean
     *      java.util.concurrent.ThreadPoolExecutor.isTerminated() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getPoolSize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getPoolSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getPoolSize() public int
     *      java.util.concurrent.ThreadPoolExecutor.getPoolSize() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setThreadFactory(java.util.concurrent.ThreadFactory) public void
     * java.util.concurrent.ThreadPoolExecutor.setThreadFactory(java.util.concurrent.ThreadFactory)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setThreadFactory(java.util.concurrent.ThreadFactory) public void
     * java.util.concurrent.ThreadPoolExecutor.setThreadFactory(java.util.concurrent.ThreadFactory)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#setThreadFactory(java.util.concurrent.ThreadFactory) public void
     *      java.util.concurrent.ThreadPoolExecutor.setThreadFactory(java.util.concurrent.ThreadFactory) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setThreadFactory_ThreadFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminating() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminating()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminating() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminating()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#isTerminating() public boolean
     *      java.util.concurrent.ThreadPoolExecutor.isTerminating() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#remove(Runnable) public boolean
     * java.util.concurrent.ThreadPoolExecutor.remove(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#remove(Runnable) public boolean
     * java.util.concurrent.ThreadPoolExecutor.remove(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#remove(Runnable) public boolean
     *      java.util.concurrent.ThreadPoolExecutor.remove(java.lang.Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getKeepAliveTime(java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.ThreadPoolExecutor.getKeepAliveTime(java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getKeepAliveTime(java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.ThreadPoolExecutor.getKeepAliveTime(java.util.concurrent.TimeUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getKeepAliveTime(java.util.concurrent.TimeUnit) public long
     *      java.util.concurrent.ThreadPoolExecutor.getKeepAliveTime(java.util.concurrent.TimeUnit) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeepAliveTime_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#purge() public void
     * java.util.concurrent.ThreadPoolExecutor.purge()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#purge() public void
     * java.util.concurrent.ThreadPoolExecutor.purge()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#purge() public void java.util.concurrent.ThreadPoolExecutor.purge()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_purge()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCorePoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getCorePoolSize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCorePoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getCorePoolSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getCorePoolSize() public int
     *      java.util.concurrent.ThreadPoolExecutor.getCorePoolSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCorePoolSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getRejectedExecutionHandler() public
     * java.util.concurrent.RejectedExecutionHandler
     * java.util.concurrent.ThreadPoolExecutor.getRejectedExecutionHandler()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getRejectedExecutionHandler() public
     * java.util.concurrent.RejectedExecutionHandler
     * java.util.concurrent.ThreadPoolExecutor.getRejectedExecutionHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getRejectedExecutionHandler() public
     *      java.util.concurrent.RejectedExecutionHandler
     *      java.util.concurrent.ThreadPoolExecutor.getRejectedExecutionHandler() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRejectedExecutionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getQueue() public
     * java.util.concurrent.BlockingQueue<java.lang.Runnable> java.util.concurrent.ThreadPoolExecutor.getQueue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getQueue() public
     * java.util.concurrent.BlockingQueue java.util.concurrent.ThreadPoolExecutor.getQueue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getQueue() public java.util.concurrent.BlockingQueue
     *      java.util.concurrent.ThreadPoolExecutor.getQueue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCompletedTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getCompletedTaskCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCompletedTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getCompletedTaskCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getCompletedTaskCount() public long
     *      java.util.concurrent.ThreadPoolExecutor.getCompletedTaskCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCompletedTaskCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#awaitTermination(long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.ThreadPoolExecutor.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#awaitTermination(long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.ThreadPoolExecutor.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#awaitTermination(long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.ThreadPoolExecutor.awaitTermination(long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowsCoreThreadTimeOut() public boolean
     * java.util.concurrent.ThreadPoolExecutor.allowsCoreThreadTimeOut()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowsCoreThreadTimeOut() public boolean
     * java.util.concurrent.ThreadPoolExecutor.allowsCoreThreadTimeOut()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#allowsCoreThreadTimeOut() public boolean
     *      java.util.concurrent.ThreadPoolExecutor.allowsCoreThreadTimeOut() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allowsCoreThreadTimeOut()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdownNow() public java.util.List
     * <java.lang.Runnable> java.util.concurrent.ThreadPoolExecutor.shutdownNow()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdownNow() public java.util.List
     * java.util.concurrent.ThreadPoolExecutor.shutdownNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#shutdownNow() public java.util.List
     *      java.util.concurrent.ThreadPoolExecutor.shutdownNow() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#execute(Runnable) public void
     * java.util.concurrent.ThreadPoolExecutor.execute(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#execute(Runnable) public void
     * java.util.concurrent.ThreadPoolExecutor.execute(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#execute(Runnable) public void
     *      java.util.concurrent.ThreadPoolExecutor.execute(java.lang.Runnable) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getActiveCount() public int
     * java.util.concurrent.ThreadPoolExecutor.getActiveCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getActiveCount() public int
     * java.util.concurrent.ThreadPoolExecutor.getActiveCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getActiveCount() public int
     *      java.util.concurrent.ThreadPoolExecutor.getActiveCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActiveCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getMaximumPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getMaximumPoolSize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getMaximumPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getMaximumPoolSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getMaximumPoolSize() public int
     *      java.util.concurrent.ThreadPoolExecutor.getMaximumPoolSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaximumPoolSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getThreadFactory() public
     * java.util.concurrent.ThreadFactory java.util.concurrent.ThreadPoolExecutor.getThreadFactory()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getThreadFactory() public
     * java.util.concurrent.ThreadFactory java.util.concurrent.ThreadPoolExecutor.getThreadFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getThreadFactory() public java.util.concurrent.ThreadFactory
     *      java.util.concurrent.ThreadPoolExecutor.getThreadFactory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getThreadFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartCoreThread() public boolean
     * java.util.concurrent.ThreadPoolExecutor.prestartCoreThread()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartCoreThread() public boolean
     * java.util.concurrent.ThreadPoolExecutor.prestartCoreThread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#prestartCoreThread() public boolean
     *      java.util.concurrent.ThreadPoolExecutor.prestartCoreThread() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prestartCoreThread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartAllCoreThreads() public int
     * java.util.concurrent.ThreadPoolExecutor.prestartAllCoreThreads()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartAllCoreThreads() public int
     * java.util.concurrent.ThreadPoolExecutor.prestartAllCoreThreads()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#prestartAllCoreThreads() public int
     *      java.util.concurrent.ThreadPoolExecutor.prestartAllCoreThreads() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prestartAllCoreThreads()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowCoreThreadTimeOut(boolean) public void
     * java.util.concurrent.ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowCoreThreadTimeOut(boolean) public void
     * java.util.concurrent.ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#allowCoreThreadTimeOut(boolean) public void
     *      java.util.concurrent.ThreadPoolExecutor.allowCoreThreadTimeOut(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allowCoreThreadTimeOut_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)
     * public void
     * java.util.concurrent.ThreadPoolExecutor.setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)
     * public void
     * java.util.concurrent.ThreadPoolExecutor.setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)
     *      public void java.util.concurrent.ThreadPoolExecutor.setRejectedExecutionHandler(java.util.concurrent.
     *      RejectedExecutionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRejectedExecutionHandler_RejectedExecutionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getTaskCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getTaskCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getTaskCount() public long
     *      java.util.concurrent.ThreadPoolExecutor.getTaskCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTaskCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setCorePoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setCorePoolSize(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setCorePoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setCorePoolSize(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#setCorePoolSize(int) public void
     *      java.util.concurrent.ThreadPoolExecutor.setCorePoolSize(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCorePoolSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setKeepAliveTime(long, java.util.concurrent.TimeUnit) public void
     * java.util.concurrent.ThreadPoolExecutor.setKeepAliveTime(long,java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setKeepAliveTime(long, java.util.concurrent.TimeUnit) public void
     * java.util.concurrent.ThreadPoolExecutor.setKeepAliveTime(long,java.util.concurrent.TimeUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#setKeepAliveTime(long, java.util.concurrent.TimeUnit) public void
     *      java.util.concurrent.ThreadPoolExecutor.setKeepAliveTime(long,java.util.concurrent.TimeUnit) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeepAliveTime_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isShutdown() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isShutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isShutdown() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isShutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#isShutdown() public boolean
     *      java.util.concurrent.ThreadPoolExecutor.isShutdown() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdown() public void
     * java.util.concurrent.ThreadPoolExecutor.shutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdown() public void
     * java.util.concurrent.ThreadPoolExecutor.shutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#shutdown() public void
     *      java.util.concurrent.ThreadPoolExecutor.shutdown() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getLargestPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getLargestPoolSize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getLargestPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getLargestPoolSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#getLargestPoolSize() public int
     *      java.util.concurrent.ThreadPoolExecutor.getLargestPoolSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLargestPoolSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#toString() public java.lang.String
     * java.util.concurrent.ThreadPoolExecutor.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#toString() public java.lang.String
     * java.util.concurrent.ThreadPoolExecutor.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor#toString() public java.lang.String
     *      java.util.concurrent.ThreadPoolExecutor.toString() (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy class
     * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy class
     *      java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy (the hereby targeted class-under-test class)
     * @see ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests
     *      ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CallerRunsPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy>
    extends RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#rejectedExecution(Runnable,
         *      java.util.concurrent.ThreadPoolExecutor) public void
         *      java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy.rejectedExecution(java.lang.Runnable,java.util.
         *      concurrent.ThreadPoolExecutor) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ThreadPoolExecutor.DiscardPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link ThreadPoolExecutorClassTests.DiscardPolicyClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor.DiscardPolicy class
     *      java.util.concurrent.ThreadPoolExecutor$DiscardPolicy (the hereby targeted class-under-test class)
     * @see ThreadPoolExecutorClassTests.DiscardPolicyClassTests ThreadPoolExecutorClassTests.DiscardPolicyClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardPolicy>
    extends RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#rejectedExecution(Runnable,
         *      java.util.concurrent.ThreadPoolExecutor) public void
         *      java.util.concurrent.ThreadPoolExecutor$DiscardPolicy.rejectedExecution(java.lang.Runnable,java.util.
         *      concurrent.ThreadPoolExecutor) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy class
     *      java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy (the hereby targeted class-under-test class)
     * @see ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests
     *      ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardOldestPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy>
    extends RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#rejectedExecution(Runnable,
         *      java.util.concurrent.ThreadPoolExecutor) public void
         *      java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy.rejectedExecution(java.lang.Runnable,java.
         *      util.concurrent.ThreadPoolExecutor) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.ThreadPoolExecutor.AbortPolicy class
     * java.util.concurrent.ThreadPoolExecutor$AbortPolicy}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link ThreadPoolExecutorClassTests.AbortPolicyClassTests}.
     * </p>
     *
     * @see java.util.concurrent.ThreadPoolExecutor.AbortPolicy class
     *      java.util.concurrent.ThreadPoolExecutor$AbortPolicy (the hereby targeted class-under-test class)
     * @see ThreadPoolExecutorClassTests.AbortPolicyClassTests ThreadPoolExecutorClassTests.AbortPolicyClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbortPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.AbortPolicy>
    extends RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.AbortPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.AbortPolicy#rejectedExecution(Runnable, java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.util.concurrent.ThreadPoolExecutor.AbortPolicy#rejectedExecution(Runnable,
         *      java.util.concurrent.ThreadPoolExecutor) public void
         *      java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(java.lang.Runnable,java.util.
         *      concurrent.ThreadPoolExecutor) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
