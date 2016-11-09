package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseMotionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseMotionListener} (by simply reusing
 * the J8Unit test interface {@link MouseMotionListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MouseMotionListenerClassTest
implements MouseMotionListenerClassTests<MouseMotionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.MouseMotionListener]

    @Override
    public Class<MouseMotionListener> createNewSUT() {
        return MouseMotionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.MouseMotionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.MouseMotionListener]

}
