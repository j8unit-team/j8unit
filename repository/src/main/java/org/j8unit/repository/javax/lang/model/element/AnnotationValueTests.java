package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.AnnotationValue interface
 * javax.lang.model.element.AnnotationValue}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AnnotationValueClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.AnnotationValue interface javax.lang.model.element.AnnotationValue (the hereby targeted
 *      class-under-test class)
 * @see AnnotationValueClassTests AnnotationValueClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationValueTests<SUT extends javax.lang.model.element.AnnotationValue>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValue#toString() public abstract java.lang.String
     * javax.lang.model.element.AnnotationValue.toString()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValue#toString() public abstract java.lang.String
     * javax.lang.model.element.AnnotationValue.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValue#toString() public abstract java.lang.String
     *      javax.lang.model.element.AnnotationValue.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValue#accept(javax.lang.model.element.AnnotationValueVisitor, Object)
     * public abstract <R,P> R
     * javax.lang.model.element.AnnotationValue.accept(javax.lang.model.element.AnnotationValueVisitor<R, P>,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValue#accept(javax.lang.model.element.AnnotationValueVisitor, Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValue.accept(javax.lang.model.element.AnnotationValueVisitor,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValue#accept(javax.lang.model.element.AnnotationValueVisitor, Object)
     *      public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValue.accept(javax.lang.model.element.AnnotationValueVisitor,java.lang.
     *      Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_AnnotationValueVisitor_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValue#getValue() public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValue.getValue()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValue#getValue() public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValue.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValue#getValue() public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValue.getValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
