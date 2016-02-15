package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.RecursiveAction class
 * java.util.concurrent.RecursiveAction}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link RecursiveActionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.RecursiveAction class java.util.concurrent.RecursiveAction (the hereby targeted
 *      class-under-test class)
 * @see RecursiveActionClassTests RecursiveActionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RecursiveActionTests<SUT extends java.util.concurrent.RecursiveAction>
extends ForkJoinTaskTests<SUT, Void> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveAction#getRawResult() public final java.lang.Void
     * java.util.concurrent.RecursiveAction.getRawResult()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveAction#getRawResult() public final java.lang.Void
     * java.util.concurrent.RecursiveAction.getRawResult()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.RecursiveAction#getRawResult() public final java.lang.Void
     *      java.util.concurrent.RecursiveAction.getRawResult() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRawResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
