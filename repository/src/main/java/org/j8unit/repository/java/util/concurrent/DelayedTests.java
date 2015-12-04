package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.Delayed interface java.util.concurrent.Delayed}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.DelayedClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DelayedTests<SUT extends java.util.concurrent.Delayed>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, java.util.concurrent.Delayed> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Delayed#getDelay(java.util.concurrent.TimeUnit) public abstract long
     * java.util.concurrent.Delayed.getDelay(java.util.concurrent.TimeUnit)}.
     * </p>
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
