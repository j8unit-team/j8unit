package org.j8unit.repository.java.awt.event;

import java.awt.event.AWTEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AWTEventListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.AWTEventListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class AWTEventListenerClassTest
implements AWTEventListenerClassTests<AWTEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.AWTEventListener]

    @Override
    public Class<AWTEventListener> createNewSUT() {
        return AWTEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.AWTEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.AWTEventListener]

}
