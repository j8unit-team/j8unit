package org.j8unit.repository.java.util.function;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.function.DoubleConsumer interface
 * java.util.function.DoubleConsumer}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DoubleConsumerClassTests}.
 * </p>
 *
 * @see java.util.function.DoubleConsumer interface java.util.function.DoubleConsumer (the hereby targeted
 *      class-under-test class)
 * @see DoubleConsumerClassTests DoubleConsumerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DoubleConsumerTests<SUT extends java.util.function.DoubleConsumer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#accept(double) public abstract void
     * java.util.function.DoubleConsumer.accept(double)}.
     *
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#accept(double) public abstract void
     * java.util.function.DoubleConsumer.accept(double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.DoubleConsumer#accept(double) public abstract void
     *      java.util.function.DoubleConsumer.accept(double) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#andThen(java.util.function.DoubleConsumer) public
     * default java.util.function.DoubleConsumer
     * java.util.function.DoubleConsumer.andThen(java.util.function.DoubleConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#andThen(java.util.function.DoubleConsumer) public
     * default java.util.function.DoubleConsumer
     * java.util.function.DoubleConsumer.andThen(java.util.function.DoubleConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.DoubleConsumer#andThen(java.util.function.DoubleConsumer) public default
     *      java.util.function.DoubleConsumer
     *      java.util.function.DoubleConsumer.andThen(java.util.function.DoubleConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_DoubleConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
