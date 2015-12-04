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
 * Test class for {@link java.util.concurrent.ScheduledExecutorService interface java.util.concurrent.ScheduledExecutorService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ScheduledExecutorServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ScheduledExecutorServiceTests<SUT extends java.util.concurrent.ScheduledExecutorService>
extends org.j8unit.repository.java.util.concurrent.ExecutorServiceTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledExecutorService#scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture java.util.concurrent.ScheduledExecutorService.scheduleAtFixedRate(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scheduleAtFixedRate_Runnable_long_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledExecutorService#schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture java.util.concurrent.ScheduledExecutorService.schedule(java.lang.Runnable,long,java.util.concurrent.TimeUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_schedule_Runnable_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledExecutorService#schedule(java.util.concurrent.Callable,long,java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture java.util.concurrent.ScheduledExecutorService.schedule(java.util.concurrent.Callable,long,java.util.concurrent.TimeUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_schedule_Callable_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ScheduledExecutorService#scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit) public abstract java.util.concurrent.ScheduledFuture java.util.concurrent.ScheduledExecutorService.scheduleWithFixedDelay(java.lang.Runnable,long,long,java.util.concurrent.TimeUnit)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scheduleWithFixedDelay_Runnable_long_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
