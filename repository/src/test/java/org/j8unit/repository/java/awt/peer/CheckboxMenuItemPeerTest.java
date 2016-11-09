package org.j8unit.repository.java.awt.peer;

import java.awt.peer.CheckboxMenuItemPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CheckboxMenuItemPeer} (by simply
 * reusing the J8Unit test interface {@link CheckboxMenuItemPeerTests}).
 */

@RunWith(J8Unit4.class)
public class CheckboxMenuItemPeerTest
implements CheckboxMenuItemPeerTests<CheckboxMenuItemPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.CheckboxMenuItemPeer]

    @Override
    public CheckboxMenuItemPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.CheckboxMenuItemPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.CheckboxMenuItemPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.CheckboxMenuItemPeer]

}
