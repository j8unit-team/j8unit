package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ScrollbarPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScrollbarPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ScrollbarPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ScrollbarPeerClassTest
implements ScrollbarPeerClassTests<ScrollbarPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ScrollbarPeer]

    @Override
    public Class<ScrollbarPeer> createNewSUT() {
        return ScrollbarPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ScrollbarPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ScrollbarPeer]

}
