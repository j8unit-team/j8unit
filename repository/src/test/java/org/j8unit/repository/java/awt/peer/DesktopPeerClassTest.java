package org.j8unit.repository.java.awt.peer;

import java.awt.peer.DesktopPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DesktopPeer} (by simply reusing the
 * J8Unit test interface {@link DesktopPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DesktopPeerClassTest
implements DesktopPeerClassTests<DesktopPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.DesktopPeer]

    @Override
    public Class<DesktopPeer> createNewSUT() {
        return DesktopPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.DesktopPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.DesktopPeer]

}
