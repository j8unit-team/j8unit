package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuPeer} (by simply reusing the
 * J8Unit test interface {@link MenuPeerTests}).
 */

@RunWith(J8Unit4.class)
public class MenuPeerTest
implements MenuPeerTests<MenuPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.MenuPeer]

    @Override
    public MenuPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.MenuPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.MenuPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.MenuPeer]

}
