package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.format.FormatStyle class java.time.format.FormatStyle}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FormatStyleClassTests}.
 * </p>
 *
 * @see java.time.format.FormatStyle class java.time.format.FormatStyle (the hereby targeted class-under-test class)
 * @see FormatStyleClassTests FormatStyleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatStyleTests<SUT extends java.time.format.FormatStyle>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.time.format.FormatStyle> {

}
