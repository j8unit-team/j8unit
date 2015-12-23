package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.charset.StandardCharsets class
 * java.nio.charset.StandardCharsets}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.charset.StandardCharsetsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.charset.StandardCharsetsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.charset.StandardCharsets
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardCharsetsTests<SUT extends java.nio.charset.StandardCharsets>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
