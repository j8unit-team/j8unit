package org.j8unit.repository.javax.management;

import javax.management.NotificationEmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotificationEmitter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationEmitterClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotificationEmitterClassTest
implements NotificationEmitterClassTests<NotificationEmitter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationEmitter]

    @Override
    public Class<NotificationEmitter> createNewSUT() {
        return NotificationEmitter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationEmitter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationEmitter]

}
