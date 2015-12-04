package org.j8unit.repository.java.util.function;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.LongConsumer interface java.util.function.LongConsumer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.LongConsumerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LongConsumerTests<SUT extends java.util.function.LongConsumer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.LongConsumer#accept(long) public abstract void
     * java.util.function.LongConsumer.accept(long)}.
     * </p>
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
     * </p>
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
