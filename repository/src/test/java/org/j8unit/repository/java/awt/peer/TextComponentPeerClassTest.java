package org.j8unit.repository.java.awt.peer;

import java.awt.peer.TextComponentPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextComponentPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.TextComponentPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TextComponentPeerClassTest
implements TextComponentPeerClassTests<TextComponentPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.TextComponentPeer]

    @Override
    public Class<TextComponentPeer> createNewSUT() {
        return TextComponentPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.TextComponentPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.TextComponentPeer]

}
