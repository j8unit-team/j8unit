package org.j8unit.repository.java.awt.peer;

import java.awt.peer.FontPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FontPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.FontPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FontPeerClassTest
implements FontPeerClassTests<FontPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.FontPeer]

    @Override
    public Class<FontPeer> createNewSUT() {
        return FontPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.FontPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.FontPeer]

}
