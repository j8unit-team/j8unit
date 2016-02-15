package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.Delayed interface java.util.concurrent.Delayed}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DelayedClassTests}.
 * </p>
 *
 * @see java.util.concurrent.Delayed interface java.util.concurrent.Delayed (the hereby targeted class-under-test class)
 * @see DelayedClassTests DelayedClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DelayedTests<SUT extends java.util.concurrent.Delayed>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, java.util.concurrent.Delayed> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Delayed#getDelay(java.util.concurrent.TimeUnit) public abstract long
     * java.util.concurrent.Delayed.getDelay(java.util.concurrent.TimeUnit)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Delayed#getDelay(java.util.concurrent.TimeUnit) public abstract long
     * java.util.concurrent.Delayed.getDelay(java.util.concurrent.TimeUnit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Delayed#getDelay(java.util.concurrent.TimeUnit) public abstract long
     *      java.util.concurrent.Delayed.getDelay(java.util.concurrent.TimeUnit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDelay_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
