package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UNSUPPORTED_POLICY;

@RunWith(J8Unit4.class)
public class UNSUPPORTED_POLICYTest
implements org.j8unit.repository.org.omg.CORBA.UNSUPPORTED_POLICYTests<UNSUPPORTED_POLICY> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY]

    @Override
    public UNSUPPORTED_POLICY createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UNSUPPORTED_POLICY], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY]

}
