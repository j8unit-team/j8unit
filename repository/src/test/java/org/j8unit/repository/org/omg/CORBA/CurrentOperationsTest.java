package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.CurrentOperations;

@RunWith(J8Unit4.class)
public class CurrentOperationsTest
implements org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<CurrentOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CurrentOperations]

    @Override
    public CurrentOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.CurrentOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.CurrentOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.CurrentOperations]

}
