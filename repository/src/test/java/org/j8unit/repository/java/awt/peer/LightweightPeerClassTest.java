package org.j8unit.repository.java.awt.peer;

import java.awt.peer.LightweightPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LightweightPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.LightweightPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LightweightPeerClassTest
implements LightweightPeerClassTests<LightweightPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.LightweightPeer]

    @Override
    public Class<LightweightPeer> createNewSUT() {
        return LightweightPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.LightweightPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.LightweightPeer]

}
