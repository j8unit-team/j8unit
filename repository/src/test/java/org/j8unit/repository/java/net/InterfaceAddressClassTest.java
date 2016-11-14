package org.j8unit.repository.java.net;

import java.net.InterfaceAddress;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InterfaceAddress} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.InterfaceAddressClassTests}).
 */

@RunWith(J8Unit4.class)
public class InterfaceAddressClassTest
implements InterfaceAddressClassTests<InterfaceAddress> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.InterfaceAddress]

    @Override
    public Class<InterfaceAddress> createNewSUT() {
        return InterfaceAddress.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.InterfaceAddress]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.InterfaceAddress]

}
