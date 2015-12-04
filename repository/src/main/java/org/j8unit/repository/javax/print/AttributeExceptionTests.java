package org.j8unit.repository.javax.print;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.AttributeException interface javax.print.AttributeException}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.AttributeExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeExceptionTests<SUT extends javax.print.AttributeException>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.AttributeException#getUnsupportedAttributes() public abstract
     * java.lang.Class[] javax.print.AttributeException.getUnsupportedAttributes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnsupportedAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.AttributeException#getUnsupportedValues() public abstract
     * javax.print.attribute.Attribute[] javax.print.AttributeException.getUnsupportedValues()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnsupportedValues()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
