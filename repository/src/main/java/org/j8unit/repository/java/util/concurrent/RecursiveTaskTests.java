package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.RecursiveTask class java.util.concurrent.RecursiveTask}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.RecursiveTaskClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RecursiveTaskTests<SUT extends java.util.concurrent.RecursiveTask<V>, V>
extends org.j8unit.repository.java.util.concurrent.ForkJoinTaskTests<SUT, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveTask#getRawResult() public final java.lang.Object
     * java.util.concurrent.RecursiveTask.getRawResult()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRawResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
