package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfo;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ORBInitInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class ORBInitInfoClassTest
implements ORBInitInfoClassTests<ORBInitInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfo]

    @Override
    public Class<ORBInitInfo> createNewSUT() {
        return ORBInitInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfo]

}
