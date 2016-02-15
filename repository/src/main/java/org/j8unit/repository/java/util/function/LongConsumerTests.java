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
 * non-{@code static} methods) of {@linkplain java.util.function.LongConsumer interface java.util.function.LongConsumer}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link LongConsumerClassTests}.
 * </p>
 *
 * @see java.util.function.LongConsumer interface java.util.function.LongConsumer (the hereby targeted class-under-test
 *      class)
 * @see LongConsumerClassTests LongConsumerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LongConsumerTests<SUT extends java.util.function.LongConsumer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.LongConsumer#accept(long) public abstract void
     * java.util.function.LongConsumer.accept(long)}.
     *
     * <p>
     * Test method for {@link java.util.function.LongConsumer#accept(long) public abstract void
     * java.util.function.LongConsumer.accept(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.LongConsumer#accept(long) public abstract void
     *      java.util.function.LongConsumer.accept(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.LongConsumer#andThen(java.util.function.LongConsumer) public default
     * java.util.function.LongConsumer java.util.function.LongConsumer.andThen(java.util.function.LongConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.function.LongConsumer#andThen(java.util.function.LongConsumer) public default
     * java.util.function.LongConsumer java.util.function.LongConsumer.andThen(java.util.function.LongConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.function.LongConsumer#andThen(java.util.function.LongConsumer) public default
     *      java.util.function.LongConsumer java.util.function.LongConsumer.andThen(java.util.function.LongConsumer)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_LongConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
