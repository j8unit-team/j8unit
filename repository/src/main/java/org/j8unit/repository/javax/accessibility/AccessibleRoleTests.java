package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleRole class
 * javax.accessibility.AccessibleRole}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link AccessibleRoleClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleRole class javax.accessibility.AccessibleRole (the hereby targeted
 *      class-under-test class)
 * @see AccessibleRoleClassTests AccessibleRoleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleRoleTests<SUT extends javax.accessibility.AccessibleRole>
extends AccessibleBundleTests<SUT> {

}
