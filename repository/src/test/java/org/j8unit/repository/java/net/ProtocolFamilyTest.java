package org.j8unit.repository.java.net;

import java.net.ProtocolFamily;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ProtocolFamily} (by simply reusing
 * the J8Unit test interface {@link ProtocolFamilyTests}).
 */

@RunWith(J8Unit4.class)
public class ProtocolFamilyTest
implements ProtocolFamilyTests<ProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ProtocolFamily]

    @Override
    public ProtocolFamily createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ProtocolFamily], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.ProtocolFamily]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.ProtocolFamily]

}
