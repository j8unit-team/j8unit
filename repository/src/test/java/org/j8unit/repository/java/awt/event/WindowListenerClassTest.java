package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WindowListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.WindowListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class WindowListenerClassTest
implements WindowListenerClassTests<WindowListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.WindowListener]

    @Override
    public Class<WindowListener> createNewSUT() {
        return WindowListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.WindowListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.WindowListener]

}
