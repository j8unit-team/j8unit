package org.j8unit.repository.javax.swing.event;

import javax.swing.event.PopupMenuEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PopupMenuEvent} (by simply reusing
 * the J8Unit test interface {@link PopupMenuEventTests}).
 */

@RunWith(J8Unit4.class)
public class PopupMenuEventTest
implements PopupMenuEventTests<PopupMenuEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

    @Override
    public PopupMenuEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.PopupMenuEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

}
