package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.PolicyFactoryOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyFactoryOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class PolicyFactoryOperationsClassTest
implements PolicyFactoryOperationsClassTests<PolicyFactoryOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactoryOperations]

    @Override
    public Class<PolicyFactoryOperations> createNewSUT() {
        return PolicyFactoryOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactoryOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactoryOperations]

}
