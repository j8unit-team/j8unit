package org.j8unit.repository.javax.naming.event;

import javax.naming.event.EventContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventContextTest
implements org.j8unit.repository.javax.naming.event.EventContextTests<EventContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.EventContext]

    @Override
    public EventContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.event.EventContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.event.EventContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.event.EventContext]

}
