package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceDragEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragSourceDragEvent} (by simply
 * reusing the J8Unit test interface {@link DragSourceDragEventTests}).
 */

@RunWith(J8Unit4.class)
public class DragSourceDragEventTest
implements DragSourceDragEventTests<DragSourceDragEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragSourceDragEvent]

    @Override
    public DragSourceDragEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.dnd.DragSourceDragEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragSourceDragEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragSourceDragEvent]

}
