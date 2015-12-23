package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.DocAttributeSet interface
 * javax.print.attribute.DocAttributeSet}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.print.attribute.DocAttributeSetTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.attribute.DocAttributeSetClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.DocAttributeSet
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocAttributeSetTests<SUT extends javax.print.attribute.DocAttributeSet>
extends org.j8unit.repository.javax.print.attribute.AttributeSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.DocAttributeSet#add(javax.print.attribute.Attribute) public abstract
     * boolean javax.print.attribute.DocAttributeSet.add(javax.print.attribute.Attribute)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.DocAttributeSet#add(javax.print.attribute.Attribute)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_add_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.DocAttributeSet#addAll(javax.print.attribute.AttributeSet) public
     * abstract boolean javax.print.attribute.DocAttributeSet.addAll(javax.print.attribute.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.DocAttributeSet#addAll(javax.print.attribute.AttributeSet)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addAll_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
