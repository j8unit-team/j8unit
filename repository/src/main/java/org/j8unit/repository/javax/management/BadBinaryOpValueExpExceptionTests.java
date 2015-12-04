package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.BadBinaryOpValueExpException class
 * javax.management.BadBinaryOpValueExpException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.BadBinaryOpValueExpExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BadBinaryOpValueExpExceptionTests<SUT extends javax.management.BadBinaryOpValueExpException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.BadBinaryOpValueExpException#getExp() public javax.management.ValueExp
     * javax.management.BadBinaryOpValueExpException.getExp()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.BadBinaryOpValueExpException#toString() public java.lang.String
     * javax.management.BadBinaryOpValueExpException.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
