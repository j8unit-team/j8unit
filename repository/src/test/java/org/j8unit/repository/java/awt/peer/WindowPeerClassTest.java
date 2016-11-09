package org.j8unit.repository.java.awt.peer;

import java.awt.peer.WindowPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WindowPeer} (by simply reusing the J8Unit
 * test interface {@link WindowPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class WindowPeerClassTest
implements WindowPeerClassTests<WindowPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.WindowPeer]

    @Override
    public Class<WindowPeer> createNewSUT() {
        return WindowPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.WindowPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.WindowPeer]

}
