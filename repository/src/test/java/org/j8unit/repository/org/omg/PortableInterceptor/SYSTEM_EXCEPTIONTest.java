package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

@RunWith(J8Unit4.class)
public class SYSTEM_EXCEPTIONTest
implements org.j8unit.repository.org.omg.PortableInterceptor.SYSTEM_EXCEPTIONTests<SYSTEM_EXCEPTION> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

    @Override
    public SYSTEM_EXCEPTION createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.SYSTEM_EXCEPTION], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.SYSTEM_EXCEPTION]

}
