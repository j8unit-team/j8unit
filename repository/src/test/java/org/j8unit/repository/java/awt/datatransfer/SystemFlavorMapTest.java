package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.SystemFlavorMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SystemFlavorMap} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.SystemFlavorMapTests}).
 */

@RunWith(J8Unit4.class)
public class SystemFlavorMapTest
implements SystemFlavorMapTests<SystemFlavorMap> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.SystemFlavorMap]

    @Override
    public SystemFlavorMap createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.datatransfer.SystemFlavorMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.SystemFlavorMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.SystemFlavorMap]

}
