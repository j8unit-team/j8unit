package org.j8unit.repository.javax.management.timer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerNotificationClassTest
implements org.j8unit.repository.javax.management.timer.TimerNotificationClassTests<javax.management.timer.TimerNotification> {

    @Override
    public Class<javax.management.timer.TimerNotification> createNewSUT() {
        return javax.management.timer.TimerNotification.class;
    }

}
