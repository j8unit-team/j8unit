package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ContainerPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ContainerPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ContainerPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ContainerPeerClassTest
implements ContainerPeerClassTests<ContainerPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ContainerPeer]

    @Override
    public Class<ContainerPeer> createNewSUT() {
        return ContainerPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ContainerPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ContainerPeer]

}
