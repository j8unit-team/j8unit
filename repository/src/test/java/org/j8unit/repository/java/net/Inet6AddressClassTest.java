package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet6AddressClassTest
implements org.j8unit.repository.java.net.Inet6AddressClassTests<java.net.Inet6Address> {

    @Override
    public Class<java.net.Inet6Address> createNewSUT() {
        return java.net.Inet6Address.class;
    }

}
