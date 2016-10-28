package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.PolicyFactory;

@RunWith(J8Unit4.class)
public class PolicyFactoryClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryClassTests<PolicyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactory]

    @Override
    public Class<PolicyFactory> createNewSUT() {
        return PolicyFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.PolicyFactory]

}
