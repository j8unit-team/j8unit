package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.NetPermission class java.net.NetPermission}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.net.NetPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.net.NetPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.NetPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NetPermissionTests<SUT extends java.net.NetPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
