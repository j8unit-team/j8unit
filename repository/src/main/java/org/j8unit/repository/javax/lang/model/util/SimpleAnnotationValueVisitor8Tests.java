package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link SimpleAnnotationValueVisitor8 public class javax.lang.model.util.SimpleAnnotationValueVisitor8<R,P>}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.lang.model.util.SimpleAnnotationValueVisitor8ClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleAnnotationValueVisitor8Tests<SUT extends SimpleAnnotationValueVisitor8<R, P>, R, P>
extends SimpleAnnotationValueVisitor7Tests<SUT, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.SimpleAnnotationValueVisitor8]

}
