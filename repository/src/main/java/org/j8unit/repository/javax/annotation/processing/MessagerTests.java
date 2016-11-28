package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Messager;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Messager public
 * abstract interface javax.annotation.processing.Messager}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.annotation.processing.MessagerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessagerTests<SUT extends Messager>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Messager]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence) public
     * abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.annotation.processing.Messager#printMessage(javax.tools.Diagnostic.Kind, CharSequence, javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror, javax.lang.model.element.AnnotationValue)
     * public abstract void
     * javax.annotation.processing.Messager.printMessage(javax.tools.Diagnostic$Kind,java.lang.CharSequence,javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.AnnotationValue)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.Messager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.Messager]

}
