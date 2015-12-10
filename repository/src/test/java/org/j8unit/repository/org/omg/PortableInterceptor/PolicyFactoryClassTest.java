package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyFactoryClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryClassTests<org.omg.PortableInterceptor.PolicyFactory> {

    @Override
    public Class<org.omg.PortableInterceptor.PolicyFactory> createNewSUT() {
        return org.omg.PortableInterceptor.PolicyFactory.class;
    }

}
