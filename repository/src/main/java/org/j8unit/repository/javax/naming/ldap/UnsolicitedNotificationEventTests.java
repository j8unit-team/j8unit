package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.UnsolicitedNotificationEvent class
 * javax.naming.ldap.UnsolicitedNotificationEvent}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnsolicitedNotificationEventClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.UnsolicitedNotificationEvent class javax.naming.ldap.UnsolicitedNotificationEvent (the hereby
 *      targeted class-under-test class)
 * @see UnsolicitedNotificationEventClassTests UnsolicitedNotificationEventClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsolicitedNotificationEventTests<SUT extends javax.naming.ldap.UnsolicitedNotificationEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.UnsolicitedNotificationEvent#getNotification() public
     * javax.naming.ldap.UnsolicitedNotification javax.naming.ldap.UnsolicitedNotificationEvent.getNotification()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.UnsolicitedNotificationEvent#getNotification() public
     * javax.naming.ldap.UnsolicitedNotification javax.naming.ldap.UnsolicitedNotificationEvent.getNotification()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.UnsolicitedNotificationEvent#getNotification() public
     *      javax.naming.ldap.UnsolicitedNotification javax.naming.ldap.UnsolicitedNotificationEvent.getNotification()
     *      (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link javax.naming.ldap.UnsolicitedNotificationEvent#dispatch(javax.naming.ldap.UnsolicitedNotificationListener)
     * public void
     * javax.naming.ldap.UnsolicitedNotificationEvent.dispatch(javax.naming.ldap.UnsolicitedNotificationListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.ldap.UnsolicitedNotificationEvent#dispatch(javax.naming.ldap.UnsolicitedNotificationListener)
     * public void
     * javax.naming.ldap.UnsolicitedNotificationEvent.dispatch(javax.naming.ldap.UnsolicitedNotificationListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.UnsolicitedNotificationEvent#dispatch(javax.naming.ldap.UnsolicitedNotificationListener)
     *      public void
     *      javax.naming.ldap.UnsolicitedNotificationEvent.dispatch(javax.naming.ldap.UnsolicitedNotificationListener)
     *      (the hereby targeted method-under-test)
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

}
