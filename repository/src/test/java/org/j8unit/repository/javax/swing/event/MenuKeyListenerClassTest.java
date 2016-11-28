package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuKeyListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuKeyListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.MenuKeyListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MenuKeyListenerClassTest
implements MenuKeyListenerClassTests<MenuKeyListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuKeyListener]

    @Override
    public Class<MenuKeyListener> createNewSUT() {
        return MenuKeyListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuKeyListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuKeyListener]

}
