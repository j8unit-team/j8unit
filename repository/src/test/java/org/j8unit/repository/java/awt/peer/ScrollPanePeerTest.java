package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ScrollPanePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScrollPanePeer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ScrollPanePeerTests}).
 */
@RunWith(J8Unit4.class)
public class ScrollPanePeerTest
implements ScrollPanePeerTests<ScrollPanePeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.ScrollPanePeer]

    @Override
    public ScrollPanePeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.ScrollPanePeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.ScrollPanePeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.ScrollPanePeer]

}
