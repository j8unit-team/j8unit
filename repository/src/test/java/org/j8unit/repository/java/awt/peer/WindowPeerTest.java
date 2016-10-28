package org.j8unit.repository.java.awt.peer;

import java.awt.peer.WindowPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowPeerTest
implements org.j8unit.repository.java.awt.peer.WindowPeerTests<WindowPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.WindowPeer]

    @Override
    public WindowPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.WindowPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.WindowPeer]

}
