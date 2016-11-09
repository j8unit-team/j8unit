package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.DocumentEvent;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentEvent} (by simply reusing the
 * J8Unit test interface {@link DocumentEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements DocumentEventClassTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

    @Override
    public Class<DocumentEvent> createNewSUT() {
        return DocumentEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.DocumentEvent]

}
