package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetworkInterfaceClassTest
implements org.j8unit.repository.java.net.NetworkInterfaceClassTests<java.net.NetworkInterface> {

    @Override
    public Class<java.net.NetworkInterface> createNewSUT() {
        return java.net.NetworkInterface.class;
    }

}
