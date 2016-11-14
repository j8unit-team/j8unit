package org.j8unit.repository.javax.naming.event;

import javax.naming.event.EventDirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventDirContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.event.EventDirContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class EventDirContextClassTest
implements EventDirContextClassTests<EventDirContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.EventDirContext]

    @Override
    public Class<EventDirContext> createNewSUT() {
        return EventDirContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.EventDirContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.EventDirContext]

}
