package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.InvalidClassException class java.io.InvalidClassException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link InvalidClassExceptionClassTests}.
 * </p>
 *
 * @see java.io.InvalidClassException class java.io.InvalidClassException (the hereby targeted class-under-test class)
 * @see InvalidClassExceptionClassTests InvalidClassExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidClassExceptionTests<SUT extends java.io.InvalidClassException>
extends ObjectStreamExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.InvalidClassException#getMessage() public java.lang.String
     * java.io.InvalidClassException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.io.InvalidClassException#getMessage() public java.lang.String
     * java.io.InvalidClassException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.InvalidClassException#getMessage() public java.lang.String
     *      java.io.InvalidClassException.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
