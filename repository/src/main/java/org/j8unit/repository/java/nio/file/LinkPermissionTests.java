package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.LinkPermission class java.nio.file.LinkPermission}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LinkPermissionClassTests}.
 * </p>
 *
 * @see java.nio.file.LinkPermission class java.nio.file.LinkPermission (the hereby targeted class-under-test class)
 * @see LinkPermissionClassTests LinkPermissionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkPermissionTests<SUT extends java.nio.file.LinkPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
