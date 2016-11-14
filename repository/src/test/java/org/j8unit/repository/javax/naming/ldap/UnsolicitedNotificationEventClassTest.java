package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotificationEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsolicitedNotificationEvent} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationEventClassTest
implements UnsolicitedNotificationEventClassTests<UnsolicitedNotificationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationEvent]

    @Override
    public Class<UnsolicitedNotificationEvent> createNewSUT() {
        return UnsolicitedNotificationEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.UnsolicitedNotificationEvent#UnsolicitedNotificationEvent(Object, javax.naming.ldap.UnsolicitedNotification)
     * public
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
                                                       // javax.naming.ldap.UnsolicitedNotification);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationEvent]

}
