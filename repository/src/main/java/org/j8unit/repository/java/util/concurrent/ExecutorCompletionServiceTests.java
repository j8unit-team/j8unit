package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ExecutorCompletionService class
 * java.util.concurrent.ExecutorCompletionService}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ExecutorCompletionServiceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ExecutorCompletionService class java.util.concurrent.ExecutorCompletionService (the hereby
 *      targeted class-under-test class)
 * @see ExecutorCompletionServiceClassTests ExecutorCompletionServiceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutorCompletionServiceTests<SUT extends java.util.concurrent.ExecutorCompletionService<V>, V>
extends CompletionServiceTests<SUT, V>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll(long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.Future
     * <V> java.util.concurrent.ExecutorCompletionService.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll(long, java.util.concurrent.TimeUnit)
     * public java.util.concurrent.Future
     * java.util.concurrent.ExecutorCompletionService.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorCompletionService#poll(long, java.util.concurrent.TimeUnit) public
     *      java.util.concurrent.Future
     *      java.util.concurrent.ExecutorCompletionService.poll(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_poll_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll() public java.util.concurrent.Future
     * <V> java.util.concurrent.ExecutorCompletionService.poll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll() public java.util.concurrent.Future
     * java.util.concurrent.ExecutorCompletionService.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorCompletionService#poll() public java.util.concurrent.Future
     *      java.util.concurrent.ExecutorCompletionService.poll() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_poll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(java.util.concurrent.Callable)
     * public java.util.concurrent.Future
     * <V> java.util.concurrent.ExecutorCompletionService.submit(java.util.concurrent.Callable<V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(java.util.concurrent.Callable)
     * public java.util.concurrent.Future
     * java.util.concurrent.ExecutorCompletionService.submit(java.util.concurrent.Callable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorCompletionService#submit(java.util.concurrent.Callable) public
     *      java.util.concurrent.Future
     *      java.util.concurrent.ExecutorCompletionService.submit(java.util.concurrent.Callable) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(Runnable, Object) public
     * java.util.concurrent.Future<V> java.util.concurrent.ExecutorCompletionService.submit(java.lang.Runnable,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(Runnable, Object) public
     * java.util.concurrent.Future
     * java.util.concurrent.ExecutorCompletionService.submit(java.lang.Runnable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorCompletionService#submit(Runnable, Object) public java.util.concurrent.Future
     *      java.util.concurrent.ExecutorCompletionService.submit(java.lang.Runnable,java.lang.Object) (the hereby
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
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#take() public java.util.concurrent.Future
     * <V> java.util.concurrent.ExecutorCompletionService.take() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#take() public java.util.concurrent.Future
     * java.util.concurrent.ExecutorCompletionService.take() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ExecutorCompletionService#take() public java.util.concurrent.Future
     *      java.util.concurrent.ExecutorCompletionService.take() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_take()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
