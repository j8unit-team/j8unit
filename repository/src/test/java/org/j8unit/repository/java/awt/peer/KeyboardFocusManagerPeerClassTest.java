package org.j8unit.repository.java.awt.peer;

import java.awt.peer.KeyboardFocusManagerPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardFocusManagerPeer} (by simply
 * reusing the J8Unit test interface {@link KeyboardFocusManagerPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyboardFocusManagerPeerClassTest
implements KeyboardFocusManagerPeerClassTests<KeyboardFocusManagerPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.KeyboardFocusManagerPeer]

    @Override
    public Class<KeyboardFocusManagerPeer> createNewSUT() {
        return KeyboardFocusManagerPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.KeyboardFocusManagerPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.KeyboardFocusManagerPeer]

}
