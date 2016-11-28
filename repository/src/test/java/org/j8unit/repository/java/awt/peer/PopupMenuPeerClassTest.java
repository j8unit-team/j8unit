package org.j8unit.repository.java.awt.peer;

import java.awt.peer.PopupMenuPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PopupMenuPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.PopupMenuPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class PopupMenuPeerClassTest
implements PopupMenuPeerClassTests<PopupMenuPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.PopupMenuPeer]

    @Override
    public Class<PopupMenuPeer> createNewSUT() {
        return PopupMenuPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.PopupMenuPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.PopupMenuPeer]

}
