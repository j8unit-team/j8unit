package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuPeerClassTest
implements org.j8unit.repository.java.awt.peer.MenuPeerClassTests<java.awt.peer.MenuPeer> {

    @Override
    public Class<java.awt.peer.MenuPeer> createNewSUT() {
        return java.awt.peer.MenuPeer.class;
    }

}
