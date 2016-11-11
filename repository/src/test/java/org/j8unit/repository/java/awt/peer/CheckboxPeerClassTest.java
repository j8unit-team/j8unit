package org.j8unit.repository.java.awt.peer;

import java.awt.peer.CheckboxPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CheckboxPeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.CheckboxPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class CheckboxPeerClassTest
implements CheckboxPeerClassTests<CheckboxPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.CheckboxPeer]

    @Override
    public Class<CheckboxPeer> createNewSUT() {
        return CheckboxPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.CheckboxPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.CheckboxPeer]

}
