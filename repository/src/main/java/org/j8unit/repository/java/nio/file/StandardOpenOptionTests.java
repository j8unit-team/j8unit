package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.StandardOpenOption class java.nio.file.StandardOpenOption}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StandardOpenOptionClassTests}
 * .
 * </p>
 *
 * @see java.nio.file.StandardOpenOption class java.nio.file.StandardOpenOption (the hereby targeted class-under-test
 *      class)
 * @see StandardOpenOptionClassTests StandardOpenOptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardOpenOptionTests<SUT extends java.nio.file.StandardOpenOption>
extends OpenOptionTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.StandardOpenOption> {

}
