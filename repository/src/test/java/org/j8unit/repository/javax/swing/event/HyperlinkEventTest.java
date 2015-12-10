package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HyperlinkEventTest
implements org.j8unit.repository.javax.swing.event.HyperlinkEventTests<javax.swing.event.HyperlinkEvent> {

    @RunWith(J8Unit4.class)
    public static class EventTypeTest
    implements org.j8unit.repository.javax.swing.event.HyperlinkEventTests.EventTypeTests<javax.swing.event.HyperlinkEvent.EventType> {

        @Override
        public javax.swing.event.HyperlinkEvent.EventType createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.event.HyperlinkEvent.EventType] available.");
        }

    }

    @Override
    public javax.swing.event.HyperlinkEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.event.HyperlinkEvent] available.");
    }

}
