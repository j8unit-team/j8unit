package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.UnsolicitedNotification interface javax.naming.ldap.UnsolicitedNotification},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsolicitedNotificationTests<SUT extends javax.naming.ldap.UnsolicitedNotification>
extends org.j8unit.repository.javax.naming.ldap.ExtendedResponseTests<SUT>, org.j8unit.repository.javax.naming.ldap.HasControlsTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.UnsolicitedNotification#getException() public abstract
     * javax.naming.NamingException javax.naming.ldap.UnsolicitedNotification.getException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.UnsolicitedNotification#getReferrals() public abstract
     * java.lang.String[] javax.naming.ldap.UnsolicitedNotification.getReferrals()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferrals()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
