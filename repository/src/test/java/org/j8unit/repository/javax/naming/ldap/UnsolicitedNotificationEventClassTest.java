package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsolicitedNotificationEventClassTest
implements org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationEventClassTests<javax.naming.ldap.UnsolicitedNotificationEvent> {

    @Override
    public Class<javax.naming.ldap.UnsolicitedNotificationEvent> createNewSUT() {
        return javax.naming.ldap.UnsolicitedNotificationEvent.class;
    }

}
