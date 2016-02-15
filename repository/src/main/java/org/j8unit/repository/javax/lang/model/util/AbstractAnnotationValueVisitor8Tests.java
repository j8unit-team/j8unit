package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.util.AbstractAnnotationValueVisitor8 class
 * javax.lang.model.util.AbstractAnnotationValueVisitor8}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AbstractAnnotationValueVisitor8ClassTests}.
 * </p>
 *
 * @see javax.lang.model.util.AbstractAnnotationValueVisitor8 class
 *      javax.lang.model.util.AbstractAnnotationValueVisitor8 (the hereby targeted class-under-test class)
 * @see AbstractAnnotationValueVisitor8ClassTests AbstractAnnotationValueVisitor8ClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractAnnotationValueVisitor8Tests<SUT extends javax.lang.model.util.AbstractAnnotationValueVisitor8<R, P>, R, P>
extends AbstractAnnotationValueVisitor7Tests<SUT, R, P> {

}
