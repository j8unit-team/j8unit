package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LightweightPeerClassTest
implements org.j8unit.repository.java.awt.peer.LightweightPeerClassTests<java.awt.peer.LightweightPeer> {

    @Override
    public Class<java.awt.peer.LightweightPeer> createNewSUT() {
        return java.awt.peer.LightweightPeer.class;
    }

}
