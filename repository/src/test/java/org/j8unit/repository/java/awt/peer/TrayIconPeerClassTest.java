package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrayIconPeerClassTest
implements org.j8unit.repository.java.awt.peer.TrayIconPeerClassTests<java.awt.peer.TrayIconPeer> {

    @Override
    public Class<java.awt.peer.TrayIconPeer> createNewSUT() {
        return java.awt.peer.TrayIconPeer.class;
    }

}
