package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextAreaPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextAreaPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TextAreaPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextAreaPeerClassTest
implements TextAreaPeerClassTests<TextAreaPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.TextAreaPeer]

    @Override
    public Class<TextAreaPeer> createNewSUT() {
        return TextAreaPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.TextAreaPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.TextAreaPeer]

}
