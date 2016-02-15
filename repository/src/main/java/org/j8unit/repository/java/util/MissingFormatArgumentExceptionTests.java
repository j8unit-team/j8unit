package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.MissingFormatArgumentException class
 * java.util.MissingFormatArgumentException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MissingFormatArgumentExceptionClassTests}.
 * </p>
 *
 * @see java.util.MissingFormatArgumentException class java.util.MissingFormatArgumentException (the hereby targeted
 *      class-under-test class)
 * @see MissingFormatArgumentExceptionClassTests MissingFormatArgumentExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MissingFormatArgumentExceptionTests<SUT extends java.util.MissingFormatArgumentException>
extends IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.MissingFormatArgumentException#getMessage() public java.lang.String
     * java.util.MissingFormatArgumentException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.util.MissingFormatArgumentException#getMessage() public java.lang.String
     * java.util.MissingFormatArgumentException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.MissingFormatArgumentException#getMessage() public java.lang.String
     *      java.util.MissingFormatArgumentException.getMessage() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.MissingFormatArgumentException#getFormatSpecifier() public java.lang.String
     * java.util.MissingFormatArgumentException.getFormatSpecifier()}.
     *
     * <p>
     * Test method for {@link java.util.MissingFormatArgumentException#getFormatSpecifier() public java.lang.String
     * java.util.MissingFormatArgumentException.getFormatSpecifier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.MissingFormatArgumentException#getFormatSpecifier() public java.lang.String
     *      java.util.MissingFormatArgumentException.getFormatSpecifier() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFormatSpecifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
