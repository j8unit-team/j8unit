package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.NON_EXISTENT;

@RunWith(J8Unit4.class)
public class NON_EXISTENTTest
implements org.j8unit.repository.org.omg.PortableInterceptor.NON_EXISTENTTests<NON_EXISTENT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.NON_EXISTENT]

    @Override
    public NON_EXISTENT createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.NON_EXISTENT], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.NON_EXISTENT]

}
