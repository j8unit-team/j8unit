package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ButtonPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ButtonPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.ButtonPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ButtonPeerClassTest
implements ButtonPeerClassTests<ButtonPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ButtonPeer]

    @Override
    public Class<ButtonPeer> createNewSUT() {
        return ButtonPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ButtonPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ButtonPeer]

}
