package org.j8unit.repository.java.awt.peer;

import java.awt.peer.LabelPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LabelPeer} (by simply reusing the J8Unit
 * test interface {@link LabelPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LabelPeerClassTest
implements LabelPeerClassTests<LabelPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.LabelPeer]

    @Override
    public Class<LabelPeer> createNewSUT() {
        return LabelPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.LabelPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.LabelPeer]

}
