package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY;

@RunWith(J8Unit4.class)
public class BAD_POLICYTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICYTests<BAD_POLICY> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.BAD_POLICY]

    @Override
    public BAD_POLICY createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.BAD_POLICY], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.BAD_POLICY]

}
