package org.j8unit.repository.javax.management;

import javax.management.NotificationListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotificationListener} (by simply
 * reusing the J8Unit test interface {@link NotificationListenerTests}).
 */

@RunWith(J8Unit4.class)
public class NotificationListenerTest
implements NotificationListenerTests<NotificationListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationListener]

    @Override
    public NotificationListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.NotificationListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.NotificationListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.NotificationListener]

}
