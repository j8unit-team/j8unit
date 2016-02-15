package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.util.SimpleTypeVisitor8 class
 * javax.lang.model.util.SimpleTypeVisitor8}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SimpleTypeVisitor8ClassTests}.
 * </p>
 *
 * @see javax.lang.model.util.SimpleTypeVisitor8 class javax.lang.model.util.SimpleTypeVisitor8 (the hereby targeted
 *      class-under-test class)
 * @see SimpleTypeVisitor8ClassTests SimpleTypeVisitor8ClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleTypeVisitor8Tests<SUT extends javax.lang.model.util.SimpleTypeVisitor8<R, P>, R, P>
extends SimpleTypeVisitor7Tests<SUT, R, P> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.SimpleTypeVisitor8#visitIntersection(javax.lang.model.type.IntersectionType, Object)
     * public R javax.lang.model.util.SimpleTypeVisitor8.visitIntersection(javax.lang.model.type.IntersectionType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.util.SimpleTypeVisitor8#visitIntersection(javax.lang.model.type.IntersectionType, Object)
     * public java.lang.Object
     * javax.lang.model.util.SimpleTypeVisitor8.visitIntersection(javax.lang.model.type.IntersectionType,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.util.SimpleTypeVisitor8#visitIntersection(javax.lang.model.type.IntersectionType, Object)
     *      public java.lang.Object
     *      javax.lang.model.util.SimpleTypeVisitor8.visitIntersection(javax.lang.model.type.IntersectionType,java.lang.
     *      Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_visitIntersection_IntersectionType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
