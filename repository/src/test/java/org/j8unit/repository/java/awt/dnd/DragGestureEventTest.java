package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragGestureEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragGestureEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragGestureEventTests}).
 */
@RunWith(J8Unit4.class)
public class DragGestureEventTest
implements DragGestureEventTests<DragGestureEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragGestureEvent]

    @Override
    public DragGestureEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.dnd.DragGestureEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragGestureEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragGestureEvent]

}
