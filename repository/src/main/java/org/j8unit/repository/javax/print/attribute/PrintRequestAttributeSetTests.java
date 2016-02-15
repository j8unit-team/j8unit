package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.attribute.PrintRequestAttributeSet interface
 * javax.print.attribute.PrintRequestAttributeSet}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link PrintRequestAttributeSetClassTests}.
 * </p>
 *
 * @see javax.print.attribute.PrintRequestAttributeSet interface javax.print.attribute.PrintRequestAttributeSet (the
 *      hereby targeted class-under-test class)
 * @see PrintRequestAttributeSetClassTests PrintRequestAttributeSetClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintRequestAttributeSetTests<SUT extends javax.print.attribute.PrintRequestAttributeSet>
extends AttributeSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.PrintRequestAttributeSet#addAll(javax.print.attribute.AttributeSet)
     * public abstract boolean
     * javax.print.attribute.PrintRequestAttributeSet.addAll(javax.print.attribute.AttributeSet)}.
     *
     * <p>
     * Test method for {@link javax.print.attribute.PrintRequestAttributeSet#addAll(javax.print.attribute.AttributeSet)
     * public abstract boolean
     * javax.print.attribute.PrintRequestAttributeSet.addAll(javax.print.attribute.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.attribute.PrintRequestAttributeSet#addAll(javax.print.attribute.AttributeSet) public abstract
     *      boolean javax.print.attribute.PrintRequestAttributeSet.addAll(javax.print.attribute.AttributeSet) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.PrintRequestAttributeSet#add(javax.print.attribute.Attribute) public
     * abstract boolean javax.print.attribute.PrintRequestAttributeSet.add(javax.print.attribute.Attribute)}.
     *
     * <p>
     * Test method for {@link javax.print.attribute.PrintRequestAttributeSet#add(javax.print.attribute.Attribute) public
     * abstract boolean javax.print.attribute.PrintRequestAttributeSet.add(javax.print.attribute.Attribute)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.attribute.PrintRequestAttributeSet#add(javax.print.attribute.Attribute) public abstract boolean
     *      javax.print.attribute.PrintRequestAttributeSet.add(javax.print.attribute.Attribute) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
