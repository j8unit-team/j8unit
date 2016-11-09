package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompletableFuture} (by simply reusing the
 * J8Unit test interface {@link CompletableFutureClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CompletableFutureClassTest
implements CompletableFutureClassTests<CompletableFuture> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletableFuture]

    @Override
    public Class<CompletableFuture> createNewSUT() {
        return CompletableFuture.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CompletableFuture#CompletableFuture() public
     * java.util.concurrent.CompletableFuture()}.
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
    public void create_CompletableFuture()
    throws Exception {
        // create new instance
        final CompletableFuture sut = new CompletableFuture();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier, java.util.concurrent.Executor)
     * public static <U> java.util.concurrent.CompletableFuture<U>
     * java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)}.
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
    public void test_supplyAsync_Supplier_Executor()
    throws Exception {
        // write some test for {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier,
        // java.util.concurrent.Executor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier) public static <U>
     * java.util.concurrent.CompletableFuture<U>
     * java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)}.
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
    public void test_supplyAsync_Supplier()
    throws Exception {
        // write some test for {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#anyOf(java.util.concurrent.CompletableFuture...) public static
     * java.util.concurrent.CompletableFuture<java.lang.Object>
     * java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<?>...)}.
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
    public void test_anyOf_CompletableFutureArray()
    throws Exception {
        // write some test for {@link
        // java.util.concurrent.CompletableFuture#anyOf(java.util.concurrent.CompletableFuture...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#runAsync(Runnable, java.util.concurrent.Executor) public static
     * java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
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
    public void test_runAsync_Runnable_Executor()
    throws Exception {
        // write some test for {@link java.util.concurrent.CompletableFuture#runAsync(Runnable,
        // java.util.concurrent.Executor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#runAsync(Runnable) public static
     * java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)}.
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
    public void test_runAsync_Runnable()
    throws Exception {
        // write some test for {@link java.util.concurrent.CompletableFuture#runAsync(Runnable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#completedFuture(Object) public static <U>
     * java.util.concurrent.CompletableFuture<U> java.util.concurrent.CompletableFuture.completedFuture(U)}.
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
    public void test_completedFuture_Object()
    throws Exception {
        // write some test for {@link java.util.concurrent.CompletableFuture#completedFuture(Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.CompletableFuture#allOf(java.util.concurrent.CompletableFuture...) public static
     * java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<?>...)}.
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
    public void test_allOf_CompletableFutureArray()
    throws Exception {
        // write some test for {@link
        // java.util.concurrent.CompletableFuture#allOf(java.util.concurrent.CompletableFuture...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CompletableFuture]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletableFuture]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AsynchronousCompletionTask} (by
     * simply reusing the J8Unit test interface {@link AsynchronousCompletionTaskClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AsynchronousCompletionTaskClassTest
    implements AsynchronousCompletionTaskClassTests<AsynchronousCompletionTask> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

        @Override
        public Class<AsynchronousCompletionTask> createNewSUT() {
            return AsynchronousCompletionTask.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

    }

}
