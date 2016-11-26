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

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ThreadPoolExecutor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ThreadPoolExecutorClassTest
implements ThreadPoolExecutorClassTests<ThreadPoolExecutor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor]

    @Override
    public Class<ThreadPoolExecutor> createNewSUT() {
        return ThreadPoolExecutor.class;
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

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DiscardPolicy} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardPolicyClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DiscardPolicyClassTest
    implements DiscardPolicyClassTests<DiscardPolicy> {

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
            @SuppressWarnings("unused")
            final DiscardPolicy sut = new DiscardPolicy();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AbortPolicy} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.AbortPolicyClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class AbortPolicyClassTest
    implements AbortPolicyClassTests<AbortPolicy> {

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
            @SuppressWarnings("unused")
            final AbortPolicy sut = new AbortPolicy();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CallerRunsPolicy} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CallerRunsPolicyClassTest
    implements CallerRunsPolicyClassTests<CallerRunsPolicy> {

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
            @SuppressWarnings("unused")
            final CallerRunsPolicy sut = new CallerRunsPolicy();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DiscardOldestPolicy} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DiscardOldestPolicyClassTest
    implements DiscardOldestPolicyClassTests<DiscardOldestPolicy> {

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
            @SuppressWarnings("unused")
            final DiscardOldestPolicy sut = new DiscardOldestPolicy();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

    }

}
