package org.j8unit.repository.java.util;

import java.util.EventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EventListener} (by simply reusing the
 * J8Unit test interface {@link EventListenerTests}).
 */

@RunWith(J8Unit4.class)
public class EventListenerTest
implements EventListenerTests<EventListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EventListener]

    @Override
    public EventListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.EventListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.EventListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.EventListener]

}
