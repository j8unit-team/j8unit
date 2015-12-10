package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContainerPeerClassTest
implements org.j8unit.repository.java.awt.peer.ContainerPeerClassTests<java.awt.peer.ContainerPeer> {

    @Override
    public Class<java.awt.peer.ContainerPeer> createNewSUT() {
        return java.awt.peer.ContainerPeer.class;
    }

}
