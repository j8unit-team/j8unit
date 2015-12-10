package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ButtonPeerClassTest
implements org.j8unit.repository.java.awt.peer.ButtonPeerClassTests<java.awt.peer.ButtonPeer> {

    @Override
    public Class<java.awt.peer.ButtonPeer> createNewSUT() {
        return java.awt.peer.ButtonPeer.class;
    }

}
