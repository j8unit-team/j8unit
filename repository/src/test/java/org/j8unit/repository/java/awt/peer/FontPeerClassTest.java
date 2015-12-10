package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FontPeerClassTest
implements org.j8unit.repository.java.awt.peer.FontPeerClassTests<java.awt.peer.FontPeer> {

    @Override
    public Class<java.awt.peer.FontPeer> createNewSUT() {
        return java.awt.peer.FontPeer.class;
    }

}
