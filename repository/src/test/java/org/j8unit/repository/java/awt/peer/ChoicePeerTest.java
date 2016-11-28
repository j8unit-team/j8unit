package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ChoicePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChoicePeer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.peer.ChoicePeerTests}).
 */
@RunWith(J8Unit4.class)
public class ChoicePeerTest
implements ChoicePeerTests<ChoicePeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.ChoicePeer]

    @Override
    public ChoicePeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.ChoicePeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.ChoicePeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.ChoicePeer]

}
