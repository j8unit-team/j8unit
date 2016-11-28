package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.EventFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventFilter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.EventFilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventFilterClassTest
implements EventFilterClassTests<EventFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.EventFilter]

    @Override
    public Class<EventFilter> createNewSUT() {
        return EventFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.EventFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.EventFilter]

}
