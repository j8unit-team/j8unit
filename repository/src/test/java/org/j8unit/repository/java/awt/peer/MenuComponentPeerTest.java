package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MenuComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuComponentPeer} (by simply reusing
 * the J8Unit test interface {@link MenuComponentPeerTests}).
 */

@RunWith(J8Unit4.class)
public class MenuComponentPeerTest
implements MenuComponentPeerTests<MenuComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.MenuComponentPeer]

    @Override
    public MenuComponentPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.MenuComponentPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.MenuComponentPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.MenuComponentPeer]

}
