package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsolicitedNotification} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationClassTest
implements UnsolicitedNotificationClassTests<UnsolicitedNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

    @Override
    public Class<UnsolicitedNotification> createNewSUT() {
        return UnsolicitedNotification.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

}
