package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.DocumentEvent;

@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.DocumentEventClassTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

    @Override
    public Class<DocumentEvent> createNewSUT() {
        return DocumentEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

}
