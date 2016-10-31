package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_IN;

@RunWith(J8Unit4.class)
public class ARG_INTest
implements org.j8unit.repository.org.omg.CORBA.ARG_INTests<ARG_IN> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_IN]

    @Override
    public ARG_IN createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ARG_IN], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ARG_IN]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ARG_IN]

}
