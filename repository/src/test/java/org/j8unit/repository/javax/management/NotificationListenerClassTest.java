package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationListenerClassTest
implements org.j8unit.repository.javax.management.NotificationListenerClassTests<javax.management.NotificationListener> {

    @Override
    public Class<javax.management.NotificationListener> createNewSUT() {
        return javax.management.NotificationListener.class;
    }

}
