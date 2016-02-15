package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.util.SimpleAnnotationValueVisitor8 class
 * javax.lang.model.util.SimpleAnnotationValueVisitor8}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link SimpleAnnotationValueVisitor8ClassTests}.
 * </p>
 *
 * @see javax.lang.model.util.SimpleAnnotationValueVisitor8 class javax.lang.model.util.SimpleAnnotationValueVisitor8
 *      (the hereby targeted class-under-test class)
 * @see SimpleAnnotationValueVisitor8ClassTests SimpleAnnotationValueVisitor8ClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleAnnotationValueVisitor8Tests<SUT extends javax.lang.model.util.SimpleAnnotationValueVisitor8<R, P>, R, P>
extends SimpleAnnotationValueVisitor7Tests<SUT, R, P> {

}
