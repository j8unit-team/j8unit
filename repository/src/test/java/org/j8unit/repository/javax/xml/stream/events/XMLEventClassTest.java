package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.XMLEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventClassTest
implements org.j8unit.repository.javax.xml.stream.events.XMLEventClassTests<XMLEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.XMLEvent]

    @Override
    public Class<XMLEvent> createNewSUT() {
        return XMLEvent.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.XMLEvent]

}
