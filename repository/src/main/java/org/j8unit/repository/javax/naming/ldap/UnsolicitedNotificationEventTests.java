package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.UnsolicitedNotificationEvent class
 * javax.naming.ldap.UnsolicitedNotificationEvent}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnsolicitedNotificationEventTests<SUT extends javax.naming.ldap.UnsolicitedNotificationEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.ldap.UnsolicitedNotificationEvent#dispatch(javax.naming.ldap.UnsolicitedNotificationListener)
     * public void
     * javax.naming.ldap.UnsolicitedNotificationEvent.dispatch(javax.naming.ldap.UnsolicitedNotificationListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatch_UnsolicitedNotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.UnsolicitedNotificationEvent#getNotification() public
     * javax.naming.ldap.UnsolicitedNotification javax.naming.ldap.UnsolicitedNotificationEvent.getNotification()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
