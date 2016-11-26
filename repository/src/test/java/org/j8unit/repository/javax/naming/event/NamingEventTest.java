package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.event.NamingEventTests}).
 */
@RunWith(J8Unit4.class)
public class NamingEventTest
implements NamingEventTests<NamingEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.NamingEvent]

    @Override
    public NamingEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.event.NamingEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.event.NamingEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.event.NamingEvent]

}
