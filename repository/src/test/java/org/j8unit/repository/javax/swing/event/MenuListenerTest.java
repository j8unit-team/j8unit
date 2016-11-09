package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuListener} (by simply reusing the
 * J8Unit test interface {@link MenuListenerTests}).
 */

@RunWith(J8Unit4.class)
public class MenuListenerTest
implements MenuListenerTests<MenuListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.MenuListener]

    @Override
    public MenuListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.MenuListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.MenuListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.MenuListener]

}
