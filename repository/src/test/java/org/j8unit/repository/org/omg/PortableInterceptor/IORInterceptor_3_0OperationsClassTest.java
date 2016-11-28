package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.IORInterceptor_3_0Operations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IORInterceptor_3_0Operations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0OperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class IORInterceptor_3_0OperationsClassTest
implements IORInterceptor_3_0OperationsClassTests<IORInterceptor_3_0Operations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor_3_0Operations]

    @Override
    public Class<IORInterceptor_3_0Operations> createNewSUT() {
        return IORInterceptor_3_0Operations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor_3_0Operations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.IORInterceptor_3_0Operations]

}
