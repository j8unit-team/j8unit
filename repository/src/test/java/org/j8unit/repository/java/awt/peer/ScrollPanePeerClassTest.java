package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ScrollPanePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScrollPanePeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ScrollPanePeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPanePeerClassTest
implements ScrollPanePeerClassTests<ScrollPanePeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ScrollPanePeer]

    @Override
    public Class<ScrollPanePeer> createNewSUT() {
        return ScrollPanePeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ScrollPanePeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ScrollPanePeer]

}
