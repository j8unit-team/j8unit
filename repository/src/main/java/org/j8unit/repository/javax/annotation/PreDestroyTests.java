package org.j8unit.repository.javax.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.PreDestroy interface javax.annotation.PreDestroy}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PreDestroyClassTests}.
 * </p>
 *
 * @see javax.annotation.PreDestroy interface javax.annotation.PreDestroy (the hereby targeted class-under-test class)
 * @see PreDestroyClassTests PreDestroyClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PreDestroyTests<SUT extends javax.annotation.PreDestroy>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
