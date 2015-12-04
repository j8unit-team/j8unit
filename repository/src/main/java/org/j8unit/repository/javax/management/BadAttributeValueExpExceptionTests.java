package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.BadAttributeValueExpException class
 * javax.management.BadAttributeValueExpException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.BadAttributeValueExpExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BadAttributeValueExpExceptionTests<SUT extends javax.management.BadAttributeValueExpException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.BadAttributeValueExpException#toString() public java.lang.String
     * javax.management.BadAttributeValueExpException.toString()}.
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
