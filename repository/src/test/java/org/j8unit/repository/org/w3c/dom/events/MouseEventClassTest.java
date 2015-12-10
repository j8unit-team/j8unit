package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.MouseEventClassTests<org.w3c.dom.events.MouseEvent> {

    @Override
    public Class<org.w3c.dom.events.MouseEvent> createNewSUT() {
        return org.w3c.dom.events.MouseEvent.class;
    }

}
