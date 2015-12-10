package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuListenerClassTest
implements org.j8unit.repository.javax.swing.event.MenuListenerClassTests<javax.swing.event.MenuListener> {

    @Override
    public Class<javax.swing.event.MenuListener> createNewSUT() {
        return javax.swing.event.MenuListener.class;
    }

}
