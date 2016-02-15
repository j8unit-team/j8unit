package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.ManageReferralControl class
 * javax.naming.ldap.ManageReferralControl}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ManageReferralControlClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.ManageReferralControl class javax.naming.ldap.ManageReferralControl (the hereby targeted
 *      class-under-test class)
 * @see ManageReferralControlClassTests ManageReferralControlClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManageReferralControlTests<SUT extends javax.naming.ldap.ManageReferralControl>
extends BasicControlTests<SUT> {

}
