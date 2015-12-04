package org.j8unit.repository.java.util.function;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.ToIntFunction interface java.util.function.ToIntFunction}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.ToIntFunctionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToIntFunctionTests<SUT extends java.util.function.ToIntFunction<T>, T>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.ToIntFunction#applyAsInt(java.lang.Object) public abstract int
     * java.util.function.ToIntFunction.applyAsInt(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_applyAsInt_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
