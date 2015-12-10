package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MutationEventClassTest
implements org.j8unit.repository.org.w3c.dom.events.MutationEventClassTests<org.w3c.dom.events.MutationEvent> {

    @Override
    public Class<org.w3c.dom.events.MutationEvent> createNewSUT() {
        return org.w3c.dom.events.MutationEvent.class;
    }

}
