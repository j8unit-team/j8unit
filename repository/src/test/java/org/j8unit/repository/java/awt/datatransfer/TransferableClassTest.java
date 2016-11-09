package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.Transferable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Transferable} (by simply reusing the
 * J8Unit test interface {@link TransferableClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransferableClassTest
implements TransferableClassTests<Transferable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.Transferable]

    @Override
    public Class<Transferable> createNewSUT() {
        return Transferable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.Transferable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.Transferable]

}
