package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClientRequestInterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorClassTests<org.omg.PortableInterceptor.ClientRequestInterceptor> {

    @Override
    public Class<org.omg.PortableInterceptor.ClientRequestInterceptor> createNewSUT() {
        return org.omg.PortableInterceptor.ClientRequestInterceptor.class;
    }

}
