package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseWheelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseWheelListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.event.MouseWheelListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MouseWheelListenerClassTest
implements MouseWheelListenerClassTests<MouseWheelListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.MouseWheelListener]

    @Override
    public Class<MouseWheelListener> createNewSUT() {
        return MouseWheelListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.MouseWheelListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.MouseWheelListener]

}
