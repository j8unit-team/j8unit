package org.j8unit.repository.java.awt.peer;

import java.awt.peer.DesktopPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesktopPeerTest
implements org.j8unit.repository.java.awt.peer.DesktopPeerTests<DesktopPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.DesktopPeer]

    @Override
    public DesktopPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.DesktopPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.DesktopPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.DesktopPeer]

}
