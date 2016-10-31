package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextComponentPeerTest
implements org.j8unit.repository.java.awt.peer.TextComponentPeerTests<TextComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.TextComponentPeer]

    @Override
    public TextComponentPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.TextComponentPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.TextComponentPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.TextComponentPeer]

}
