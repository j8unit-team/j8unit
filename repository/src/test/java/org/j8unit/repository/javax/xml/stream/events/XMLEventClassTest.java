package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventClassTest
implements org.j8unit.repository.javax.xml.stream.events.XMLEventClassTests<javax.xml.stream.events.XMLEvent> {

    @Override
    public Class<javax.xml.stream.events.XMLEvent> createNewSUT() {
        return javax.xml.stream.events.XMLEvent.class;
    }

}
