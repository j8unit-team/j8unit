package org.j8unit.repository.java.util.function;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.function.ToIntBiFunction interface
 * java.util.function.ToIntBiFunction}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.function.ToIntBiFunctionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.function.ToIntBiFunctionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.function.ToIntBiFunction
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToIntBiFunctionTests<SUT extends java.util.function.ToIntBiFunction<T, U>, T, U>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.ToIntBiFunction#applyAsInt(java.lang.Object, java.lang.Object) public
     * abstract int java.util.function.ToIntBiFunction.applyAsInt(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.function.ToIntBiFunction#applyAsInt(java.lang.Object, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_applyAsInt_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
