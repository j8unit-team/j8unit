package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyFactoryOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryOperationsClassTests<org.omg.PortableInterceptor.PolicyFactoryOperations> {

    @Override
    public Class<org.omg.PortableInterceptor.PolicyFactoryOperations> createNewSUT() {
        return org.omg.PortableInterceptor.PolicyFactoryOperations.class;
    }

}
