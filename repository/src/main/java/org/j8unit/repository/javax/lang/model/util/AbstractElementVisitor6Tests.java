package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.util.AbstractElementVisitor6 class
 * javax.lang.model.util.AbstractElementVisitor6}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.AbstractElementVisitor6ClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractElementVisitor6Tests<SUT extends javax.lang.model.util.AbstractElementVisitor6<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.element.ElementVisitorTests<SUT, R, P>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element)
     * public final java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visit_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visit(javax.lang.model.element.Element,java.lang.Object)
     * public final java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visit(javax.lang.model.element.Element,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visit_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractElementVisitor6#visitUnknown(javax.lang.model.element.Element,java.lang.Object)
     * public java.lang.Object
     * javax.lang.model.util.AbstractElementVisitor6.visitUnknown(javax.lang.model.element.Element,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitUnknown_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
