package org.j8unit.repository.java.net;

import java.net.InterfaceAddress;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterfaceAddressClassTest
implements org.j8unit.repository.java.net.InterfaceAddressClassTests<InterfaceAddress> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.InterfaceAddress]

    @Override
    public Class<InterfaceAddress> createNewSUT() {
        return InterfaceAddress.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.InterfaceAddress]

}
