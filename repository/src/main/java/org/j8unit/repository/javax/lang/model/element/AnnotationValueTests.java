package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.AnnotationValue interface javax.lang.model.element.AnnotationValue},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.AnnotationValueClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotationValueTests<SUT extends javax.lang.model.element.AnnotationValue>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValue#toString() public abstract java.lang.String
     * javax.lang.model.element.AnnotationValue.toString()}.
     * </p>
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
     * {@link javax.lang.model.element.AnnotationValue#accept(javax.lang.model.element.AnnotationValueVisitor,java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValue.accept(javax.lang.model.element.AnnotationValueVisitor,java.lang.Object)}
     * .
     * </p>
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
     * </p>
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
