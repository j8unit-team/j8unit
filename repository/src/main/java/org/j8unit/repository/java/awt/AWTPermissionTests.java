package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.AWTPermission class java.awt.AWTPermission}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.AWTPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.AWTPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.AWTPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTPermissionTests<SUT extends java.awt.AWTPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
