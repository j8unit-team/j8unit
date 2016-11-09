package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.XMLEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLEvent} (by simply reusing the J8Unit
 * test interface {@link XMLEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEventClassTest
implements XMLEventClassTests<XMLEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.XMLEvent]

    @Override
    public Class<XMLEvent> createNewSUT() {
        return XMLEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.XMLEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.XMLEvent]

}
