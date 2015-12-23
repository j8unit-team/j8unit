package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.remote.SubjectDelegationPermission class
 * javax.management.remote.SubjectDelegationPermission}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.remote.SubjectDelegationPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.remote.SubjectDelegationPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.remote.SubjectDelegationPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SubjectDelegationPermissionTests<SUT extends javax.management.remote.SubjectDelegationPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
