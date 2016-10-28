package org.j8unit.repository.javax.swing.event;

import javax.swing.event.InternalFrameListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InternalFrameListenerClassTest
implements org.j8unit.repository.javax.swing.event.InternalFrameListenerClassTests<InternalFrameListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.InternalFrameListener]

    @Override
    public Class<InternalFrameListener> createNewSUT() {
        return InternalFrameListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.InternalFrameListener]

}
