package org.j8unit.repository.javax.swing.event;

import javax.swing.event.InternalFrameListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InternalFrameListener} (by simply
 * reusing the J8Unit test interface {@link InternalFrameListenerTests}).
 */

@RunWith(J8Unit4.class)
public class InternalFrameListenerTest
implements InternalFrameListenerTests<InternalFrameListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.InternalFrameListener]

    @Override
    public InternalFrameListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.InternalFrameListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.InternalFrameListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.InternalFrameListener]

}
