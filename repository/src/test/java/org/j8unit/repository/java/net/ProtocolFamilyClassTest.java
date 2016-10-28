package org.j8unit.repository.java.net;

import java.net.ProtocolFamily;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolFamilyClassTest
implements org.j8unit.repository.java.net.ProtocolFamilyClassTests<ProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ProtocolFamily]

    @Override
    public Class<ProtocolFamily> createNewSUT() {
        return ProtocolFamily.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ProtocolFamily]

}
