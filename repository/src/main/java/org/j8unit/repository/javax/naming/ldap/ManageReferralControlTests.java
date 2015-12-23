package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.ManageReferralControl class
 * javax.naming.ldap.ManageReferralControl}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.ldap.ManageReferralControlTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ldap.ManageReferralControlClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.ManageReferralControl
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManageReferralControlTests<SUT extends javax.naming.ldap.ManageReferralControl>
extends org.j8unit.repository.javax.naming.ldap.BasicControlTests<SUT> {

}
