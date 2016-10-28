package org.j8unit.repository.java.util.concurrent;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorsClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorsClassTests<Executors> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Executors]

    @Override
    public Class<Executors> createNewSUT() {
        return Executors.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Executors#unconfigurableScheduledExecutorService(ScheduledExecutorService) public static
     * java.util.concurrent.ScheduledExecutorService
     * java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.ScheduledExecutorService)}
     * .
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
    public void test_unconfigurableScheduledExecutorService_ScheduledExecutorService()
    throws Exception {
        // write some test for {@link Executors#unconfigurableScheduledExecutorService(ScheduledExecutorService)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newWorkStealingPool(int) public static
     * java.util.concurrent.ExecutorService java.util.concurrent.Executors.newWorkStealingPool(int)}.
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
    public void test_newWorkStealingPool_int()
    throws Exception {
        // write some test for {@link Executors#newWorkStealingPool(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newWorkStealingPool() public static
     * java.util.concurrent.ExecutorService java.util.concurrent.Executors.newWorkStealingPool()}.
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
    public void test_newWorkStealingPool()
    throws Exception {
        // write some test for {@link Executors#newWorkStealingPool()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newCachedThreadPool(ThreadFactory) public
     * static java.util.concurrent.ExecutorService
     * java.util.concurrent.Executors.newCachedThreadPool(java.util.concurrent.ThreadFactory)}.
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
    public void test_newCachedThreadPool_ThreadFactory()
    throws Exception {
        // write some test for {@link Executors#newCachedThreadPool(ThreadFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newCachedThreadPool() public static
     * java.util.concurrent.ExecutorService java.util.concurrent.Executors.newCachedThreadPool()}.
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
    public void test_newCachedThreadPool()
    throws Exception {
        // write some test for {@link Executors#newCachedThreadPool()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newSingleThreadExecutor(ThreadFactory)
     * public static java.util.concurrent.ExecutorService
     * java.util.concurrent.Executors.newSingleThreadExecutor(java.util.concurrent.ThreadFactory)}.
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
    public void test_newSingleThreadExecutor_ThreadFactory()
    throws Exception {
        // write some test for {@link Executors#newSingleThreadExecutor(ThreadFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newSingleThreadExecutor() public static
     * java.util.concurrent.ExecutorService java.util.concurrent.Executors.newSingleThreadExecutor()}.
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
    public void test_newSingleThreadExecutor()
    throws Exception {
        // write some test for {@link Executors#newSingleThreadExecutor()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Executors#privilegedCallableUsingCurrentClassLoader(Callable) public static
     * <T> java.util.concurrent.Callable
     * <T> java.util.concurrent.Executors.privilegedCallableUsingCurrentClassLoader(java.util.concurrent.Callable<T>)}.
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
    public void test_privilegedCallableUsingCurrentClassLoader_Callable()
    throws Exception {
        // write some test for {@link Executors#privilegedCallableUsingCurrentClassLoader(Callable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Executors#newSingleThreadScheduledExecutor(ThreadFactory) public static
     * java.util.concurrent.ScheduledExecutorService
     * java.util.concurrent.Executors.newSingleThreadScheduledExecutor(java.util.concurrent.ThreadFactory)}.
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
    public void test_newSingleThreadScheduledExecutor_ThreadFactory()
    throws Exception {
        // write some test for {@link Executors#newSingleThreadScheduledExecutor(ThreadFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newSingleThreadScheduledExecutor() public
     * static java.util.concurrent.ScheduledExecutorService
     * java.util.concurrent.Executors.newSingleThreadScheduledExecutor()}.
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
    public void test_newSingleThreadScheduledExecutor()
    throws Exception {
        // write some test for {@link Executors#newSingleThreadScheduledExecutor()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newScheduledThreadPool(int) public static
     * java.util.concurrent.ScheduledExecutorService java.util.concurrent.Executors.newScheduledThreadPool(int)}.
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
    public void test_newScheduledThreadPool_int()
    throws Exception {
        // write some test for {@link Executors#newScheduledThreadPool(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newScheduledThreadPool(int, ThreadFactory)
     * public static java.util.concurrent.ScheduledExecutorService
     * java.util.concurrent.Executors.newScheduledThreadPool(int,java.util.concurrent.ThreadFactory)}.
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
    public void test_newScheduledThreadPool_int_ThreadFactory()
    throws Exception {
        // write some test for {@link Executors#newScheduledThreadPool(int, ThreadFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newFixedThreadPool(int) public static
     * java.util.concurrent.ExecutorService java.util.concurrent.Executors.newFixedThreadPool(int)}.
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
    public void test_newFixedThreadPool_int()
    throws Exception {
        // write some test for {@link Executors#newFixedThreadPool(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#newFixedThreadPool(int, ThreadFactory)
     * public static java.util.concurrent.ExecutorService
     * java.util.concurrent.Executors.newFixedThreadPool(int,java.util.concurrent.ThreadFactory)}.
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
    public void test_newFixedThreadPool_int_ThreadFactory()
    throws Exception {
        // write some test for {@link Executors#newFixedThreadPool(int, ThreadFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#callable(Runnable, Object) public static
     * <T> java.util.concurrent.Callable<T> java.util.concurrent.Executors.callable(java.lang.Runnable,T)}.
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
    public void test_callable_Runnable_Object()
    throws Exception {
        // write some test for {@link Executors#callable(Runnable, Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#callable(PrivilegedExceptionAction) public
     * static java.util.concurrent.Callable
     * <java.lang.Object> java.util.concurrent.Executors.callable(java.security.PrivilegedExceptionAction<?>)}.
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
    public void test_callable_PrivilegedExceptionAction()
    throws Exception {
        // write some test for {@link Executors#callable(PrivilegedExceptionAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#callable(PrivilegedAction) public static
     * java.util.concurrent.Callable
     * <java.lang.Object> java.util.concurrent.Executors.callable(java.security.PrivilegedAction<?>)}.
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
    public void test_callable_PrivilegedAction()
    throws Exception {
        // write some test for {@link Executors#callable(PrivilegedAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#callable(Runnable) public static
     * java.util.concurrent.Callable<java.lang.Object> java.util.concurrent.Executors.callable(java.lang.Runnable)}.
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
    public void test_callable_Runnable()
    throws Exception {
        // write some test for {@link Executors#callable(Runnable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#privilegedThreadFactory() public static
     * java.util.concurrent.ThreadFactory java.util.concurrent.Executors.privilegedThreadFactory()}.
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
    public void test_privilegedThreadFactory()
    throws Exception {
        // write some test for {@link Executors#privilegedThreadFactory()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#privilegedCallable(Callable) public static
     * <T> java.util.concurrent.Callable
     * <T> java.util.concurrent.Executors.privilegedCallable(java.util.concurrent.Callable<T>)}.
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
    public void test_privilegedCallable_Callable()
    throws Exception {
        // write some test for {@link Executors#privilegedCallable(Callable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Executors#defaultThreadFactory() public static
     * java.util.concurrent.ThreadFactory java.util.concurrent.Executors.defaultThreadFactory()}.
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
    public void test_defaultThreadFactory()
    throws Exception {
        // write some test for {@link Executors#defaultThreadFactory()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Executors#unconfigurableExecutorService(ExecutorService) public static
     * java.util.concurrent.ExecutorService
     * java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.ExecutorService)}.
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
    public void test_unconfigurableExecutorService_ExecutorService()
    throws Exception {
        // write some test for {@link Executors#unconfigurableExecutorService(ExecutorService)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Executors]

}
