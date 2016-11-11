package org.j8unit.repository.java.awt.peer;

import java.awt.peer.PanelPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PanelPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.PanelPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PanelPeerClassTest
implements PanelPeerClassTests<PanelPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.PanelPeer]

    @Override
    public Class<PanelPeer> createNewSUT() {
        return PanelPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.PanelPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.PanelPeer]

}
