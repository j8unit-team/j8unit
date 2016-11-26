package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link USER_EXCEPTION} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.USER_EXCEPTIONClassTests}).
 */
@RunWith(J8Unit4.class)
public class USER_EXCEPTIONClassTest
implements USER_EXCEPTIONClassTests<USER_EXCEPTION> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.USER_EXCEPTION]

    @Override
    public Class<USER_EXCEPTION> createNewSUT() {
        return USER_EXCEPTION.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.USER_EXCEPTION]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.USER_EXCEPTION]

}
