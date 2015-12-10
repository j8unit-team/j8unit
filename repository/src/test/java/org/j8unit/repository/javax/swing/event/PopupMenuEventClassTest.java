package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupMenuEventClassTest
implements org.j8unit.repository.javax.swing.event.PopupMenuEventClassTests<javax.swing.event.PopupMenuEvent> {

    @Override
    public Class<javax.swing.event.PopupMenuEvent> createNewSUT() {
        return javax.swing.event.PopupMenuEvent.class;
    }

}
