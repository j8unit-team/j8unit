package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListPeerClassTest
implements org.j8unit.repository.java.awt.peer.ListPeerClassTests<java.awt.peer.ListPeer> {

    @Override
    public Class<java.awt.peer.ListPeer> createNewSUT() {
        return java.awt.peer.ListPeer.class;
    }

}
