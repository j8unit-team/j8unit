package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptor;

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorTests<ServerRequestInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    @Override
    public ServerRequestInterceptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ServerRequestInterceptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

}
