package org.j8unit.repository.java.awt.dnd.peer;

import java.awt.dnd.peer.DragSourceContextPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSourceContextPeer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.peer.DragSourceContextPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DragSourceContextPeerClassTest
implements DragSourceContextPeerClassTests<DragSourceContextPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.peer.DragSourceContextPeer]

    @Override
    public Class<DragSourceContextPeer> createNewSUT() {
        return DragSourceContextPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.peer.DragSourceContextPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.peer.DragSourceContextPeer]

}
