package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotification;
import javax.naming.ldap.UnsolicitedNotificationEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationEventClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationEventClassTests<UnsolicitedNotificationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationEvent]

    @Override
    public Class<UnsolicitedNotificationEvent> createNewSUT() {
        return UnsolicitedNotificationEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsolicitedNotificationEvent#UnsolicitedNotificationEvent(Object, UnsolicitedNotification) public
     * javax.naming.ldap.UnsolicitedNotificationEvent(java.lang.Object,javax.naming.ldap.UnsolicitedNotification)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_UnsolicitedNotificationEvent_Object_UnsolicitedNotification()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsolicitedNotificationEvent sut = null; // = new UnsolicitedNotificationEvent(Object,
                                                       // UnsolicitedNotification);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationEvent]

}
