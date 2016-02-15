package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.charset.StandardCharsets class java.nio.charset.StandardCharsets}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link StandardCharsetsClassTests}
 * .
 * </p>
 *
 * @see java.nio.charset.StandardCharsets class java.nio.charset.StandardCharsets (the hereby targeted class-under-test
 *      class)
 * @see StandardCharsetsClassTests StandardCharsetsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardCharsetsTests<SUT extends java.nio.charset.StandardCharsets>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
