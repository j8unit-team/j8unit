package org.j8unit.repository.javax.security.auth;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.AuthPermission class
 * javax.security.auth.AuthPermission}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link AuthPermissionClassTests}.
 * </p>
 *
 * @see javax.security.auth.AuthPermission class javax.security.auth.AuthPermission (the hereby targeted
 *      class-under-test class)
 * @see AuthPermissionClassTests AuthPermissionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AuthPermissionTests<SUT extends javax.security.auth.AuthPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
