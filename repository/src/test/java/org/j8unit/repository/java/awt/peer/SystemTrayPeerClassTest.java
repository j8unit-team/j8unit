package org.j8unit.repository.java.awt.peer;

import java.awt.peer.SystemTrayPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SystemTrayPeer} (by simply reusing the
 * J8Unit test interface {@link SystemTrayPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class SystemTrayPeerClassTest
implements SystemTrayPeerClassTests<SystemTrayPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.SystemTrayPeer]

    @Override
    public Class<SystemTrayPeer> createNewSUT() {
        return SystemTrayPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.SystemTrayPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.SystemTrayPeer]

}
