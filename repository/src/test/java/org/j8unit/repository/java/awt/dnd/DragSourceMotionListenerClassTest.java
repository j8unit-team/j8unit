package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceMotionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSourceMotionListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceMotionListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DragSourceMotionListenerClassTest
implements DragSourceMotionListenerClassTests<DragSourceMotionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSourceMotionListener]

    @Override
    public Class<DragSourceMotionListener> createNewSUT() {
        return DragSourceMotionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragSourceMotionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSourceMotionListener]

}
