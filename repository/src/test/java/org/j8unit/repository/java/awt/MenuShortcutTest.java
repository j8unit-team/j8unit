package org.j8unit.repository.java.awt;

import java.awt.MenuShortcut;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuShortcut} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.MenuShortcutTests}).
 */

@RunWith(J8Unit4.class)
public class MenuShortcutTest
implements MenuShortcutTests<MenuShortcut> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MenuShortcut]

    @Override
    public MenuShortcut createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.MenuShortcut], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MenuShortcut]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MenuShortcut]

}
