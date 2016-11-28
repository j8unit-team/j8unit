package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuDragMouseListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuDragMouseListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.MenuDragMouseListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MenuDragMouseListenerClassTest
implements MenuDragMouseListenerClassTests<MenuDragMouseListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuDragMouseListener]

    @Override
    public Class<MenuDragMouseListener> createNewSUT() {
        return MenuDragMouseListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuDragMouseListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuDragMouseListener]

}
