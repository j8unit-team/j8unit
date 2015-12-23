package org.j8unit.repository.java.math;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.math.RoundingMode class java.math.RoundingMode}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.math.RoundingModeTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.math.RoundingModeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.math.RoundingMode
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoundingModeTests<SUT extends java.math.RoundingMode>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.math.RoundingMode> {

}
