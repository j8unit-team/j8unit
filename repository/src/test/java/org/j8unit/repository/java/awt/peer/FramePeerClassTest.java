package org.j8unit.repository.java.awt.peer;

import java.awt.peer.FramePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FramePeer} (by simply reusing the J8Unit
 * test interface {@link FramePeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FramePeerClassTest
implements FramePeerClassTests<FramePeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.FramePeer]

    @Override
    public Class<FramePeer> createNewSUT() {
        return FramePeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.FramePeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.FramePeer]

}
