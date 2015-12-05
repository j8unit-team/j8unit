package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.RunnableFuture interface java.util.concurrent.RunnableFuture}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.RunnableFutureClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunnableFutureTests<SUT extends java.util.concurrent.RunnableFuture<V>, V>
extends org.j8unit.repository.java.lang.RunnableTests<SUT>, org.j8unit.repository.java.util.concurrent.FutureTests<SUT, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RunnableFuture#run() public abstract void
     * java.util.concurrent.RunnableFuture.run()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_run()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}