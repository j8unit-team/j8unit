package org.j8unit.repository.java.awt.peer;

import java.awt.peer.DialogPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DialogPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.DialogPeerTests}).
 */

@RunWith(J8Unit4.class)
public class DialogPeerTest
implements DialogPeerTests<DialogPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.DialogPeer]

    @Override
    public DialogPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.DialogPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.DialogPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.DialogPeer]

}
