package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ChoicePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoicePeerTest
implements org.j8unit.repository.java.awt.peer.ChoicePeerTests<ChoicePeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.ChoicePeer]

    @Override
    public ChoicePeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.ChoicePeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.ChoicePeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.ChoicePeer]

}
