package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link USER_EXCEPTION} (by simply reusing
 * the J8Unit test interface {@link USER_EXCEPTIONTests}).
 */

@RunWith(J8Unit4.class)
public class USER_EXCEPTIONTest
implements USER_EXCEPTIONTests<USER_EXCEPTION> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.USER_EXCEPTION]

    @Override
    public USER_EXCEPTION createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.USER_EXCEPTION], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.USER_EXCEPTION]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.USER_EXCEPTION]

}
