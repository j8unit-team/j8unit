package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.IllegalFormatConversionException class
 * java.util.IllegalFormatConversionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link IllegalFormatConversionExceptionClassTests}.
 * </p>
 *
 * @see java.util.IllegalFormatConversionException class java.util.IllegalFormatConversionException (the hereby targeted
 *      class-under-test class)
 * @see IllegalFormatConversionExceptionClassTests IllegalFormatConversionExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalFormatConversionExceptionTests<SUT extends java.util.IllegalFormatConversionException>
extends IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatConversionException#getMessage() public java.lang.String
     * java.util.IllegalFormatConversionException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatConversionException#getMessage() public java.lang.String
     * java.util.IllegalFormatConversionException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatConversionException#getMessage() public java.lang.String
     *      java.util.IllegalFormatConversionException.getMessage() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.IllegalFormatConversionException#getArgumentClass() public java.lang.Class
     * <?> java.util.IllegalFormatConversionException.getArgumentClass()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatConversionException#getArgumentClass() public java.lang.Class
     * java.util.IllegalFormatConversionException.getArgumentClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatConversionException#getArgumentClass() public java.lang.Class
     *      java.util.IllegalFormatConversionException.getArgumentClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArgumentClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatConversionException#getConversion() public char
     * java.util.IllegalFormatConversionException.getConversion()}.
     *
     * <p>
     * Test method for {@link java.util.IllegalFormatConversionException#getConversion() public char
     * java.util.IllegalFormatConversionException.getConversion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.IllegalFormatConversionException#getConversion() public char
     *      java.util.IllegalFormatConversionException.getConversion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConversion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
