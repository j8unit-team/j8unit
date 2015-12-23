package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests<javax.swing.event.DocumentEvent> {

    @Override
    public Class<javax.swing.event.DocumentEvent> createNewSUT() {
        return javax.swing.event.DocumentEvent.class;
    }

    @RunWith(J8Unit4.class)
    public static class ElementChangeClassTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests.ElementChangeClassTests<javax.swing.event.DocumentEvent.ElementChange> {

        @Override
        public Class<javax.swing.event.DocumentEvent.ElementChange> createNewSUT() {
            return javax.swing.event.DocumentEvent.ElementChange.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class EventTypeClassTest
    implements org.j8unit.repository.javax.swing.event.DocumentEventClassTests.EventTypeClassTests<javax.swing.event.DocumentEvent.EventType> {

        @Override
        public Class<javax.swing.event.DocumentEvent.EventType> createNewSUT() {
            return javax.swing.event.DocumentEvent.EventType.class;
        }

    }

}
