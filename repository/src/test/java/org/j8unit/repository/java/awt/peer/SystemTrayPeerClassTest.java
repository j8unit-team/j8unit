package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemTrayPeerClassTest
implements org.j8unit.repository.java.awt.peer.SystemTrayPeerClassTests<java.awt.peer.SystemTrayPeer> {

    @Override
    public Class<java.awt.peer.SystemTrayPeer> createNewSUT() {
        return java.awt.peer.SystemTrayPeer.class;
    }

}