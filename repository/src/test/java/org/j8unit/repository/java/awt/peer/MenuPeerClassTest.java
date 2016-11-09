package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuPeer} (by simply reusing the J8Unit
 * test interface {@link MenuPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuPeerClassTest
implements MenuPeerClassTests<MenuPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.MenuPeer]

    @Override
    public Class<MenuPeer> createNewSUT() {
        return MenuPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.MenuPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.MenuPeer]

}
