package org.j8unit.repository.java.net;

import java.net.Inet4Address;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet4AddressClassTest
implements org.j8unit.repository.java.net.Inet4AddressClassTests<Inet4Address> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Inet4Address]

    @Override
    public Class<Inet4Address> createNewSUT() {
        return Inet4Address.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Inet4Address]

}
