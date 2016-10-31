package org.j8unit.repository.javax.naming.event;

import javax.naming.event.EventContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventContextClassTest
implements org.j8unit.repository.javax.naming.event.EventContextClassTests<EventContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.EventContext]

    @Override
    public Class<EventContext> createNewSUT() {
        return EventContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.EventContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.EventContext]

}
