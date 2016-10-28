package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_OUT;

@RunWith(J8Unit4.class)
public class ARG_OUTTest
implements org.j8unit.repository.org.omg.CORBA.ARG_OUTTests<ARG_OUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_OUT]

    @Override
    public ARG_OUT createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ARG_OUT], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_OUT]

}
