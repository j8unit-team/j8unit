package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.BadStringOperationException class
 * javax.management.BadStringOperationException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BadStringOperationExceptionClassTests}.
 * </p>
 *
 * @see javax.management.BadStringOperationException class javax.management.BadStringOperationException (the hereby
 *      targeted class-under-test class)
 * @see BadStringOperationExceptionClassTests BadStringOperationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BadStringOperationExceptionTests<SUT extends javax.management.BadStringOperationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.BadStringOperationException#toString() public java.lang.String
     * javax.management.BadStringOperationException.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.BadStringOperationException#toString() public java.lang.String
     * javax.management.BadStringOperationException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.BadStringOperationException#toString() public java.lang.String
     *      javax.management.BadStringOperationException.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
