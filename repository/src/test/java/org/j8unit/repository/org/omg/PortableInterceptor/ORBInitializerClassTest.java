package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ORBInitializerClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerClassTests<org.omg.PortableInterceptor.ORBInitializer> {

    @Override
    public Class<org.omg.PortableInterceptor.ORBInitializer> createNewSUT() {
        return org.omg.PortableInterceptor.ORBInitializer.class;
    }

}
