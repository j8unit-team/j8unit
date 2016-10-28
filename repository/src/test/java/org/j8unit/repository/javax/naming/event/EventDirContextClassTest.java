package org.j8unit.repository.javax.naming.event;

import javax.naming.event.EventDirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventDirContextClassTest
implements org.j8unit.repository.javax.naming.event.EventDirContextClassTests<EventDirContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.EventDirContext]

    @Override
    public Class<EventDirContext> createNewSUT() {
        return EventDirContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.EventDirContext]

}
