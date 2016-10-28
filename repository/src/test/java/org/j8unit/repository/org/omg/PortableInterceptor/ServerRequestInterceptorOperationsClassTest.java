package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptorOperations;

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorOperationsClassTests<ServerRequestInterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

    @Override
    public Class<ServerRequestInterceptorOperations> createNewSUT() {
        return ServerRequestInterceptorOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

}
