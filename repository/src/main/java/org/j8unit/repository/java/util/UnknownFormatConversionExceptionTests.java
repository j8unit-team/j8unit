package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.UnknownFormatConversionException class
 * java.util.UnknownFormatConversionException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.UnknownFormatConversionExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.UnknownFormatConversionExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.UnknownFormatConversionException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownFormatConversionExceptionTests<SUT extends java.util.UnknownFormatConversionException>
extends org.j8unit.repository.java.util.IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.UnknownFormatConversionException#getConversion() public java.lang.String
     * java.util.UnknownFormatConversionException.getConversion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.UnknownFormatConversionException#getConversion()
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
     * Test method for {@link java.util.UnknownFormatConversionException#getMessage() public java.lang.String
     * java.util.UnknownFormatConversionException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.UnknownFormatConversionException#getMessage()
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
