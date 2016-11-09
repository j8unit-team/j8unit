package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.ClipboardOwner;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClipboardOwner} (by simply reusing the
 * J8Unit test interface {@link ClipboardOwnerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClipboardOwnerClassTest
implements ClipboardOwnerClassTests<ClipboardOwner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.ClipboardOwner]

    @Override
    public Class<ClipboardOwner> createNewSUT() {
        return ClipboardOwner.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.ClipboardOwner]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.ClipboardOwner]

}
