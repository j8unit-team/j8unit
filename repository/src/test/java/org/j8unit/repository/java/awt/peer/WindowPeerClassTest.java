package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowPeerClassTest
implements org.j8unit.repository.java.awt.peer.WindowPeerClassTests<java.awt.peer.WindowPeer> {

    @Override
    public Class<java.awt.peer.WindowPeer> createNewSUT() {
        return java.awt.peer.WindowPeer.class;
    }

}
