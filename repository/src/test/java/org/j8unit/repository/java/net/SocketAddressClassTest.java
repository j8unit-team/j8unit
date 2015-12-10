package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketAddressClassTest
implements org.j8unit.repository.java.net.SocketAddressClassTests<java.net.SocketAddress> {

    @Override
    public Class<java.net.SocketAddress> createNewSUT() {
        return java.net.SocketAddress.class;
    }

}
