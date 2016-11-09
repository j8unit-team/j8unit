package org.j8unit.repository.java.awt.peer;

import java.awt.peer.CheckboxMenuItemPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CheckboxMenuItemPeer} (by simply reusing
 * the J8Unit test interface {@link CheckboxMenuItemPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class CheckboxMenuItemPeerClassTest
implements CheckboxMenuItemPeerClassTests<CheckboxMenuItemPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.CheckboxMenuItemPeer]

    @Override
    public Class<CheckboxMenuItemPeer> createNewSUT() {
        return CheckboxMenuItemPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.CheckboxMenuItemPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.CheckboxMenuItemPeer]

}
