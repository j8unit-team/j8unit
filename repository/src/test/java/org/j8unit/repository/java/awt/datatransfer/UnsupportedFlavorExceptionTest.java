package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.UnsupportedFlavorException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnsupportedFlavorException} (by
 * simply reusing the J8Unit test interface {@link UnsupportedFlavorExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedFlavorExceptionTest
implements UnsupportedFlavorExceptionTests<UnsupportedFlavorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.UnsupportedFlavorException]

    @Override
    public UnsupportedFlavorException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.datatransfer.UnsupportedFlavorException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.UnsupportedFlavorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.UnsupportedFlavorException]

}
