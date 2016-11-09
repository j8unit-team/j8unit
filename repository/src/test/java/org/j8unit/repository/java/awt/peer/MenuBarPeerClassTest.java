package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuBarPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuBarPeer} (by simply reusing the
 * J8Unit test interface {@link MenuBarPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuBarPeerClassTest
implements MenuBarPeerClassTests<MenuBarPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.MenuBarPeer]

    @Override
    public Class<MenuBarPeer> createNewSUT() {
        return MenuBarPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.MenuBarPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.MenuBarPeer]

}
