package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_INOUT;

@RunWith(J8Unit4.class)
public class ARG_INOUTTest
implements org.j8unit.repository.org.omg.CORBA.ARG_INOUTTests<ARG_INOUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_INOUT]

    @Override
    public ARG_INOUT createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ARG_INOUT], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_INOUT]

}
