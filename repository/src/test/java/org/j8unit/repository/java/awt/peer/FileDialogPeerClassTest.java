package org.j8unit.repository.java.awt.peer;

import java.awt.peer.FileDialogPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileDialogPeer} (by simply reusing the
 * J8Unit test interface {@link FileDialogPeerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileDialogPeerClassTest
implements FileDialogPeerClassTests<FileDialogPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.FileDialogPeer]

    @Override
    public Class<FileDialogPeer> createNewSUT() {
        return FileDialogPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.FileDialogPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.FileDialogPeer]

}
