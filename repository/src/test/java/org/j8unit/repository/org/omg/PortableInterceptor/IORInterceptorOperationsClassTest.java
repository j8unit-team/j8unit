package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORInterceptorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorOperationsClassTests<org.omg.PortableInterceptor.IORInterceptorOperations> {

    @Override
    public Class<org.omg.PortableInterceptor.IORInterceptorOperations> createNewSUT() {
        return org.omg.PortableInterceptor.IORInterceptorOperations.class;
    }

}
