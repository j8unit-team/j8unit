package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuKeyEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuKeyEventTest
implements org.j8unit.repository.javax.swing.event.MenuKeyEventTests<MenuKeyEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.MenuKeyEvent]

    @Override
    public MenuKeyEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.MenuKeyEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.MenuKeyEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.MenuKeyEvent]

}
