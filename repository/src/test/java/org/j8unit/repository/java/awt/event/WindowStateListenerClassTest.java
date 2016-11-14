package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowStateListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WindowStateListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.WindowStateListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class WindowStateListenerClassTest
implements WindowStateListenerClassTests<WindowStateListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.WindowStateListener]

    @Override
    public Class<WindowStateListener> createNewSUT() {
        return WindowStateListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.WindowStateListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.WindowStateListener]

}
