package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ExecutorService interface
 * java.util.concurrent.ExecutorService}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ExecutorServiceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ExecutorService interface java.util.concurrent.ExecutorService (the hereby targeted
 *      class-under-test class)
 * @see ExecutorServiceClassTests ExecutorServiceClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutorServiceTests<SUT extends java.util.concurrent.ExecutorService>
extends ExecutorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#shutdown() public abstract void
     * java.util.concurrent.ExecutorService.shutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#shutdown() public abstract void
     * java.util.concurrent.ExecutorService.shutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#shutdown() public abstract void
     *      java.util.concurrent.ExecutorService.shutdown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#isShutdown() public abstract boolean
     * java.util.concurrent.ExecutorService.isShutdown()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#isShutdown() public abstract boolean
     * java.util.concurrent.ExecutorService.isShutdown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#isShutdown() public abstract boolean
     *      java.util.concurrent.ExecutorService.isShutdown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#invokeAny(java.util.Collection) public abstract <T> T
     * java.util.concurrent.ExecutorService.invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>>)
     * throws java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#invokeAny(java.util.Collection) public abstract
     * java.lang.Object java.util.concurrent.ExecutorService.invokeAny(java.util.Collection) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#invokeAny(java.util.Collection) public abstract java.lang.Object
     *      java.util.concurrent.ExecutorService.invokeAny(java.util.Collection) throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeAny_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public abstract <T> T java.util.concurrent.ExecutorService.invokeAny(java.util.Collection<? extends
     * java.util.concurrent.Callable<T>>,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public abstract java.lang.Object
     * java.util.concurrent.ExecutorService.invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     *      public abstract java.lang.Object
     *      java.util.concurrent.ExecutorService.invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit)
     *      throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeAny_Collection_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#shutdownNow() public abstract java.util.List
     * <java.lang.Runnable> java.util.concurrent.ExecutorService.shutdownNow()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#shutdownNow() public abstract java.util.List
     * java.util.concurrent.ExecutorService.shutdownNow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#shutdownNow() public abstract java.util.List
     *      java.util.concurrent.ExecutorService.shutdownNow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#awaitTermination(long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.ExecutorService.awaitTermination(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#awaitTermination(long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.ExecutorService.awaitTermination(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#awaitTermination(long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.ExecutorService.awaitTermination(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#invokeAll(java.util.Collection) public abstract
     * <T> java.util.List<java.util.concurrent.Future<T>>
     * java.util.concurrent.ExecutorService.invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>>)
     * throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#invokeAll(java.util.Collection) public abstract
     * java.util.List java.util.concurrent.ExecutorService.invokeAll(java.util.Collection) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#invokeAll(java.util.Collection) public abstract java.util.List
     *      java.util.concurrent.ExecutorService.invokeAll(java.util.Collection) throws java.lang.InterruptedException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.ExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public abstract <T> java.util.List<java.util.concurrent.Future<T>>
     * java.util.concurrent.ExecutorService.invokeAll(java.util.Collection<? extends java.util.concurrent.Callable
     * <T>>,long,java.util.concurrent.TimeUnit) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.ExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public abstract java.util.List
     * java.util.concurrent.ExecutorService.invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     *      public abstract java.util.List
     *      java.util.concurrent.ExecutorService.invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeAll_Collection_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#submit(Runnable, Object) public abstract
     * <T> java.util.concurrent.Future<T> java.util.concurrent.ExecutorService.submit(java.lang.Runnable,T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#submit(Runnable, Object) public abstract
     * java.util.concurrent.Future java.util.concurrent.ExecutorService.submit(java.lang.Runnable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#submit(Runnable, Object) public abstract java.util.concurrent.Future
     *      java.util.concurrent.ExecutorService.submit(java.lang.Runnable,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#submit(Runnable) public abstract
     * java.util.concurrent.Future<?> java.util.concurrent.ExecutorService.submit(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#submit(Runnable) public abstract
     * java.util.concurrent.Future java.util.concurrent.ExecutorService.submit(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#submit(Runnable) public abstract java.util.concurrent.Future
     *      java.util.concurrent.ExecutorService.submit(java.lang.Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#submit(java.util.concurrent.Callable) public abstract
     * <T> java.util.concurrent.Future<T> java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable<T>)}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#submit(java.util.concurrent.Callable) public abstract
     * java.util.concurrent.Future java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#submit(java.util.concurrent.Callable) public abstract
     *      java.util.concurrent.Future java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.ExecutorService#isTerminated() public abstract boolean
     * java.util.concurrent.ExecutorService.isTerminated()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorService#isTerminated() public abstract boolean
     * java.util.concurrent.ExecutorService.isTerminated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorService#isTerminated() public abstract boolean
     *      java.util.concurrent.ExecutorService.isTerminated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTerminated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
