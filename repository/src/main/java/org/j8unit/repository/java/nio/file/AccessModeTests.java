package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.AccessMode class java.nio.file.AccessMode}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AccessModeClassTests}.
 * </p>
 *
 * @see java.nio.file.AccessMode class java.nio.file.AccessMode (the hereby targeted class-under-test class)
 * @see AccessModeClassTests AccessModeClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessModeTests<SUT extends java.nio.file.AccessMode>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.AccessMode> {

}
