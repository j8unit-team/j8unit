package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.format.FormatStyle class java.time.format.FormatStyle},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.format.FormatStyleTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.format.FormatStyleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.format.FormatStyle
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatStyleTests<SUT extends java.time.format.FormatStyle>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.time.format.FormatStyle> {

}
