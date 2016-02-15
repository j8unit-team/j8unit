package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.FormattableFlags class java.util.FormattableFlags}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FormattableFlagsClassTests}.
 * </p>
 *
 * @see java.util.FormattableFlags class java.util.FormattableFlags (the hereby targeted class-under-test class)
 * @see FormattableFlagsClassTests FormattableFlagsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormattableFlagsTests<SUT extends java.util.FormattableFlags>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
