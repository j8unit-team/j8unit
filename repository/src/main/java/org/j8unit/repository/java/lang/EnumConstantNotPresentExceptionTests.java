package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.EnumConstantNotPresentException class
 * java.lang.EnumConstantNotPresentException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.EnumConstantNotPresentExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.EnumConstantNotPresentExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.EnumConstantNotPresentException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumConstantNotPresentExceptionTests<SUT extends java.lang.EnumConstantNotPresentException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.EnumConstantNotPresentException#constantName() public java.lang.String
     * java.lang.EnumConstantNotPresentException.constantName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.EnumConstantNotPresentException#constantName()
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
     * Test method for {@link java.lang.EnumConstantNotPresentException#enumType() public java.lang.Class
     * java.lang.EnumConstantNotPresentException.enumType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.EnumConstantNotPresentException#enumType()
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
