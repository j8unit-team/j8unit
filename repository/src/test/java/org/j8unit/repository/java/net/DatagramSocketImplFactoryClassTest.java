package org.j8unit.repository.java.net;

import java.net.DatagramSocketImplFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatagramSocketImplFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.net.DatagramSocketImplFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class DatagramSocketImplFactoryClassTest
implements DatagramSocketImplFactoryClassTests<DatagramSocketImplFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.DatagramSocketImplFactory]

    @Override
    public Class<DatagramSocketImplFactory> createNewSUT() {
        return DatagramSocketImplFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.DatagramSocketImplFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.DatagramSocketImplFactory]

}
