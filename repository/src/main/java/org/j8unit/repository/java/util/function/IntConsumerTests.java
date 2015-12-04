package org.j8unit.repository.java.util.function;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.IntConsumer interface java.util.function.IntConsumer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.IntConsumerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IntConsumerTests<SUT extends java.util.function.IntConsumer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.IntConsumer#accept(int) public abstract void
     * java.util.function.IntConsumer.accept(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.IntConsumer#andThen(java.util.function.IntConsumer) public default
     * java.util.function.IntConsumer java.util.function.IntConsumer.andThen(java.util.function.IntConsumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_IntConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
