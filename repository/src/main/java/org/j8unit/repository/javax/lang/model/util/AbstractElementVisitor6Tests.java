package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.util.AbstractElementVisitor6 class
 * javax.lang.model.util.AbstractElementVisitor6}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AbstractElementVisitor6ClassTests}.
 * </p>
 *
 * @see javax.lang.model.util.AbstractElementVisitor6 class javax.lang.model.util.AbstractElementVisitor6 (the hereby
 *      targeted class-under-test class)
 * @see AbstractElementVisitor6ClassTests AbstractElementVisitor6ClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractElementVisitor6Tests<SUT extends javax.lang.model.util.AbstractElementVisitor6<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.element.ElementVisitorTests<SUT, R, P>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element)
     * public final R javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element)
     * public final java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element) public final
     *      java.lang.Object javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visit_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element, Object) public final
     * R javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element, Object) public final
     * java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element, Object) public final
     *      java.lang.Object
     *      javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visit_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visitUnknown(javax.lang.model.element.Element, Object)
     * public R javax.lang.model.util.AbstractElementVisitor6.visitUnknown(javax.lang.model.element.Element,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visitUnknown(javax.lang.model.element.Element, Object)
     * public java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visitUnknown(javax.lang.model.element.Element,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.util.AbstractElementVisitor6#visitUnknown(javax.lang.model.element.Element, Object) public
     *      java.lang.Object
     *      javax.lang.model.util.AbstractElementVisitor6.visitUnknown(javax.lang.model.element.Element,java.lang.
     *      Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visitUnknown_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
