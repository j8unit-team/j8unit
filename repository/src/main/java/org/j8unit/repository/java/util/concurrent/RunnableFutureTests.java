package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.RunnableFuture interface
 * java.util.concurrent.RunnableFuture}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.RunnableFutureTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.RunnableFutureClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.RunnableFuture
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunnableFutureTests<SUT extends java.util.concurrent.RunnableFuture<V>, V>
extends org.j8unit.repository.java.lang.RunnableTests<SUT>, org.j8unit.repository.java.util.concurrent.FutureTests<SUT, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RunnableFuture#run() public abstract void
     * java.util.concurrent.RunnableFuture.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.RunnableFuture#run()
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
