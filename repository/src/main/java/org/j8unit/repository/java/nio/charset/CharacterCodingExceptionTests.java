package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.charset.CharacterCodingException class
 * java.nio.charset.CharacterCodingException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CharacterCodingExceptionClassTests}.
 * </p>
 *
 * @see java.nio.charset.CharacterCodingException class java.nio.charset.CharacterCodingException (the hereby targeted
 *      class-under-test class)
 * @see CharacterCodingExceptionClassTests CharacterCodingExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharacterCodingExceptionTests<SUT extends java.nio.charset.CharacterCodingException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
