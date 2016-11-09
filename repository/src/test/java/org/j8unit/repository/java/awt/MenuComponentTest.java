package org.j8unit.repository.java.awt;

import java.awt.MenuComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuComponent} (by simply reusing the
 * J8Unit test interface {@link MenuComponentTests}).
 */

@RunWith(J8Unit4.class)
public class MenuComponentTest
implements MenuComponentTests<MenuComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MenuComponent]

    @Override
    public MenuComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.MenuComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MenuComponent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MenuComponent]

}
