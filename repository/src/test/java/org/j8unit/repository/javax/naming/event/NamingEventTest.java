package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingEventTest
implements org.j8unit.repository.javax.naming.event.NamingEventTests<javax.naming.event.NamingEvent> {

    @Override
    public javax.naming.event.NamingEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.event.NamingEvent] available.");
    }

}
