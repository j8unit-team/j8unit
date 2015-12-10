package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FramePeerClassTest
implements org.j8unit.repository.java.awt.peer.FramePeerClassTests<java.awt.peer.FramePeer> {

    @Override
    public Class<java.awt.peer.FramePeer> createNewSUT() {
        return java.awt.peer.FramePeer.class;
    }

}
