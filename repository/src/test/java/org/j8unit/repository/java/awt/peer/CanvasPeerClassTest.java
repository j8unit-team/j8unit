package org.j8unit.repository.java.awt.peer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CanvasPeerClassTest
implements org.j8unit.repository.java.awt.peer.CanvasPeerClassTests<java.awt.peer.CanvasPeer> {

    @Override
    public Class<java.awt.peer.CanvasPeer> createNewSUT() {
        return java.awt.peer.CanvasPeer.class;
    }

}
