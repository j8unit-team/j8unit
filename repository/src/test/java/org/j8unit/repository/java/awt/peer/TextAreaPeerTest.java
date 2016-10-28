package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextAreaPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextAreaPeerTest
implements org.j8unit.repository.java.awt.peer.TextAreaPeerTests<TextAreaPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.TextAreaPeer]

    @Override
    public TextAreaPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.TextAreaPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.TextAreaPeer]

}
