package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotificationListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationListenerClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationListenerClassTests<UnsolicitedNotificationListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

    @Override
    public Class<UnsolicitedNotificationListener> createNewSUT() {
        return UnsolicitedNotificationListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.UnsolicitedNotificationListener]

}
