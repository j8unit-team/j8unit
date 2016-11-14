package org.j8unit.repository.java.awt.dnd.peer;

import java.awt.dnd.peer.DropTargetContextPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTargetContextPeer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.peer.DropTargetContextPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DropTargetContextPeerClassTest
implements DropTargetContextPeerClassTests<DropTargetContextPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.peer.DropTargetContextPeer]

    @Override
    public Class<DropTargetContextPeer> createNewSUT() {
        return DropTargetContextPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.peer.DropTargetContextPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.peer.DropTargetContextPeer]

}
