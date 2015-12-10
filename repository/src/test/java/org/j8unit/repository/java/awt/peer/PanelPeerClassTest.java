package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PanelPeerClassTest
implements org.j8unit.repository.java.awt.peer.PanelPeerClassTests<java.awt.peer.PanelPeer> {

    @Override
    public Class<java.awt.peer.PanelPeer> createNewSUT() {
        return java.awt.peer.PanelPeer.class;
    }

}
