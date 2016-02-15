package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain EnumConstantNotPresentException class
 * java.lang.EnumConstantNotPresentException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link EnumConstantNotPresentExceptionClassTests}.
 * </p>
 *
 * @see EnumConstantNotPresentException class java.lang.EnumConstantNotPresentException (the hereby targeted
 *      class-under-test class)
 * @see EnumConstantNotPresentExceptionClassTests EnumConstantNotPresentExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumConstantNotPresentExceptionTests<SUT extends EnumConstantNotPresentException>
extends RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link EnumConstantNotPresentException#constantName() public java.lang.String
     * java.lang.EnumConstantNotPresentException.constantName()}.
     *
     * <p>
     * Test method for {@link EnumConstantNotPresentException#constantName() public java.lang.String
     * java.lang.EnumConstantNotPresentException.constantName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see EnumConstantNotPresentException#constantName() public java.lang.String
     *      java.lang.EnumConstantNotPresentException.constantName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_constantName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link EnumConstantNotPresentException#enumType() public java.lang.Class<? extends
     * java.lang.Enum> java.lang.EnumConstantNotPresentException.enumType()}.
     *
     * <p>
     * Test method for {@link EnumConstantNotPresentException#enumType() public java.lang.Class
     * java.lang.EnumConstantNotPresentException.enumType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see EnumConstantNotPresentException#enumType() public java.lang.Class
     *      java.lang.EnumConstantNotPresentException.enumType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enumType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
