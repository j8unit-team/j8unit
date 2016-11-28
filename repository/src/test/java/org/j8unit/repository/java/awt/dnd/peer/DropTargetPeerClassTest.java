package org.j8unit.repository.java.awt.dnd.peer;

import java.awt.dnd.peer.DropTargetPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTargetPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.peer.DropTargetPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DropTargetPeerClassTest
implements DropTargetPeerClassTests<DropTargetPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.peer.DropTargetPeer]

    @Override
    public Class<DropTargetPeer> createNewSUT() {
        return DropTargetPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.peer.DropTargetPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.peer.DropTargetPeer]

}
