package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoClassTests<org.omg.PortableInterceptor.ServerRequestInfo> {

    @Override
    public Class<org.omg.PortableInterceptor.ServerRequestInfo> createNewSUT() {
        return org.omg.PortableInterceptor.ServerRequestInfo.class;
    }

}
