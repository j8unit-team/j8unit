package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingPermission;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.security.BasicPermissionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link LoggingPermission public final class java.util.logging.LoggingPermission}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.util.logging.LoggingPermissionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoggingPermissionTests<SUT extends LoggingPermission>
extends BasicPermissionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LoggingPermission]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.LoggingPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.LoggingPermission]

}
