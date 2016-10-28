package org.j8unit.repository.javax.management;

import javax.management.NotificationEmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationEmitterTest
implements org.j8unit.repository.javax.management.NotificationEmitterTests<NotificationEmitter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationEmitter]

    @Override
    public NotificationEmitter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.NotificationEmitter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationEmitter]

}
