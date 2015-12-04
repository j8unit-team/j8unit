package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ThreadPoolExecutor class java.util.concurrent.ThreadPoolExecutor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ThreadPoolExecutorTests<SUT extends java.util.concurrent.ThreadPoolExecutor>
extends org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$AbortPolicy class
     * java.util.concurrent.ThreadPoolExecutor$AbortPolicy}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.AbortPolicyClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AbortPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.AbortPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.AbortPolicy#rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy class
     * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CallerRunsPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardOldestPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$DiscardPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardPolicyClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardPolicyTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)
         * public void
         * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy.rejectedExecution(java.lang.Runnable,java.util.concurrent.ThreadPoolExecutor)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_rejectedExecution_Runnable_ThreadPoolExecutor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowCoreThreadTimeOut(boolean) public void
     * java.util.concurrent.ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#allowsCoreThreadTimeOut() public boolean
     * java.util.concurrent.ThreadPoolExecutor.allowsCoreThreadTimeOut()}.
     * </p>
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
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#awaitTermination(long,java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.ThreadPoolExecutor.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_awaitTermination_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#execute(java.lang.Runnable) public void
     * java.util.concurrent.ThreadPoolExecutor.execute(java.lang.Runnable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCompletedTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getCompletedTaskCount()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getCorePoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getCorePoolSize()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getKeepAliveTime(java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.ThreadPoolExecutor.getKeepAliveTime(java.util.concurrent.TimeUnit)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getLargestPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getLargestPoolSize()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getMaximumPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getMaximumPoolSize()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getPoolSize() public int
     * java.util.concurrent.ThreadPoolExecutor.getPoolSize()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getQueue() public
     * java.util.concurrent.BlockingQueue java.util.concurrent.ThreadPoolExecutor.getQueue()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getRejectedExecutionHandler() public
     * java.util.concurrent.RejectedExecutionHandler
     * java.util.concurrent.ThreadPoolExecutor.getRejectedExecutionHandler()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getTaskCount() public long
     * java.util.concurrent.ThreadPoolExecutor.getTaskCount()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#getThreadFactory() public
     * java.util.concurrent.ThreadFactory java.util.concurrent.ThreadPoolExecutor.getThreadFactory()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isShutdown() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isShutdown()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isShutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminated() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminated()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isTerminated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#isTerminating() public boolean
     * java.util.concurrent.ThreadPoolExecutor.isTerminating()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartAllCoreThreads() public int
     * java.util.concurrent.ThreadPoolExecutor.prestartAllCoreThreads()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#prestartCoreThread() public boolean
     * java.util.concurrent.ThreadPoolExecutor.prestartCoreThread()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#purge() public void
     * java.util.concurrent.ThreadPoolExecutor.purge()}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#remove(java.lang.Runnable) public boolean
     * java.util.concurrent.ThreadPoolExecutor.remove(java.lang.Runnable)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setCorePoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setCorePoolSize(int)}.
     * </p>
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
     * {@link java.util.concurrent.ThreadPoolExecutor#setKeepAliveTime(long,java.util.concurrent.TimeUnit) public void
     * java.util.concurrent.ThreadPoolExecutor.setKeepAliveTime(long,java.util.concurrent.TimeUnit)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#setMaximumPoolSize(int) public void
     * java.util.concurrent.ThreadPoolExecutor.setMaximumPoolSize(int)}.
     * </p>
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
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)
     * public void
     * java.util.concurrent.ThreadPoolExecutor.setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)}
     * .
     * </p>
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
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#setThreadFactory(java.util.concurrent.ThreadFactory) public void
     * java.util.concurrent.ThreadPoolExecutor.setThreadFactory(java.util.concurrent.ThreadFactory)}.
     * </p>
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
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdown() public void
     * java.util.concurrent.ThreadPoolExecutor.shutdown()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_shutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#shutdownNow() public java.util.List
     * java.util.concurrent.ThreadPoolExecutor.shutdownNow()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_shutdownNow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ThreadPoolExecutor#toString() public java.lang.String
     * java.util.concurrent.ThreadPoolExecutor.toString()}.
     * </p>
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

}
