package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingEventTest
implements org.j8unit.repository.javax.naming.event.NamingEventTests<NamingEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.NamingEvent]

    @Override
    public NamingEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.event.NamingEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.NamingEvent]

}
