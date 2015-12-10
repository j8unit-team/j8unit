package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InetSocketAddressClassTest
implements org.j8unit.repository.java.net.InetSocketAddressClassTests<java.net.InetSocketAddress> {

    @Override
    public Class<java.net.InetSocketAddress> createNewSUT() {
        return java.net.InetSocketAddress.class;
    }

}
