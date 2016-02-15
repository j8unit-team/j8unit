package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.logging.LoggingPermission class
 * java.util.logging.LoggingPermission}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link LoggingPermissionClassTests}.
 * </p>
 *
 * @see java.util.logging.LoggingPermission class java.util.logging.LoggingPermission (the hereby targeted
 *      class-under-test class)
 * @see LoggingPermissionClassTests LoggingPermissionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoggingPermissionTests<SUT extends java.util.logging.LoggingPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
