package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.AbstractExecutorService class
 * java.util.concurrent.AbstractExecutorService}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AbstractExecutorServiceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.AbstractExecutorService class java.util.concurrent.AbstractExecutorService (the hereby
 *      targeted class-under-test class)
 * @see AbstractExecutorServiceClassTests AbstractExecutorServiceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractExecutorServiceTests<SUT extends java.util.concurrent.AbstractExecutorService>
extends ExecutorServiceTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(Runnable, Object) public
     * <T> java.util.concurrent.Future<T> java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable,T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(Runnable, Object) public
     * java.util.concurrent.Future
     * java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#submit(Runnable, Object) public java.util.concurrent.Future
     *      java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable,java.lang.Object) (the hereby
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
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(Runnable) public
     * java.util.concurrent.Future<?> java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(Runnable) public
     * java.util.concurrent.Future java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#submit(Runnable) public java.util.concurrent.Future
     *      java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(java.util.concurrent.Callable) public
     * <T> java.util.concurrent.Future
     * <T> java.util.concurrent.AbstractExecutorService.submit(java.util.concurrent.Callable<T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(java.util.concurrent.Callable) public
     * java.util.concurrent.Future java.util.concurrent.AbstractExecutorService.submit(java.util.concurrent.Callable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#submit(java.util.concurrent.Callable) public
     *      java.util.concurrent.Future
     *      java.util.concurrent.AbstractExecutorService.submit(java.util.concurrent.Callable) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection) public
     * <T> java.util.List<java.util.concurrent.Future<T>>
     * java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection<? extends
     * java.util.concurrent.Callable<T>>) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection) public
     * java.util.List java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection) public java.util.List
     *      java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public <T> java.util.List<java.util.concurrent.Future<T>>
     * java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection<? extends
     * java.util.concurrent.Callable<T>>,long,java.util.concurrent.TimeUnit) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public java.util.List
     * java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection, long,
     *      java.util.concurrent.TimeUnit) public java.util.List
     *      java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection,long,java.util.concurrent.
     *      TimeUnit) throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public <T> T java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection<? extends
     * java.util.concurrent.Callable<T>>,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit)
     * public java.lang.Object
     * java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection, long,
     *      java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection,long,java.util.concurrent.
     *      TimeUnit) throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection) public <T> T
     * java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection<? extends
     * java.util.concurrent.Callable<T>>) throws java.lang.InterruptedException,java.util.concurrent.ExecutionException}
     * .
     *
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection) public
     * java.lang.Object java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection) public java.lang.Object
     *      java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection) throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invokeAny_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
