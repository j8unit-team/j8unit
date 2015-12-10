package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORInterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorClassTests<org.omg.PortableInterceptor.IORInterceptor> {

    @Override
    public Class<org.omg.PortableInterceptor.IORInterceptor> createNewSUT() {
        return org.omg.PortableInterceptor.IORInterceptor.class;
    }

}
