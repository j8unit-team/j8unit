package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuBarPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuBarPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.MenuBarPeerTests}).
 */
@RunWith(J8Unit4.class)
public class MenuBarPeerTest
implements MenuBarPeerTests<MenuBarPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.MenuBarPeer]

    @Override
    public MenuBarPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.MenuBarPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.MenuBarPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.MenuBarPeer]

}
