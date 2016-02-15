package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.StandardCopyOption class java.nio.file.StandardCopyOption}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StandardCopyOptionClassTests}
 * .
 * </p>
 *
 * @see java.nio.file.StandardCopyOption class java.nio.file.StandardCopyOption (the hereby targeted class-under-test
 *      class)
 * @see StandardCopyOptionClassTests StandardCopyOptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StandardCopyOptionTests<SUT extends java.nio.file.StandardCopyOption>
extends CopyOptionTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.StandardCopyOption> {

}
