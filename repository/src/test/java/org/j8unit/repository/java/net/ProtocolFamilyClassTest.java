package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolFamilyClassTest
implements org.j8unit.repository.java.net.ProtocolFamilyClassTests<java.net.ProtocolFamily> {

    @Override
    public Class<java.net.ProtocolFamily> createNewSUT() {
        return java.net.ProtocolFamily.class;
    }

}
