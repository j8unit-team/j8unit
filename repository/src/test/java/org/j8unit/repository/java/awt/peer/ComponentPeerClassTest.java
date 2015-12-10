package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentPeerClassTest
implements org.j8unit.repository.java.awt.peer.ComponentPeerClassTests<java.awt.peer.ComponentPeer> {

    @Override
    public Class<java.awt.peer.ComponentPeer> createNewSUT() {
        return java.awt.peer.ComponentPeer.class;
    }

}
