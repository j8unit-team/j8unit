package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.RoleStatus class
 * javax.management.relation.RoleStatus}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link RoleStatusClassTests}.
 * </p>
 *
 * @see javax.management.relation.RoleStatus class javax.management.relation.RoleStatus (the hereby targeted
 *      class-under-test class)
 * @see RoleStatusClassTests RoleStatusClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoleStatusTests<SUT extends javax.management.relation.RoleStatus>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
