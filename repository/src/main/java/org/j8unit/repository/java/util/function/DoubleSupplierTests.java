package org.j8unit.repository.java.util.function;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.DoubleSupplier interface java.util.function.DoubleSupplier}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.DoubleSupplierClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DoubleSupplierTests<SUT extends java.util.function.DoubleSupplier>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.DoubleSupplier#getAsDouble() public abstract double
     * java.util.function.DoubleSupplier.getAsDouble()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAsDouble()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}