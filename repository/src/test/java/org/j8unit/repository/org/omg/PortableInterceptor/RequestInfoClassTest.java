package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoClassTests<org.omg.PortableInterceptor.RequestInfo> {

    @Override
    public Class<org.omg.PortableInterceptor.RequestInfo> createNewSUT() {
        return org.omg.PortableInterceptor.RequestInfo.class;
    }

}
