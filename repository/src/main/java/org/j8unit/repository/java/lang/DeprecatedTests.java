package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Deprecated interface java.lang.Deprecated}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link DeprecatedClassTests}.
 * </p>
 *
 * @see Deprecated interface java.lang.Deprecated (the hereby targeted class-under-test class)
 * @see DeprecatedClassTests DeprecatedClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DeprecatedTests<SUT extends Deprecated>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
