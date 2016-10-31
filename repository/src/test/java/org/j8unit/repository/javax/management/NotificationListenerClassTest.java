package org.j8unit.repository.javax.management;

import javax.management.NotificationListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationListenerClassTest
implements org.j8unit.repository.javax.management.NotificationListenerClassTests<NotificationListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationListener]

    @Override
    public Class<NotificationListener> createNewSUT() {
        return NotificationListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationListener]

}
