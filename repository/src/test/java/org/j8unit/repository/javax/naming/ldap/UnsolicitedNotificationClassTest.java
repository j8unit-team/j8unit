package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationClassTests<UnsolicitedNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

    @Override
    public Class<UnsolicitedNotification> createNewSUT() {
        return UnsolicitedNotification.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotification]

}
