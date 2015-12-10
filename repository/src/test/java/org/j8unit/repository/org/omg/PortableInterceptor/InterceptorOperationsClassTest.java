package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterceptorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsClassTests<org.omg.PortableInterceptor.InterceptorOperations> {

    @Override
    public Class<org.omg.PortableInterceptor.InterceptorOperations> createNewSUT() {
        return org.omg.PortableInterceptor.InterceptorOperations.class;
    }

}
