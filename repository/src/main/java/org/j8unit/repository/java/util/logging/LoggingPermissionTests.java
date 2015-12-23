package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.logging.LoggingPermission class
 * java.util.logging.LoggingPermission}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.LoggingPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.logging.LoggingPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.logging.LoggingPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoggingPermissionTests<SUT extends java.util.logging.LoggingPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
