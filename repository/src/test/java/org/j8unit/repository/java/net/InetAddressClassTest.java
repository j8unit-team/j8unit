package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InetAddressClassTest
implements org.j8unit.repository.java.net.InetAddressClassTests<java.net.InetAddress> {

    @Override
    public Class<java.net.InetAddress> createNewSUT() {
        return java.net.InetAddress.class;
    }

}
