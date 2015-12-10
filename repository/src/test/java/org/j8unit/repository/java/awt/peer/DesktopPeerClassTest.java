package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesktopPeerClassTest
implements org.j8unit.repository.java.awt.peer.DesktopPeerClassTests<java.awt.peer.DesktopPeer> {

    @Override
    public Class<java.awt.peer.DesktopPeer> createNewSUT() {
        return java.awt.peer.DesktopPeer.class;
    }

}
