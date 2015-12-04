package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.util.AbstractAnnotationValueVisitor6 class
 * javax.lang.model.util.AbstractAnnotationValueVisitor6}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.util.AbstractAnnotationValueVisitor6ClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractAnnotationValueVisitor6Tests<SUT extends javax.lang.model.util.AbstractAnnotationValueVisitor6<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.element.AnnotationValueVisitorTests<SUT, R, P>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visit(javax.lang.model.element.AnnotationValue)
     * public final java.lang.Object
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visit(javax.lang.model.element.AnnotationValue)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visit_AnnotationValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visit(javax.lang.model.element.AnnotationValue,java.lang.Object)
     * public final java.lang.Object
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visit(javax.lang.model.element.AnnotationValue,java.lang.Object)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visit_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visitUnknown(javax.lang.model.element.AnnotationValue,java.lang.Object)
     * public java.lang.Object
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visitUnknown(javax.lang.model.element.AnnotationValue,java.lang.Object)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitUnknown_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
