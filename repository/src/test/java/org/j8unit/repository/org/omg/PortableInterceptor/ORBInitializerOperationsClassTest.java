package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitializerOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ORBInitializerOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class ORBInitializerOperationsClassTest
implements ORBInitializerOperationsClassTests<ORBInitializerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializerOperations]

    @Override
    public Class<ORBInitializerOperations> createNewSUT() {
        return ORBInitializerOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializerOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ORBInitializerOperations]

}
