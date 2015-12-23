package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.FormatFlagsConversionMismatchException class
 * java.util.FormatFlagsConversionMismatchException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.FormatFlagsConversionMismatchExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.FormatFlagsConversionMismatchExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.FormatFlagsConversionMismatchException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatFlagsConversionMismatchExceptionTests<SUT extends java.util.FormatFlagsConversionMismatchException>
extends org.j8unit.repository.java.util.IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.FormatFlagsConversionMismatchException#getConversion() public char
     * java.util.FormatFlagsConversionMismatchException.getConversion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.FormatFlagsConversionMismatchException#getConversion()
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

    /**
     * <p>
     * Test method for {@link java.util.FormatFlagsConversionMismatchException#getFlags() public java.lang.String
     * java.util.FormatFlagsConversionMismatchException.getFlags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.FormatFlagsConversionMismatchException#getFlags()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlags()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.FormatFlagsConversionMismatchException#getMessage() public java.lang.String
     * java.util.FormatFlagsConversionMismatchException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.FormatFlagsConversionMismatchException#getMessage()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
