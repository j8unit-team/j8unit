package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.NotIdentifiableEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotIdentifiableEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.NotIdentifiableEventTests}).
 */
@RunWith(J8Unit4.class)
public class NotIdentifiableEventTest
implements NotIdentifiableEventTests<NotIdentifiableEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.NotIdentifiableEvent]

    @Override
    public NotIdentifiableEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.NotIdentifiableEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.NotIdentifiableEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.NotIdentifiableEvent]

}
