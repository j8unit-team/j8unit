package org.j8unit.repository.java.net;

import java.net.Inet4Address;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Inet4Address} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.Inet4AddressClassTests}).
 */
@RunWith(J8Unit4.class)
public class Inet4AddressClassTest
implements Inet4AddressClassTests<Inet4Address> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Inet4Address]

    @Override
    public Class<Inet4Address> createNewSUT() {
        return Inet4Address.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Inet4Address]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Inet4Address]

}
