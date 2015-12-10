package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.DocumentEventClassTests<org.w3c.dom.events.DocumentEvent> {

    @Override
    public Class<org.w3c.dom.events.DocumentEvent> createNewSUT() {
        return org.w3c.dom.events.DocumentEvent.class;
    }

}
