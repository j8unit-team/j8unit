package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TrayIconPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TrayIconPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TrayIconPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TrayIconPeerClassTest
implements TrayIconPeerClassTests<TrayIconPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.TrayIconPeer]

    @Override
    public Class<TrayIconPeer> createNewSUT() {
        return TrayIconPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.TrayIconPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.TrayIconPeer]

}
