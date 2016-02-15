package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.UnknownFormatFlagsException class
 * java.util.UnknownFormatFlagsException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link UnknownFormatFlagsExceptionClassTests}.
 * </p>
 *
 * @see java.util.UnknownFormatFlagsException class java.util.UnknownFormatFlagsException (the hereby targeted
 *      class-under-test class)
 * @see UnknownFormatFlagsExceptionClassTests UnknownFormatFlagsExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownFormatFlagsExceptionTests<SUT extends java.util.UnknownFormatFlagsException>
extends IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.UnknownFormatFlagsException#getFlags() public java.lang.String
     * java.util.UnknownFormatFlagsException.getFlags()}.
     *
     * <p>
     * Test method for {@link java.util.UnknownFormatFlagsException#getFlags() public java.lang.String
     * java.util.UnknownFormatFlagsException.getFlags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.UnknownFormatFlagsException#getFlags() public java.lang.String
     *      java.util.UnknownFormatFlagsException.getFlags() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.UnknownFormatFlagsException#getMessage() public java.lang.String
     * java.util.UnknownFormatFlagsException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.util.UnknownFormatFlagsException#getMessage() public java.lang.String
     * java.util.UnknownFormatFlagsException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.UnknownFormatFlagsException#getMessage() public java.lang.String
     *      java.util.UnknownFormatFlagsException.getMessage() (the hereby targeted method-under-test)
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
