package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MouseInfoPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInfoPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.MouseInfoPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MouseInfoPeerClassTest
implements MouseInfoPeerClassTests<MouseInfoPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.MouseInfoPeer]

    @Override
    public Class<MouseInfoPeer> createNewSUT() {
        return MouseInfoPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.MouseInfoPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.MouseInfoPeer]

}
