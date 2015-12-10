package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollbarPeerClassTest
implements org.j8unit.repository.java.awt.peer.ScrollbarPeerClassTests<java.awt.peer.ScrollbarPeer> {

    @Override
    public Class<java.awt.peer.ScrollbarPeer> createNewSUT() {
        return java.awt.peer.ScrollbarPeer.class;
    }

}
