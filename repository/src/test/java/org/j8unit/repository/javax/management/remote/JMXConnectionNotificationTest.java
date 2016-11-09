package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectionNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXConnectionNotification} (by simply
 * reusing the J8Unit test interface {@link JMXConnectionNotificationTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectionNotificationTest
implements JMXConnectionNotificationTests<JMXConnectionNotification> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectionNotification]

    @Override
    public JMXConnectionNotification createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.JMXConnectionNotification], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXConnectionNotification]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnectionNotification]

}
