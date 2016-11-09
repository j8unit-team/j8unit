package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotificationListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsolicitedNotificationListener} (by
 * simply reusing the J8Unit test interface {@link UnsolicitedNotificationListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationListenerClassTest
implements UnsolicitedNotificationListenerClassTests<UnsolicitedNotificationListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

    @Override
    public Class<UnsolicitedNotificationListener> createNewSUT() {
        return UnsolicitedNotificationListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

}
