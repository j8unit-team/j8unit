package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuItemPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuItemPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.MenuItemPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MenuItemPeerClassTest
implements MenuItemPeerClassTests<MenuItemPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.MenuItemPeer]

    @Override
    public Class<MenuItemPeer> createNewSUT() {
        return MenuItemPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.MenuItemPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.MenuItemPeer]

}
