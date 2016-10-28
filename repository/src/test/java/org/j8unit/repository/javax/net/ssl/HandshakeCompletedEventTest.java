package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HandshakeCompletedEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandshakeCompletedEventTest
implements org.j8unit.repository.javax.net.ssl.HandshakeCompletedEventTests<HandshakeCompletedEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.HandshakeCompletedEvent]

    @Override
    public HandshakeCompletedEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.HandshakeCompletedEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.HandshakeCompletedEvent]

}
