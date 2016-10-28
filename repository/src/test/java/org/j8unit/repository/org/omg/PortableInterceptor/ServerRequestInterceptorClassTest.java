package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptor;

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorClassTests<ServerRequestInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    @Override
    public Class<ServerRequestInterceptor> createNewSUT() {
        return ServerRequestInterceptor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

}
