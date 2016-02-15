package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.SecurityPermission class java.security.SecurityPermission}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link SecurityPermissionClassTests}
 * .
 * </p>
 *
 * @see java.security.SecurityPermission class java.security.SecurityPermission (the hereby targeted class-under-test
 *      class)
 * @see SecurityPermissionClassTests SecurityPermissionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecurityPermissionTests<SUT extends java.security.SecurityPermission>
extends BasicPermissionTests<SUT> {

}
