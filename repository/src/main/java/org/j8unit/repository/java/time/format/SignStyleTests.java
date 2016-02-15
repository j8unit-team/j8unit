package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.format.SignStyle class java.time.format.SignStyle}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SignStyleClassTests}.
 * </p>
 *
 * @see java.time.format.SignStyle class java.time.format.SignStyle (the hereby targeted class-under-test class)
 * @see SignStyleClassTests SignStyleClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignStyleTests<SUT extends java.time.format.SignStyle>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.time.format.SignStyle> {

}
