package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.IllegalFormatPrecisionException class
 * java.util.IllegalFormatPrecisionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link IllegalFormatPrecisionExceptionClassTests}.
 * </p>
 *
 * @see java.util.IllegalFormatPrecisionException class java.util.IllegalFormatPrecisionException (the hereby targeted
 *      class-under-test class)
 * @see IllegalFormatPrecisionExceptionClassTests IllegalFormatPrecisionExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalFormatPrecisionExceptionTests<SUT extends java.util.IllegalFormatPrecisionException>
extends IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatPrecisionException#getMessage() public java.lang.String
     * java.util.IllegalFormatPrecisionException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatPrecisionException#getMessage() public java.lang.String
     * java.util.IllegalFormatPrecisionException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatPrecisionException#getMessage() public java.lang.String
     *      java.util.IllegalFormatPrecisionException.getMessage() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IllegalFormatPrecisionException#getPrecision() public int
     * java.util.IllegalFormatPrecisionException.getPrecision()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatPrecisionException#getPrecision() public int
     * java.util.IllegalFormatPrecisionException.getPrecision()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatPrecisionException#getPrecision() public int
     *      java.util.IllegalFormatPrecisionException.getPrecision() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrecision()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
