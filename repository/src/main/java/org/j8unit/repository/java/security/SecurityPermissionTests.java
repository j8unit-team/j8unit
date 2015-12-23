package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.SecurityPermission class
 * java.security.SecurityPermission}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.SecurityPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.SecurityPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.SecurityPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecurityPermissionTests<SUT extends java.security.SecurityPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
