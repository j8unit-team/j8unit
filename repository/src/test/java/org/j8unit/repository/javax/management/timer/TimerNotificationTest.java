package org.j8unit.repository.javax.management.timer;

import javax.management.timer.TimerNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerNotificationTest
implements org.j8unit.repository.javax.management.timer.TimerNotificationTests<TimerNotification> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.timer.TimerNotification]

    @Override
    public TimerNotification createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.timer.TimerNotification], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.timer.TimerNotification]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.timer.TimerNotification]

}
