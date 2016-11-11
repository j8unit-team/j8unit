package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.IORInfoOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IORInfoOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInfoOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class IORInfoOperationsClassTest
implements IORInfoOperationsClassTests<IORInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.IORInfoOperations]

    @Override
    public Class<IORInfoOperations> createNewSUT() {
        return IORInfoOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.IORInfoOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.IORInfoOperations]

}
