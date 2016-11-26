package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuDragMouseEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuDragMouseEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.MenuDragMouseEventTests}).
 */
@RunWith(J8Unit4.class)
public class MenuDragMouseEventTest
implements MenuDragMouseEventTests<MenuDragMouseEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.MenuDragMouseEvent]

    @Override
    public MenuDragMouseEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.MenuDragMouseEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.MenuDragMouseEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.MenuDragMouseEvent]

}
