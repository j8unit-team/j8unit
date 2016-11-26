package org.j8unit.repository.java.awt.peer;

import java.awt.peer.CanvasPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CanvasPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.CanvasPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class CanvasPeerClassTest
implements CanvasPeerClassTests<CanvasPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.CanvasPeer]

    @Override
    public Class<CanvasPeer> createNewSUT() {
        return CanvasPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.CanvasPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.CanvasPeer]

}
