package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentPeerClassTest
implements org.j8unit.repository.java.awt.peer.ComponentPeerClassTests<ComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ComponentPeer]

    @Override
    public Class<ComponentPeer> createNewSUT() {
        return ComponentPeer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ComponentPeer]

}
