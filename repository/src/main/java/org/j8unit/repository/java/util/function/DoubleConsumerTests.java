package org.j8unit.repository.java.util.function;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.function.DoubleConsumer interface
 * java.util.function.DoubleConsumer}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.function.DoubleConsumerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.function.DoubleConsumerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.function.DoubleConsumer
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.function.DoubleConsumer#accept(double)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.function.DoubleConsumer#andThen(java.util.function.DoubleConsumer)
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
