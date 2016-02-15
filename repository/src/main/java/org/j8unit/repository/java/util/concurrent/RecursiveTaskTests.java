package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.RecursiveTask class
 * java.util.concurrent.RecursiveTask}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link RecursiveTaskClassTests}.
 * </p>
 *
 * @see java.util.concurrent.RecursiveTask class java.util.concurrent.RecursiveTask (the hereby targeted
 *      class-under-test class)
 * @see RecursiveTaskClassTests RecursiveTaskClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RecursiveTaskTests<SUT extends java.util.concurrent.RecursiveTask<V>, V>
extends ForkJoinTaskTests<SUT, V> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveTask#getRawResult() public final V
     * java.util.concurrent.RecursiveTask.getRawResult()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveTask#getRawResult() public final java.lang.Object
     * java.util.concurrent.RecursiveTask.getRawResult()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.RecursiveTask#getRawResult() public final java.lang.Object
     *      java.util.concurrent.RecursiveTask.getRawResult() (the hereby targeted method-under-test)
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
