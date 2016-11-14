package org.j8unit.repository.javax.management;

import javax.management.NotificationListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotificationListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotificationListenerClassTest
implements NotificationListenerClassTests<NotificationListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationListener]

    @Override
    public Class<NotificationListener> createNewSUT() {
        return NotificationListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationListener]

}
