package org.j8unit.repository.javax.print;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.AttributeException interface javax.print.AttributeException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link AttributeExceptionClassTests}
 * .
 * </p>
 *
 * @see javax.print.AttributeException interface javax.print.AttributeException (the hereby targeted class-under-test
 *      class)
 * @see AttributeExceptionClassTests AttributeExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeExceptionTests<SUT extends javax.print.AttributeException>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.AttributeException#getUnsupportedAttributes() public abstract
     * java.lang.Class[] javax.print.AttributeException.getUnsupportedAttributes()}.
     *
     * <p>
     * Test method for {@link javax.print.AttributeException#getUnsupportedAttributes() public abstract
     * java.lang.Class[] javax.print.AttributeException.getUnsupportedAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.AttributeException#getUnsupportedAttributes() public abstract java.lang.Class[]
     *      javax.print.AttributeException.getUnsupportedAttributes() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.print.AttributeException#getUnsupportedValues() public abstract
     * javax.print.attribute.Attribute[] javax.print.AttributeException.getUnsupportedValues()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.AttributeException#getUnsupportedValues() public abstract javax.print.attribute.Attribute[]
     *      javax.print.AttributeException.getUnsupportedValues() (the hereby targeted method-under-test)
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
