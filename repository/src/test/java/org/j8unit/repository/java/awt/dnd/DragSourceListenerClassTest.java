package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSourceListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DragSourceListenerClassTest
implements DragSourceListenerClassTests<DragSourceListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSourceListener]

    @Override
    public Class<DragSourceListener> createNewSUT() {
        return DragSourceListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragSourceListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSourceListener]

}
