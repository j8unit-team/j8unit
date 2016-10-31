package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.events.MutationEvent;

@RunWith(J8Unit4.class)
public class MutationEventTest
implements org.j8unit.repository.org.w3c.dom.events.MutationEventTests<MutationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.events.MutationEvent]

    @Override
    public MutationEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.events.MutationEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.events.MutationEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.events.MutationEvent]

}
