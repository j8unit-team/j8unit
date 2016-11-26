package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowFocusListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WindowFocusListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.WindowFocusListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class WindowFocusListenerClassTest
implements WindowFocusListenerClassTests<WindowFocusListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.WindowFocusListener]

    @Override
    public Class<WindowFocusListener> createNewSUT() {
        return WindowFocusListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.WindowFocusListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.WindowFocusListener]

}
