package org.j8unit.repository.java.util.concurrent;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ExecutorCompletionService class java.util.concurrent.ExecutorCompletionService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ExecutorCompletionServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExecutorCompletionServiceTests<SUT extends java.util.concurrent.ExecutorCompletionService<V>, V>
extends org.j8unit.repository.java.util.concurrent.CompletionServiceTests<SUT,V>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll(long,java.util.concurrent.TimeUnit) public java.util.concurrent.Future java.util.concurrent.ExecutorCompletionService.poll(long,java.util.concurrent.TimeUnit) throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_poll_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#poll() public java.util.concurrent.Future java.util.concurrent.ExecutorCompletionService.poll()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_poll() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(java.util.concurrent.Callable) public java.util.concurrent.Future java.util.concurrent.ExecutorCompletionService.submit(java.util.concurrent.Callable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_submit_Callable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#submit(java.lang.Runnable,java.lang.Object) public java.util.concurrent.Future java.util.concurrent.ExecutorCompletionService.submit(java.lang.Runnable,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_submit_Runnable_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ExecutorCompletionService#take() public java.util.concurrent.Future java.util.concurrent.ExecutorCompletionService.take() throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_take() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
