package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragGestureListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragGestureListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragGestureListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DragGestureListenerClassTest
implements DragGestureListenerClassTests<DragGestureListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragGestureListener]

    @Override
    public Class<DragGestureListener> createNewSUT() {
        return DragGestureListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragGestureListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragGestureListener]

}
