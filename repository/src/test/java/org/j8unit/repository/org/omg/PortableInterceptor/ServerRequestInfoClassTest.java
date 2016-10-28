package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInfo;

@RunWith(J8Unit4.class)
public class ServerRequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoClassTests<ServerRequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfo]

    @Override
    public Class<ServerRequestInfo> createNewSUT() {
        return ServerRequestInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfo]

}
