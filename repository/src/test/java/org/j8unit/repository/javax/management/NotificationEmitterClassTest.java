package org.j8unit.repository.javax.management;

import javax.management.NotificationEmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationEmitterClassTest
implements org.j8unit.repository.javax.management.NotificationEmitterClassTests<NotificationEmitter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationEmitter]

    @Override
    public Class<NotificationEmitter> createNewSUT() {
        return NotificationEmitter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationEmitter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationEmitter]

}
