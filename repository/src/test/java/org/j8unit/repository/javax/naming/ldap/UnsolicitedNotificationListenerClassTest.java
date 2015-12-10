package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationListenerClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationListenerClassTests<javax.naming.ldap.UnsolicitedNotificationListener> {

    @Override
    public Class<javax.naming.ldap.UnsolicitedNotificationListener> createNewSUT() {
        return javax.naming.ldap.UnsolicitedNotificationListener.class;
    }

}
