package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.RunnableScheduledFuture interface
 * java.util.concurrent.RunnableScheduledFuture}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RunnableScheduledFutureClassTests}.
 * </p>
 *
 * @see java.util.concurrent.RunnableScheduledFuture interface java.util.concurrent.RunnableScheduledFuture (the hereby
 *      targeted class-under-test class)
 * @see RunnableScheduledFutureClassTests RunnableScheduledFutureClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunnableScheduledFutureTests<SUT extends java.util.concurrent.RunnableScheduledFuture<V>, V>
extends RunnableFutureTests<SUT, V>, ScheduledFutureTests<SUT, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RunnableScheduledFuture#isPeriodic() public abstract boolean
     * java.util.concurrent.RunnableScheduledFuture.isPeriodic()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.RunnableScheduledFuture#isPeriodic() public abstract boolean
     * java.util.concurrent.RunnableScheduledFuture.isPeriodic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.RunnableScheduledFuture#isPeriodic() public abstract boolean
     *      java.util.concurrent.RunnableScheduledFuture.isPeriodic() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPeriodic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
