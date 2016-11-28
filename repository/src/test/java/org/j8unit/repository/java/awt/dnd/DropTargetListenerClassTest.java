package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTargetListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DropTargetListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DropTargetListenerClassTest
implements DropTargetListenerClassTests<DropTargetListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DropTargetListener]

    @Override
    public Class<DropTargetListener> createNewSUT() {
        return DropTargetListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DropTargetListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DropTargetListener]

}
