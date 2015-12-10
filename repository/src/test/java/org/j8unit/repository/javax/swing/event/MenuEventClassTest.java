package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuEventClassTest
implements org.j8unit.repository.javax.swing.event.MenuEventClassTests<javax.swing.event.MenuEvent> {

    @Override
    public Class<javax.swing.event.MenuEvent> createNewSUT() {
        return javax.swing.event.MenuEvent.class;
    }

}
