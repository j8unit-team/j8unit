package org.j8unit.repository.javax.swing.event;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentEvent.EventType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.DocumentEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentEventClassTest
implements DocumentEventClassTests<DocumentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent]

    @Override
    public Class<DocumentEvent> createNewSUT() {
        return DocumentEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ElementChange} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.event.DocumentEventClassTests.ElementChangeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ElementChangeClassTest
    implements ElementChangeClassTests<ElementChange> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

        @Override
        public Class<ElementChange> createNewSUT() {
            return ElementChange.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent$ElementChange]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link EventType} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.event.DocumentEventClassTests.EventTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class EventTypeClassTest
    implements EventTypeClassTests<EventType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

        @Override
        public Class<EventType> createNewSUT() {
            return EventType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentEvent$EventType]

    }

}
