package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.MouseEvent;

@RunWith(J8Unit4.class)
public class MouseEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.MouseEventClassTests<MouseEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.MouseEvent]

    @Override
    public Class<MouseEvent> createNewSUT() {
        return MouseEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.MouseEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.MouseEvent]

}
