package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.IllegalFormatWidthException class
 * java.util.IllegalFormatWidthException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link IllegalFormatWidthExceptionClassTests}.
 * </p>
 *
 * @see java.util.IllegalFormatWidthException class java.util.IllegalFormatWidthException (the hereby targeted
 *      class-under-test class)
 * @see IllegalFormatWidthExceptionClassTests IllegalFormatWidthExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalFormatWidthExceptionTests<SUT extends java.util.IllegalFormatWidthException>
extends IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getMessage() public java.lang.String
     * java.util.IllegalFormatWidthException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getMessage() public java.lang.String
     * java.util.IllegalFormatWidthException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatWidthException#getMessage() public java.lang.String
     *      java.util.IllegalFormatWidthException.getMessage() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getWidth() public int
     * java.util.IllegalFormatWidthException.getWidth()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getWidth() public int
     * java.util.IllegalFormatWidthException.getWidth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatWidthException#getWidth() public int java.util.IllegalFormatWidthException.getWidth()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWidth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
