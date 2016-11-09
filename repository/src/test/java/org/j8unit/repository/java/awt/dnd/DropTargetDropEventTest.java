package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetDropEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DropTargetDropEvent} (by simply
 * reusing the J8Unit test interface {@link DropTargetDropEventTests}).
 */

@RunWith(J8Unit4.class)
public class DropTargetDropEventTest
implements DropTargetDropEventTests<DropTargetDropEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DropTargetDropEvent]

    @Override
    public DropTargetDropEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.dnd.DropTargetDropEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DropTargetDropEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DropTargetDropEvent]

}
