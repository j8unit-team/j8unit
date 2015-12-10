package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterfaceAddressClassTest
implements org.j8unit.repository.java.net.InterfaceAddressClassTests<java.net.InterfaceAddress> {

    @Override
    public Class<java.net.InterfaceAddress> createNewSUT() {
        return java.net.InterfaceAddress.class;
    }

}
