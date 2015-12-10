package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ORBInitInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoClassTests<org.omg.PortableInterceptor.ORBInitInfo> {

    @Override
    public Class<org.omg.PortableInterceptor.ORBInitInfo> createNewSUT() {
        return org.omg.PortableInterceptor.ORBInitInfo.class;
    }

}
