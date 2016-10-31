package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.EventFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventFilterTest
implements org.j8unit.repository.javax.xml.stream.EventFilterTests<EventFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.EventFilter]

    @Override
    public EventFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.EventFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.EventFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.EventFilter]

}
