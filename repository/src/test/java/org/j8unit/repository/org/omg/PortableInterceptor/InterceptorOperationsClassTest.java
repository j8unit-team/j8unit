package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.InterceptorOperations;

@RunWith(J8Unit4.class)
public class InterceptorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsClassTests<InterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.InterceptorOperations]

    @Override
    public Class<InterceptorOperations> createNewSUT() {
        return InterceptorOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.InterceptorOperations]

}
