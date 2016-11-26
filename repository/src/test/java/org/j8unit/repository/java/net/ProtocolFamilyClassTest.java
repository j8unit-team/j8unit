package org.j8unit.repository.java.net;

import java.net.ProtocolFamily;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProtocolFamily} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.ProtocolFamilyClassTests}).
 */
@RunWith(J8Unit4.class)
public class ProtocolFamilyClassTest
implements ProtocolFamilyClassTests<ProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ProtocolFamily]

    @Override
    public Class<ProtocolFamily> createNewSUT() {
        return ProtocolFamily.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ProtocolFamily]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ProtocolFamily]

}
