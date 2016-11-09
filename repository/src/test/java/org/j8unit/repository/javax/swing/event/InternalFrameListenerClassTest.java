package org.j8unit.repository.javax.swing.event;

import javax.swing.event.InternalFrameListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InternalFrameListener} (by simply reusing
 * the J8Unit test interface {@link InternalFrameListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class InternalFrameListenerClassTest
implements InternalFrameListenerClassTests<InternalFrameListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.InternalFrameListener]

    @Override
    public Class<InternalFrameListener> createNewSUT() {
        return InternalFrameListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.InternalFrameListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.InternalFrameListener]

}
