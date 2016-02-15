package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.SubjectDelegationPermission class
 * javax.management.remote.SubjectDelegationPermission}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link SubjectDelegationPermissionClassTests}.
 * </p>
 *
 * @see javax.management.remote.SubjectDelegationPermission class javax.management.remote.SubjectDelegationPermission
 *      (the hereby targeted class-under-test class)
 * @see SubjectDelegationPermissionClassTests SubjectDelegationPermissionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SubjectDelegationPermissionTests<SUT extends javax.management.remote.SubjectDelegationPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
