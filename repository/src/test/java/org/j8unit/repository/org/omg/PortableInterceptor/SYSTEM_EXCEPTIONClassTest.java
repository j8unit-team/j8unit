package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SYSTEM_EXCEPTION} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.SYSTEM_EXCEPTIONClassTests}).
 */
@RunWith(J8Unit4.class)
public class SYSTEM_EXCEPTIONClassTest
implements SYSTEM_EXCEPTIONClassTests<SYSTEM_EXCEPTION> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

    @Override
    public Class<SYSTEM_EXCEPTION> createNewSUT() {
        return SYSTEM_EXCEPTION.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

}
