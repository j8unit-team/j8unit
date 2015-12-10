package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.UIEventClassTests<org.w3c.dom.events.UIEvent> {

    @Override
    public Class<org.w3c.dom.events.UIEvent> createNewSUT() {
        return org.w3c.dom.events.UIEvent.class;
    }

}
