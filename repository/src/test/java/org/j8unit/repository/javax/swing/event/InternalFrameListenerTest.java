package org.j8unit.repository.javax.swing.event;

import javax.swing.event.InternalFrameListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InternalFrameListenerTest
implements org.j8unit.repository.javax.swing.event.InternalFrameListenerTests<InternalFrameListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.InternalFrameListener]

    @Override
    public InternalFrameListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.InternalFrameListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.InternalFrameListener]

}
