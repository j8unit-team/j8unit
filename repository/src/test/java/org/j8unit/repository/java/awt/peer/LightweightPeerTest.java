package org.j8unit.repository.java.awt.peer;

import java.awt.peer.LightweightPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LightweightPeerTest
implements org.j8unit.repository.java.awt.peer.LightweightPeerTests<LightweightPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.LightweightPeer]

    @Override
    public LightweightPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.LightweightPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.LightweightPeer]

}
