package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ComponentPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ComponentPeerClassTest
implements ComponentPeerClassTests<ComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ComponentPeer]

    @Override
    public Class<ComponentPeer> createNewSUT() {
        return ComponentPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ComponentPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ComponentPeer]

}
