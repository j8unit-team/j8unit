package org.j8unit.repository.java.util;

import java.util.EventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements org.j8unit.repository.java.util.EventListenerClassTests<EventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.EventListener]

    @Override
    public Class<EventListener> createNewSUT() {
        return EventListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.EventListener]

}
