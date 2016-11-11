package org.j8unit.repository.java.awt.dnd.peer;

import java.awt.dnd.peer.DragSourceContextPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragSourceContextPeer} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.peer.DragSourceContextPeerTests}).
 */

@RunWith(J8Unit4.class)
public class DragSourceContextPeerTest
implements DragSourceContextPeerTests<DragSourceContextPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.peer.DragSourceContextPeer]

    @Override
    public DragSourceContextPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.dnd.peer.DragSourceContextPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.peer.DragSourceContextPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.peer.DragSourceContextPeer]

}
