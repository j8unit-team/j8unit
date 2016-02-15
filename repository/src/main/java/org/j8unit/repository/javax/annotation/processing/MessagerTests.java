package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.Messager interface
 * javax.annotation.processing.Messager}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MessagerClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.Messager interface javax.annotation.processing.Messager (the hereby targeted
 *      class-under-test class)
 * @see MessagerClassTests MessagerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessagerTests<SUT extends javax.annotation.processing.Messager>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror, javax.lang.model.element.AnnotationValue)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.AnnotationValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror, javax.lang.model.element.AnnotationValue)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.AnnotationValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence,
     *      javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror,
     *      javax.lang.model.element.AnnotationValue) public abstract void
     *      javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.
     *      lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.
     *      AnnotationValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printMessage_Kind_CharSequence_Element_AnnotationMirror_AnnotationValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence,
     *      javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror) public abstract void
     *      javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.
     *      lang.model.element.Element,javax.lang.model.element.AnnotationMirror) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printMessage_Kind_CharSequence_Element_AnnotationMirror()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence,
     *      javax.lang.model.element.Element) public abstract void
     *      javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.
     *      lang.model.element.Element) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printMessage_Kind_CharSequence_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence) public
     * abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence)}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence) public
     * abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence) public abstract
     *      void javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printMessage_Kind_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
