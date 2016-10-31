package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuListenerClassTest
implements org.j8unit.repository.javax.swing.event.MenuListenerClassTests<MenuListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuListener]

    @Override
    public Class<MenuListener> createNewSUT() {
        return MenuListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuListener]

}
