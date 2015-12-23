package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HyperlinkEventClassTest
implements org.j8unit.repository.javax.swing.event.HyperlinkEventClassTests<javax.swing.event.HyperlinkEvent> {

    @Override
    public Class<javax.swing.event.HyperlinkEvent> createNewSUT() {
        return javax.swing.event.HyperlinkEvent.class;
    }

    @RunWith(J8Unit4.class)
    public static class EventTypeClassTest
    implements org.j8unit.repository.javax.swing.event.HyperlinkEventClassTests.EventTypeClassTests<javax.swing.event.HyperlinkEvent.EventType> {

        @Override
        public Class<javax.swing.event.HyperlinkEvent.EventType> createNewSUT() {
            return javax.swing.event.HyperlinkEvent.EventType.class;
        }

    }

}
