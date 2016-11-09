package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.NotIdentifiableEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotIdentifiableEvent} (by simply reusing
 * the J8Unit test interface {@link NotIdentifiableEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotIdentifiableEventClassTest
implements NotIdentifiableEventClassTests<NotIdentifiableEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.NotIdentifiableEvent]

    @Override
    public Class<NotIdentifiableEvent> createNewSUT() {
        return NotIdentifiableEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.NotIdentifiableEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.NotIdentifiableEvent]

}
