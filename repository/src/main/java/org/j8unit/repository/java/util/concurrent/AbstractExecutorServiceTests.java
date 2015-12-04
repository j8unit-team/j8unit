package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.AbstractExecutorService class
 * java.util.concurrent.AbstractExecutorService}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractExecutorServiceTests<SUT extends java.util.concurrent.AbstractExecutorService>
extends org.j8unit.repository.java.util.concurrent.ExecutorServiceTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(java.lang.Runnable) public
     * java.util.concurrent.Future java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_submit_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(java.util.concurrent.Callable) public
     * java.util.concurrent.Future java.util.concurrent.AbstractExecutorService.submit(java.util.concurrent.Callable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_submit_Callable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#submit(java.lang.Runnable,java.lang.Object)
     * public java.util.concurrent.Future
     * java.util.concurrent.AbstractExecutorService.submit(java.lang.Runnable,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_submit_Runnable_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * public java.util.List
     * java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invokeAll_Collection_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAll(java.util.Collection) public
     * java.util.List java.util.concurrent.AbstractExecutorService.invokeAll(java.util.Collection) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invokeAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * public java.lang.Object
     * java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit)
     * throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invokeAny_Collection_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.AbstractExecutorService#invokeAny(java.util.Collection) public
     * java.lang.Object java.util.concurrent.AbstractExecutorService.invokeAny(java.util.Collection) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invokeAny_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
