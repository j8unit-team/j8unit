package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.MutationEvent;

@RunWith(J8Unit4.class)
public class MutationEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.MutationEventClassTests<MutationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.MutationEvent]

    @Override
    public Class<MutationEvent> createNewSUT() {
        return MutationEvent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.MutationEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.MutationEvent]

}
