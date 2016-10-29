package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPoolExecutorClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests<ThreadPoolExecutor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor]

    @Override
    public Class<ThreadPoolExecutor> createNewSUT() {
        return ThreadPoolExecutor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.RejectedExecutionHandler)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue<java.lang.Runnable>,java.util.concurrent.RejectedExecutionHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_RejectedExecutionHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ThreadPoolExecutor sut = null; // = new ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit,
                                             // java.util.concurrent.BlockingQueue,
                                             // java.util.concurrent.RejectedExecutionHandler);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue<java.lang.Runnable>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ThreadPoolExecutor sut = null; // = new ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit,
                                             // java.util.concurrent.BlockingQueue);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue<java.lang.Runnable>,java.util.concurrent.ThreadFactory)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_ThreadFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ThreadPoolExecutor sut = null; // = new ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit,
                                             // java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.RejectedExecutionHandler)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue<java.lang.Runnable>,java.util.concurrent.ThreadFactory,java.util.concurrent.RejectedExecutionHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_ThreadFactory_RejectedExecutionHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ThreadPoolExecutor sut = null; // = new ThreadPoolExecutor(int, int, long, java.util.concurrent.TimeUnit,
                                             // java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory,
                                             // java.util.concurrent.RejectedExecutionHandler);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor]

    @RunWith(J8Unit4.class)
    public static class DiscardPolicyClassTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardPolicyClassTests<DiscardPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

        @Override
        public Class<DiscardPolicy> createNewSUT() {
            return DiscardPolicy.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#DiscardPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DiscardPolicy()
        throws Exception {
            // create new instance
            final DiscardPolicy sut = new DiscardPolicy();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

    }

    @RunWith(J8Unit4.class)
    public static class AbortPolicyClassTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.AbortPolicyClassTests<AbortPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

        @Override
        public Class<AbortPolicy> createNewSUT() {
            return AbortPolicy.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.concurrent.ThreadPoolExecutor.AbortPolicy#AbortPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$AbortPolicy()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_AbortPolicy()
        throws Exception {
            // create new instance
            final AbortPolicy sut = new AbortPolicy();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

    }

    @RunWith(J8Unit4.class)
    public static class CallerRunsPolicyClassTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests<CallerRunsPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

        @Override
        public Class<CallerRunsPolicy> createNewSUT() {
            return CallerRunsPolicy.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#CallerRunsPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CallerRunsPolicy()
        throws Exception {
            // create new instance
            final CallerRunsPolicy sut = new CallerRunsPolicy();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

    }

    @RunWith(J8Unit4.class)
    public static class DiscardOldestPolicyClassTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests<DiscardOldestPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

        @Override
        public Class<DiscardOldestPolicy> createNewSUT() {
            return DiscardOldestPolicy.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#DiscardOldestPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DiscardOldestPolicy()
        throws Exception {
            // create new instance
            final DiscardOldestPolicy sut = new DiscardOldestPolicy();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

    }

}
