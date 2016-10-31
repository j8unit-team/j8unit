package org.j8unit.repository.java.net;

import java.net.ProtocolFamily;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolFamilyTest
implements org.j8unit.repository.java.net.ProtocolFamilyTests<ProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ProtocolFamily]

    @Override
    public ProtocolFamily createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ProtocolFamily], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.ProtocolFamily]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.ProtocolFamily]

}
