package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.Interceptor;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Interceptor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.InterceptorClassTests}).
 */

@RunWith(J8Unit4.class)
public class InterceptorClassTest
implements InterceptorClassTests<Interceptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.Interceptor]

    @Override
    public Class<Interceptor> createNewSUT() {
        return Interceptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.Interceptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.Interceptor]

}
