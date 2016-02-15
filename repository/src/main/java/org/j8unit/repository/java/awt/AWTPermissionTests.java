package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.AWTPermission class java.awt.AWTPermission}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link AWTPermissionClassTests}.
 * </p>
 *
 * @see java.awt.AWTPermission class java.awt.AWTPermission (the hereby targeted class-under-test class)
 * @see AWTPermissionClassTests AWTPermissionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTPermissionTests<SUT extends java.awt.AWTPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
