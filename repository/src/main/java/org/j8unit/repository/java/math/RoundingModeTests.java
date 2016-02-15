package org.j8unit.repository.java.math;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.math.RoundingMode class java.math.RoundingMode}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link RoundingModeClassTests}.
 * </p>
 *
 * @see java.math.RoundingMode class java.math.RoundingMode (the hereby targeted class-under-test class)
 * @see RoundingModeClassTests RoundingModeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoundingModeTests<SUT extends java.math.RoundingMode>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.math.RoundingMode> {

}
