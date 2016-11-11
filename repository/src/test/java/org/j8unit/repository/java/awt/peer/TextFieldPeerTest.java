package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextFieldPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextFieldPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TextFieldPeerTests}).
 */

@RunWith(J8Unit4.class)
public class TextFieldPeerTest
implements TextFieldPeerTests<TextFieldPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.TextFieldPeer]

    @Override
    public TextFieldPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.TextFieldPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.TextFieldPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.TextFieldPeer]

}
