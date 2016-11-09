package org.j8unit.repository.javax.swing;

import javax.swing.MenuElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuElement} (by simply reusing the
 * J8Unit test interface {@link MenuElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuElementClassTest
implements MenuElementClassTests<MenuElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.MenuElement]

    @Override
    public Class<MenuElement> createNewSUT() {
        return MenuElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.MenuElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.MenuElement]

}
