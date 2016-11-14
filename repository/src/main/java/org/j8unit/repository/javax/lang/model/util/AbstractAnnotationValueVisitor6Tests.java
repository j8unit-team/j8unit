package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractAnnotationValueVisitor6;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.lang.model.element.AnnotationValueVisitorTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link AbstractAnnotationValueVisitor6 public abstract class
 * javax.lang.model.util.AbstractAnnotationValueVisitor6<R,P>}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.lang.model.util.AbstractAnnotationValueVisitor6ClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractAnnotationValueVisitor6Tests<SUT extends AbstractAnnotationValueVisitor6<R, P>, R, P>
extends AnnotationValueVisitorTests<SUT, R, P>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.AbstractAnnotationValueVisitor6]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visit(javax.lang.model.element.AnnotationValue, Object)
     * public final R
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visit(javax.lang.model.element.AnnotationValue,P)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visit_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visit(javax.lang.model.element.AnnotationValue)
     * public final R
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visit(javax.lang.model.element.AnnotationValue)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visit_AnnotationValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.lang.model.util.AbstractAnnotationValueVisitor6#visitUnknown(javax.lang.model.element.AnnotationValue, Object)
     * public R
     * javax.lang.model.util.AbstractAnnotationValueVisitor6.visitUnknown(javax.lang.model.element.AnnotationValue,P)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visitUnknown_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.AbstractAnnotationValueVisitor6]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.AbstractAnnotationValueVisitor6]

}
