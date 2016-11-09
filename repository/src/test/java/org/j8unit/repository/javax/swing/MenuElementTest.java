package org.j8unit.repository.javax.swing;

import javax.swing.MenuElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuElement} (by simply reusing the
 * J8Unit test interface {@link MenuElementTests}).
 */

@RunWith(J8Unit4.class)
public class MenuElementTest
implements MenuElementTests<MenuElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.MenuElement]

    @Override
    public MenuElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.MenuElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.MenuElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.MenuElement]

}
