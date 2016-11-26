package org.j8unit.repository.java.util;

import java.util.EventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.EventListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements EventListenerClassTests<EventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.EventListener]

    @Override
    public Class<EventListener> createNewSUT() {
        return EventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.EventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.EventListener]

}
