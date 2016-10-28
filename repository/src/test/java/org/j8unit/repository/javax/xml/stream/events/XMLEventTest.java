package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.XMLEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventTest
implements org.j8unit.repository.javax.xml.stream.events.XMLEventTests<XMLEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.XMLEvent]

    @Override
    public XMLEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.XMLEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.XMLEvent]

}
