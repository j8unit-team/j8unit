package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceMotionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragSourceMotionListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceMotionListenerTests}).
 */

@RunWith(J8Unit4.class)
public class DragSourceMotionListenerTest
implements DragSourceMotionListenerTests<DragSourceMotionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragSourceMotionListener]

    @Override
    public DragSourceMotionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.dnd.DragSourceMotionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragSourceMotionListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragSourceMotionListener]

}
