package org.j8unit.repository.java.util;

import java.util.EventListener;
import java.util.EventListenerProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerProxyTest<T extends EventListener>
implements org.j8unit.repository.java.util.EventListenerProxyTests<EventListenerProxy<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EventListenerProxy]

    @Override
    public EventListenerProxy<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.EventListenerProxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.EventListenerProxy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.EventListenerProxy]

}
