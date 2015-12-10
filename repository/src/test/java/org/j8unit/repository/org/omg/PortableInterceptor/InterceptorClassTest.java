package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InterceptorClassTests<org.omg.PortableInterceptor.Interceptor> {

    @Override
    public Class<org.omg.PortableInterceptor.Interceptor> createNewSUT() {
        return org.omg.PortableInterceptor.Interceptor.class;
    }

}
