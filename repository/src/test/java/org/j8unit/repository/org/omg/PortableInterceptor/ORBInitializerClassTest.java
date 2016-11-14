package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitializer;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ORBInitializer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ORBInitializerClassTest
implements ORBInitializerClassTests<ORBInitializer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializer]

    @Override
    public Class<ORBInitializer> createNewSUT() {
        return ORBInitializer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializer]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializer]

}
