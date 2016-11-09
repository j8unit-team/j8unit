package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.PolicyFactory;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyFactory} (by simply reusing the
 * J8Unit test interface {@link PolicyFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyFactoryClassTest
implements PolicyFactoryClassTests<PolicyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactory]

    @Override
    public Class<PolicyFactory> createNewSUT() {
        return PolicyFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactory]

}
