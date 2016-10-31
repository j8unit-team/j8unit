package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuKeyListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuKeyListenerTest
implements org.j8unit.repository.javax.swing.event.MenuKeyListenerTests<MenuKeyListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.MenuKeyListener]

    @Override
    public MenuKeyListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.MenuKeyListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.MenuKeyListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.MenuKeyListener]

}
