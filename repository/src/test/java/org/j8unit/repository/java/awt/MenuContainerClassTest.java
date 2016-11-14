package org.j8unit.repository.java.awt;

import java.awt.MenuContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuContainer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.MenuContainerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuContainerClassTest
implements MenuContainerClassTests<MenuContainer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.MenuContainer]

    @Override
    public Class<MenuContainer> createNewSUT() {
        return MenuContainer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.MenuContainer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.MenuContainer]

}
