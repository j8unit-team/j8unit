package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.charset.CharacterCodingException class
 * java.nio.charset.CharacterCodingException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.charset.CharacterCodingExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.charset.CharacterCodingExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.charset.CharacterCodingException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharacterCodingExceptionTests<SUT extends java.nio.charset.CharacterCodingException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
