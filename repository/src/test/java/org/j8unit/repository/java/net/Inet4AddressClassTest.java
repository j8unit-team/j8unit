package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet4AddressClassTest
implements org.j8unit.repository.java.net.Inet4AddressClassTests<java.net.Inet4Address> {

    @Override
    public Class<java.net.Inet4Address> createNewSUT() {
        return java.net.Inet4Address.class;
    }

}
