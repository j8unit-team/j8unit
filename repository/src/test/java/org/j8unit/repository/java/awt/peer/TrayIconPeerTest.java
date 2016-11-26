package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TrayIconPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TrayIconPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TrayIconPeerTests}).
 */
@RunWith(J8Unit4.class)
public class TrayIconPeerTest
implements TrayIconPeerTests<TrayIconPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.TrayIconPeer]

    @Override
    public TrayIconPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.TrayIconPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.TrayIconPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.TrayIconPeer]

}
