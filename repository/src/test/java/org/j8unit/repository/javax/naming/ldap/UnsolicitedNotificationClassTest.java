package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationClassTests<javax.naming.ldap.UnsolicitedNotification> {

    @Override
    public Class<javax.naming.ldap.UnsolicitedNotification> createNewSUT() {
        return javax.naming.ldap.UnsolicitedNotification.class;
    }

}
