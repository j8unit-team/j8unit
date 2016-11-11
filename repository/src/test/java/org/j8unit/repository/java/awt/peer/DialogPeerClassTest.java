package org.j8unit.repository.java.awt.peer;

import java.awt.peer.DialogPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DialogPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.DialogPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DialogPeerClassTest
implements DialogPeerClassTests<DialogPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.DialogPeer]

    @Override
    public Class<DialogPeer> createNewSUT() {
        return DialogPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.DialogPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.DialogPeer]

}
