package org.j8unit.repository.java.util.concurrent;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.Executor interface java.util.concurrent.Executor}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ExecutorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutorTests<SUT extends java.util.concurrent.Executor>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Executor#execute(java.lang.Runnable) public abstract void
     * java.util.concurrent.Executor.execute(java.lang.Runnable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_execute_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
