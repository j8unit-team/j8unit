package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextFieldPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextFieldPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TextFieldPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextFieldPeerClassTest
implements TextFieldPeerClassTests<TextFieldPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.TextFieldPeer]

    @Override
    public Class<TextFieldPeer> createNewSUT() {
        return TextFieldPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.TextFieldPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.TextFieldPeer]

}
