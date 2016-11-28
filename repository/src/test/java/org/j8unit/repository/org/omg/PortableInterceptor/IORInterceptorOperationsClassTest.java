package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.IORInterceptorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IORInterceptorOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class IORInterceptorOperationsClassTest
implements IORInterceptorOperationsClassTests<IORInterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptorOperations]

    @Override
    public Class<IORInterceptorOperations> createNewSUT() {
        return IORInterceptorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptorOperations]

}
