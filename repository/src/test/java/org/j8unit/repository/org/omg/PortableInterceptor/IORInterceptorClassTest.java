package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.IORInterceptor;

@RunWith(J8Unit4.class)
public class IORInterceptorClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorClassTests<IORInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor]

    @Override
    public Class<IORInterceptor> createNewSUT() {
        return IORInterceptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor]

}
