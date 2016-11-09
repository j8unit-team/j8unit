package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuComponentPeer} (by simply reusing the
 * J8Unit test interface {@link MenuComponentPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuComponentPeerClassTest
implements MenuComponentPeerClassTests<MenuComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.MenuComponentPeer]

    @Override
    public Class<MenuComponentPeer> createNewSUT() {
        return MenuComponentPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.MenuComponentPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.MenuComponentPeer]

}
