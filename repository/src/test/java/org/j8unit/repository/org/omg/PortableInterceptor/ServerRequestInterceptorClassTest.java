package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorClassTests<org.omg.PortableInterceptor.ServerRequestInterceptor> {

    @Override
    public Class<org.omg.PortableInterceptor.ServerRequestInterceptor> createNewSUT() {
        return org.omg.PortableInterceptor.ServerRequestInterceptor.class;
    }

}
